package contactsapi.company.server;

import com.google.protobuf.Empty;
import contactsapi.company.CompanyResponse;
import contactsapi.company.CompanyServiceGrpc;
import contactsapi.company.CreateCompanyRequest;
import contactsapi.company.DeleteCompanyRequest;
import contactsapi.company.GetCompanyRequest;
import contactsapi.company.ListCompaniesRequest;
import contactsapi.company.ListCompaniesResponse;
import contactsapi.company.UpdateCompanyRequest;
import io.grpc.stub.StreamObserver;

public class CompanyServiceImpl extends CompanyServiceGrpc.CompanyServiceImplBase {
  @Override
  public void createCompany(CreateCompanyRequest request, StreamObserver<CompanyResponse> responseObserver) {
    CompanyResponse response = CompanyResponse.newBuilder()
        .setId("1234")
        .setName(request.getName())
        .setVersion(1)
        .build();

    // Send the response
    responseObserver.onNext(response);
    // Complete the RPC call
    responseObserver.onCompleted();
  }

  @Override
  public void getCompany(GetCompanyRequest request, StreamObserver<CompanyResponse> responseObserver) {
    CompanyResponse response = CompanyResponse.newBuilder()
        .setId(request.getId())
        .setName("The Biz LLC")
        .setVersion(4)
        .build();

    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void listCompanies(ListCompaniesRequest request, StreamObserver<ListCompaniesResponse> responseObserver) {
    ListCompaniesResponse response = ListCompaniesResponse.newBuilder()
        .setCount(15)
        .addCompanies(CompanyResponse.newBuilder()
            .setId("1234")
            .setName("Bob's Builders")
            .setVersion(1)
            .build())
        .addCompanies(CompanyResponse.newBuilder()
            .setId("4472")
            .setName("Sara's Sandwhich Shop")
            .setVersion(1)
            .build())
        .build();

    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void updateCompany(UpdateCompanyRequest request, StreamObserver<CompanyResponse> responseObserver) {
    CompanyResponse response = CompanyResponse.newBuilder()
        .setId("123")
        .setName(request.getName())
        .setVersion(2)
        .build();

    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void deleteCompany(DeleteCompanyRequest request, StreamObserver<Empty> responseObserver) {
    responseObserver.onNext(Empty.getDefaultInstance());
    responseObserver.onCompleted();
  }
}
