## Get the gateway running

1. Start java server
```gradle -PmainClass=ContactsApiServer runApp``` (or in intellij, run main on ```CustomFieldServer.java```)
2. Run the go proxy 
```go run entry.go```
3. curl the rest proxy endpoints (below)


## Sample Endpoint requests
*Documentation: https://cloud.google.com/endpoints/docs/grpc-service-config/reference/rpc/google.api*)

### Create Custom Field

*// TODO: Why when asking for type TEXT, it doesn't return the label?
// Is that by default for default or first values?*

```
curl -X POST -d '{"label": "a label", "name": "a name", "type": "DATE_TIME"}' http://localhost:8080/v1/customfields
```

Response:
```json
{
    "name":"a name",
    "type":"DATE_TIME",
    "label":"a label"
}
```

### Get Custom Field

*// TODO: Test params*

```
curl -X GET http://localhost:8080/v1/customfields/12
```

Response:
```json
{
    "name": "FieldName",
    "label":"Field Label"
}
```

### List Custom Fields

*// TODO: Test params*

```
curl -X GET http://localhost:8080/v1/customfields
```

Response:
```json
{
    "count": 25,
    "custom_fields": [
        {
            "label": "Favorite Color",
            "name": "fav_color"
        },
        {
            "label": "Favorite day",
            "name": "fav_day",
            "type": "DATE_TIME"
        }
    ]
}
```

### List fields with mask
```
curl -X http://localhost:8080/v1/customfields\?field_mask.paths\=id\&field_mask.paths\=name
```

Response:
```
{
    "count":25
    "custom_fields": [
        {
            "name": "fav_color",
            "id":"3214"
        },
        {
            "name": "fav_day",
            "id":"8849"
        }
    ]
}
```


### Update Custom Field

*// NOTE: type also is left out if it's set to TEXT*

```
curl -X PATCH -d '{"name": "my name"}' http://localhost:8080/v1/customfields/1
```

Response:
```json
{
    "name":"1",
    "label":"Field Label"
}
```

### Create Company

```
curl -X POST -d '{"name": "Jill Shipping Co."}' http://localhost:8080/v1/companies
```

Response:
```json
{
    "id": "1234",
    "name":"Jill Shipping Co.",
    "version":1
}
```

### Get Company

```
curl http://localhost:8080/v1/companies/12
```

Response:
```
{"id":"12","name":"The Biz LLC","version":4}
```


### List Companies

```
curl http://localhost:8080/v1/companies
```

Response:
```
{"companies":[{"id":"1234","name":"Bob's Builders","version":1},{"id":"4472","name":"Sara's Sandwhich Shop","version":1}]}
```


### Update Company

```
curl -X PATCH -d '{"name": "Updated Co name."}' http://localhost:8080/v1/companies/1223
```

Response
```
{
    "id": "1223",
    "version": 2
}
```

### Delete Company

```
curl -X DELETE http://localhost:8080/v1/companies/1223
```

# Original steps to create

Create gradle project in intellij

Add java grpc gradle settings via https://github.com/grpc/grpc-java
*Ensure protobuf-gradle-plugin is at latest release, check https://github.com/google/protobuf-gradle-plugin/releases*


Create dummy proto file

Run gradle Task other/generateProto
- This creates build/generated/source/proto/main...
- The files in generated/source/proto/main/java/com/proto/dumby appear 
    to be exactly the same as running ```protoc --proto_path=src/main/proto --java_out=build src/main/proto/dummy.proto```
    It created
        - Dummy.java, DummyMessage.java and DummyMessageOrBuilder.java
- **Additionally creates a grpc dir with a ```DummyServiceGrpc.java/GreetServiceGrpc.java``` file.** 
  - This has a grpc service class with stubs
    (This is one of the missing pieces the command doesn't run. It *might* be connected to.... [what was the project?])
    
```bash
protoc --plugin=protoc-gen-grpc-java=build/exe/java_plugin/protoc-gen-grpc-java \
--grpc-java_out=build --proto_path=src/main/proto src/main/proto/dummy.proto
```

    
    

Create Java server (GreetServiceImpl.java) that implements a io.grpc.Server (GreetingServer.java)
- Create Client (make sure you run gw generateProto before)
- Run Server, run Client, watch hello message result


## Creating the gateway

Install go: ```brew install go```, ```export PATH="$PATH:$GOPATH/bin"```


Install go dependencies
```
go get -u github.com/grpc-ecosystem/grpc-gateway/protoc-gen-grpc-gateway
go get -u github.com/grpc-ecosystem/grpc-gateway/protoc-gen-swagger
go get -u github.com/golang/protobuf/protoc-gen-go
```

Note: Right now I copied the annotations.proto and http.proto into the project from the grpc-gateway
go installation. 

Generate go server (pb.go)

```
protoc -I/usr/local/include -I. \
  -I$GOPATH/src \
  -I$GOPATH/src/github.com/grpc-ecosystem/grpc-gateway/third_party/googleapis \
  --plugin=protoc-gen-go=$GOPATH/bin/protoc-gen-go \
  --go_out=plugins=grpc:. \
  ./src/main/proto/contactsapi/customfield/customfieldschema.proto
```

Create the proxy pb.gw.go file:

```
protoc -I/usr/local/include -I. \
  -I$GOPATH/src \
  -I$GOPATH/src/github.com/grpc-ecosystem/grpc-gateway/third_party/googleapis \
  --plugin=protoc-gen-grpc-gateway=$GOPATH/bin/protoc-gen-grpc-gateway  \
  --grpc-gateway_out=logtostderr=true:. \
  ./src/main/proto/contactsapi/customfield/customfieldschema.proto
```

// Generate swagger (not needed for proxy)
```
protoc -I/usr/local/include -I. \
  -I$GOPATH/src \
  -I$GOPATH/src/github.com/grpc-ecosystem/grpc-gateway/third_party/googleapis \
  --plugin=protoc-gen-swagger=$GOPATH/bin/protoc-gen-go \
  --swagger_out=logtostderr=true:. \
  ./src/main/proto/greet/greet.proto
```

NOTE: GreetingServer.java sets the port for the gRPC server ServerBuilder.forPort(50051)
9090
entry.go sets ```echoEndpoint = flag.String("echo_endpoint", "localhost:9090", "endpoint of YourService")```
That was changed to gRPC server port ```50051``` (from the grpc-gateway repo)


