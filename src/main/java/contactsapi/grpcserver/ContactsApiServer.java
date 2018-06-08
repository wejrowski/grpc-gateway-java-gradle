package contactsapi.grpcserver;

import contactsapi.company.server.CompanyServiceImpl;
import contactsapi.customfield.server.CustomFieldServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class ContactsApiServer {
  public static void main(String[] args) throws IOException, InterruptedException {
    System.out.println("Hello gRPC");

    Server server = ServerBuilder.forPort(50051)
        .addService(new CustomFieldServiceImpl())
        .addService(new CompanyServiceImpl())
        .build();

    server.start();

    Runtime.getRuntime().addShutdownHook(new Thread(() -> {
      System.out.println("Received Shutdown Request");
      server.shutdown();
      System.out.println("Successfully stopped server");
    }));

    // Block main thread until terminated
    server.awaitTermination();
  }
}
