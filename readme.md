# Steps

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
    Gradle however created a grpc dir with a ```DummyServiceGrpc.java``` file