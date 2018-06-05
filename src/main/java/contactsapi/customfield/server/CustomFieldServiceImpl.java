package contactsapi.customfield.server;

import contactsapi.customfield.CustomField;
import contactsapi.customfield.CustomFieldRequest;
import contactsapi.customfield.CustomFieldServiceGrpc;
import contactsapi.customfield.CustomFieldUpdateRequest;
import io.grpc.stub.StreamObserver;

public class CustomFieldServiceImpl extends CustomFieldServiceGrpc.CustomFieldServiceImplBase {
  @Override
  public void createCustomField(CustomFieldRequest request, StreamObserver<CustomField> responseObserver) {
    super.createCustomField(request, responseObserver);
  }

  @Override
  public void listCustomField(CustomFieldRequest request, StreamObserver<CustomField> responseObserver) {
    super.listCustomField(request, responseObserver);
  }

  @Override
  public void getCustomField(CustomFieldRequest request, StreamObserver<CustomField> responseObserver) {
    super.getCustomField(request, responseObserver);
  }

  @Override
  public void updateCustomField(CustomFieldUpdateRequest request, StreamObserver<CustomField> responseObserver) {
    super.updateCustomField(request, responseObserver);
  }
}
