package contactsapi.customfield.server;

import contactsapi.customfield.CreateCustomFieldRequest;
import contactsapi.customfield.CustomField;
import contactsapi.customfield.CustomFieldServiceGrpc;
import contactsapi.customfield.GetCustomFieldRequest;
import contactsapi.customfield.ListCustomFieldsRequest;
import contactsapi.customfield.ListCustomFieldsResponse;
import contactsapi.customfield.UpdateCustomFieldRequest;
import io.grpc.stub.StreamObserver;

public class CustomFieldServiceImpl extends CustomFieldServiceGrpc.CustomFieldServiceImplBase {
  @Override
  public void createCustomField(CreateCustomFieldRequest request, StreamObserver<CustomField> responseObserver) {
    // Create response
    CustomField response = CustomField.newBuilder()
        .setId("1000")
        .setLabel(request.getLabel())
        .setName(request.getName())
        // TODO: WHy isn't this responding?
        .setType(CustomField.Type.valueOf(request.getType().toString()))
        .build();

    // Send the response
    responseObserver.onNext(response);

    // Complete the RPC call
    responseObserver.onCompleted();
  }

  @Override
  public void listCustomFields(ListCustomFieldsRequest request, StreamObserver<ListCustomFieldsResponse> responseObserver) {
    CustomField customField1 = CustomField.newBuilder()
            .setId("3214")
            .setLabel("Favorite Color")
            .setName("fav_color")
            .setType(CustomField.Type.TEXT)
            .build();

    CustomField customField2 = CustomField.newBuilder()
        .setId("8849")
        .setLabel("Favorite day")
        .setName("fav_day")
        .setType(CustomField.Type.DATE_TIME)
        .build();

    ListCustomFieldsResponse response = ListCustomFieldsResponse.newBuilder()
        .setCount(25)
        .addCustomFields(customField1)
        .addCustomFields(customField2)
        .build();
    // Send the response
    responseObserver.onNext(response);

    // Complete the RPC call
    responseObserver.onCompleted();
  }

  @Override
  public void getCustomField(GetCustomFieldRequest request, StreamObserver<CustomField> responseObserver) {
    // Create response
    CustomField response = CustomField.newBuilder()
        .setId(request.getId())
        .setLabel("Field Label")
        .setName("FieldName")
        .setType(CustomField.Type.PHONE_NUMBER)
        .build();

    // Send the response
    responseObserver.onNext(response);

    // Complete the RPC call
    responseObserver.onCompleted();
  }

  @Override
  public void updateCustomField(UpdateCustomFieldRequest request, StreamObserver<CustomField> responseObserver) {
    // Create response
    CustomField response = CustomField.newBuilder()
        .setId(request.getId())
        .setLabel("Field Label")
        .setName(request.getName())
        .setType(CustomField.Type.EMAIL)
        .build();

    // Send the response
    responseObserver.onNext(response);

    // Complete the RPC call
    responseObserver.onCompleted();
  }
}
