package com.wejrowski.grpc.greeting.client;

import com.proto.greet.GreetRequest;
import com.proto.greet.GreetResponse;
import com.proto.greet.GreetServiceGrpc;
import com.proto.greet.Greeting;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GreetingClient {
  public static void main(String[] args) {
    System.out.println("Hello I'm a gRPC client");

    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
        // Force SSL deactivation for development
        .usePlaintext()
        .build();

    System.out.println("Creating stub");

    // old
//    DummyServiceGrpc.DummyServiceBlockingStub syncClient = DummyServiceGrpc.newBlockingStub(channel);
//    DummyServiceGrpc.DummyServiceFutureStub asyncClient = DummyServiceGrpc.newFutureStub(channel);

    GreetServiceGrpc.GreetServiceBlockingStub greetClient = GreetServiceGrpc.newBlockingStub(channel);

    Greeting greeting = Greeting.newBuilder()
        .setFirstName("brent")
        .setLastName("wejrowski")
        .build();

    GreetRequest request = GreetRequest.newBuilder()
        .setGreeting(greeting)
        .build();

    GreetResponse greetResponse = greetClient.greet(request);

    System.out.println(greetResponse.getResult());

    // Do something
    System.out.println("Shutting down channel");
    channel.shutdown();
  }
}