## Get the gateway running

1. Start java server
```CustomFieldServer.java```
2. Run the go proxy 
```go run entry.go```
3. curl the rest proxy endpoints (below)


## Sample Endpoint requests
*Documentation: https://cloud.google.com/endpoints/docs/grpc-service-config/reference/rpc/google.api*)

### Create Custom Field

*// TODO: Why when asking for type TEXT, it doesn't return the label?
// Is that by default for default or first values?*

```curl -X POST -d '{"label": "a label", "name": "a name", "type": "DATE_TIME"}' -k http://localhost:8080/v1/customfields```

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

```curl -X GET -k http://localhost:8080/v1/customfields/12```

Response:
```json
{
    "name": "FieldName",
    "label":"Field Label"
}
```

### List Custom Field

*// TODO: Test params*

```curl -X GET -k http://localhost:8080/v1/customfields```

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


### Update Custom Field

*// NOTE: type also is left out if it's set to TEXT*

```curl -X PATCH -k -d '{"name": "my name"}' http://localhost:8080/v1/customfields/1```

Response:
```json
{
    "name":"1",
    "label":"Field Label"
}
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
  ./src/main/proto/contactsapi/customfieldschema.proto
```

Create the proxy pb.gw.go file:

```
protoc -I/usr/local/include -I. \
  -I$GOPATH/src \
  -I$GOPATH/src/github.com/grpc-ecosystem/grpc-gateway/third_party/googleapis \
  --plugin=protoc-gen-grpc-gateway=$GOPATH/bin/protoc-gen-grpc-gateway  \
  --grpc-gateway_out=logtostderr=true:. \
  ./src/main/proto/contactsapi/customfieldschema.proto
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

Run server (GreetingServer.java)
Run go ```go run entry.go```
- asks to allow connections
curl -X POST -k http://localhost:8080/v1/example/echo
{"error":"all SubConns are in TransientFailure, latest connection error: connection error:
desc = \"transport: Error while dialing dial tcp [::1]:9090: connect: connection refused\"","code":14}%

NOTE: GreetingServer.java sets the port for the gRPC server ServerBuilder.forPort(50051)
9090
entry.go sets ```echoEndpoint = flag.String("echo_endpoint", "localhost:9090", "endpoint of YourService")```
That was changed to gRPC server port ```50051``` (from the grpc-gateway repo)


