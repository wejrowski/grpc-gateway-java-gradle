package contactsapi.customfield.server;

import com.google.protobuf.Empty;
import contactsapi.customfield.CreateCustomFieldRequest;
import contactsapi.customfield.CustomField;
import contactsapi.customfield.CustomFieldServiceGrpc;
import contactsapi.customfield.DeleteCustomFieldRequest;
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

    CustomField.Builder customField1Builder = CustomField.newBuilder();
    CustomField.Builder customField2Builder = CustomField.newBuilder();


    if (request.getFieldMask().getPathsList().size() == 0 || request.getFieldMask().getPathsList().contains("id")) {
      customField1Builder.setId("3214");
      customField2Builder.setId("8849");
    }

    if (request.getFieldMask().getPathsList().size() == 0 || request.getFieldMask().getPathsList().contains("label")) {
      customField1Builder.setLabel("Favorite Color");
      customField2Builder.setLabel("Favorite day");
    }

    if (request.getFieldMask().getPathsList().size() == 0 || request.getFieldMask().getPathsList().contains("name")) {
      customField1Builder.setName("fav_color");
      customField2Builder.setName("fav_day");
    }

    if (request.getFieldMask().getPathsList().size() == 0 || request.getFieldMask().getPathsList().contains("type")) {
      customField1Builder.setType(CustomField.Type.TEXT);
      customField2Builder.setType(CustomField.Type.DATE_TIME);
    }

    customField1Builder.setId("maskCount:" + request.getFieldMask().getPathsCount());

    CustomField customField1 = customField1Builder.build();
    CustomField customField2 = customField2Builder.build();


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

  @Override
  public void deleteCustomField(DeleteCustomFieldRequest request, StreamObserver<Empty> responseObserver) {
    responseObserver.onNext(Empty.getDefaultInstance());
    responseObserver.onCompleted();
  }
}
