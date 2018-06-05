package contactsapi.customfield;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.12.0)",
    comments = "Source: contactsapi/customfieldschema.proto")
public final class CustomFieldServiceGrpc {

  private CustomFieldServiceGrpc() {}

  public static final String SERVICE_NAME = "contactsapi.customfield.CustomFieldService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateCustomFieldMethod()} instead. 
  public static final io.grpc.MethodDescriptor<contactsapi.customfield.CustomFieldRequest,
      contactsapi.customfield.CustomField> METHOD_CREATE_CUSTOM_FIELD = getCreateCustomFieldMethodHelper();

  private static volatile io.grpc.MethodDescriptor<contactsapi.customfield.CustomFieldRequest,
      contactsapi.customfield.CustomField> getCreateCustomFieldMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<contactsapi.customfield.CustomFieldRequest,
      contactsapi.customfield.CustomField> getCreateCustomFieldMethod() {
    return getCreateCustomFieldMethodHelper();
  }

  private static io.grpc.MethodDescriptor<contactsapi.customfield.CustomFieldRequest,
      contactsapi.customfield.CustomField> getCreateCustomFieldMethodHelper() {
    io.grpc.MethodDescriptor<contactsapi.customfield.CustomFieldRequest, contactsapi.customfield.CustomField> getCreateCustomFieldMethod;
    if ((getCreateCustomFieldMethod = CustomFieldServiceGrpc.getCreateCustomFieldMethod) == null) {
      synchronized (CustomFieldServiceGrpc.class) {
        if ((getCreateCustomFieldMethod = CustomFieldServiceGrpc.getCreateCustomFieldMethod) == null) {
          CustomFieldServiceGrpc.getCreateCustomFieldMethod = getCreateCustomFieldMethod = 
              io.grpc.MethodDescriptor.<contactsapi.customfield.CustomFieldRequest, contactsapi.customfield.CustomField>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "contactsapi.customfield.CustomFieldService", "CreateCustomField"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  contactsapi.customfield.CustomFieldRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  contactsapi.customfield.CustomField.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomFieldServiceMethodDescriptorSupplier("CreateCustomField"))
                  .build();
          }
        }
     }
     return getCreateCustomFieldMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListCustomFieldMethod()} instead. 
  public static final io.grpc.MethodDescriptor<contactsapi.customfield.CustomFieldRequest,
      contactsapi.customfield.CustomField> METHOD_LIST_CUSTOM_FIELD = getListCustomFieldMethodHelper();

  private static volatile io.grpc.MethodDescriptor<contactsapi.customfield.CustomFieldRequest,
      contactsapi.customfield.CustomField> getListCustomFieldMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<contactsapi.customfield.CustomFieldRequest,
      contactsapi.customfield.CustomField> getListCustomFieldMethod() {
    return getListCustomFieldMethodHelper();
  }

  private static io.grpc.MethodDescriptor<contactsapi.customfield.CustomFieldRequest,
      contactsapi.customfield.CustomField> getListCustomFieldMethodHelper() {
    io.grpc.MethodDescriptor<contactsapi.customfield.CustomFieldRequest, contactsapi.customfield.CustomField> getListCustomFieldMethod;
    if ((getListCustomFieldMethod = CustomFieldServiceGrpc.getListCustomFieldMethod) == null) {
      synchronized (CustomFieldServiceGrpc.class) {
        if ((getListCustomFieldMethod = CustomFieldServiceGrpc.getListCustomFieldMethod) == null) {
          CustomFieldServiceGrpc.getListCustomFieldMethod = getListCustomFieldMethod = 
              io.grpc.MethodDescriptor.<contactsapi.customfield.CustomFieldRequest, contactsapi.customfield.CustomField>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "contactsapi.customfield.CustomFieldService", "ListCustomField"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  contactsapi.customfield.CustomFieldRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  contactsapi.customfield.CustomField.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomFieldServiceMethodDescriptorSupplier("ListCustomField"))
                  .build();
          }
        }
     }
     return getListCustomFieldMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetCustomFieldMethod()} instead. 
  public static final io.grpc.MethodDescriptor<contactsapi.customfield.CustomFieldRequest,
      contactsapi.customfield.CustomField> METHOD_GET_CUSTOM_FIELD = getGetCustomFieldMethodHelper();

  private static volatile io.grpc.MethodDescriptor<contactsapi.customfield.CustomFieldRequest,
      contactsapi.customfield.CustomField> getGetCustomFieldMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<contactsapi.customfield.CustomFieldRequest,
      contactsapi.customfield.CustomField> getGetCustomFieldMethod() {
    return getGetCustomFieldMethodHelper();
  }

  private static io.grpc.MethodDescriptor<contactsapi.customfield.CustomFieldRequest,
      contactsapi.customfield.CustomField> getGetCustomFieldMethodHelper() {
    io.grpc.MethodDescriptor<contactsapi.customfield.CustomFieldRequest, contactsapi.customfield.CustomField> getGetCustomFieldMethod;
    if ((getGetCustomFieldMethod = CustomFieldServiceGrpc.getGetCustomFieldMethod) == null) {
      synchronized (CustomFieldServiceGrpc.class) {
        if ((getGetCustomFieldMethod = CustomFieldServiceGrpc.getGetCustomFieldMethod) == null) {
          CustomFieldServiceGrpc.getGetCustomFieldMethod = getGetCustomFieldMethod = 
              io.grpc.MethodDescriptor.<contactsapi.customfield.CustomFieldRequest, contactsapi.customfield.CustomField>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "contactsapi.customfield.CustomFieldService", "GetCustomField"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  contactsapi.customfield.CustomFieldRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  contactsapi.customfield.CustomField.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomFieldServiceMethodDescriptorSupplier("GetCustomField"))
                  .build();
          }
        }
     }
     return getGetCustomFieldMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUpdateCustomFieldMethod()} instead. 
  public static final io.grpc.MethodDescriptor<contactsapi.customfield.CustomFieldUpdateRequest,
      contactsapi.customfield.CustomField> METHOD_UPDATE_CUSTOM_FIELD = getUpdateCustomFieldMethodHelper();

  private static volatile io.grpc.MethodDescriptor<contactsapi.customfield.CustomFieldUpdateRequest,
      contactsapi.customfield.CustomField> getUpdateCustomFieldMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<contactsapi.customfield.CustomFieldUpdateRequest,
      contactsapi.customfield.CustomField> getUpdateCustomFieldMethod() {
    return getUpdateCustomFieldMethodHelper();
  }

  private static io.grpc.MethodDescriptor<contactsapi.customfield.CustomFieldUpdateRequest,
      contactsapi.customfield.CustomField> getUpdateCustomFieldMethodHelper() {
    io.grpc.MethodDescriptor<contactsapi.customfield.CustomFieldUpdateRequest, contactsapi.customfield.CustomField> getUpdateCustomFieldMethod;
    if ((getUpdateCustomFieldMethod = CustomFieldServiceGrpc.getUpdateCustomFieldMethod) == null) {
      synchronized (CustomFieldServiceGrpc.class) {
        if ((getUpdateCustomFieldMethod = CustomFieldServiceGrpc.getUpdateCustomFieldMethod) == null) {
          CustomFieldServiceGrpc.getUpdateCustomFieldMethod = getUpdateCustomFieldMethod = 
              io.grpc.MethodDescriptor.<contactsapi.customfield.CustomFieldUpdateRequest, contactsapi.customfield.CustomField>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "contactsapi.customfield.CustomFieldService", "UpdateCustomField"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  contactsapi.customfield.CustomFieldUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  contactsapi.customfield.CustomField.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomFieldServiceMethodDescriptorSupplier("UpdateCustomField"))
                  .build();
          }
        }
     }
     return getUpdateCustomFieldMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomFieldServiceStub newStub(io.grpc.Channel channel) {
    return new CustomFieldServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomFieldServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CustomFieldServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomFieldServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CustomFieldServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CustomFieldServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createCustomField(contactsapi.customfield.CustomFieldRequest request,
        io.grpc.stub.StreamObserver<contactsapi.customfield.CustomField> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateCustomFieldMethodHelper(), responseObserver);
    }

    /**
     */
    public void listCustomField(contactsapi.customfield.CustomFieldRequest request,
        io.grpc.stub.StreamObserver<contactsapi.customfield.CustomField> responseObserver) {
      asyncUnimplementedUnaryCall(getListCustomFieldMethodHelper(), responseObserver);
    }

    /**
     */
    public void getCustomField(contactsapi.customfield.CustomFieldRequest request,
        io.grpc.stub.StreamObserver<contactsapi.customfield.CustomField> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCustomFieldMethodHelper(), responseObserver);
    }

    /**
     */
    public void updateCustomField(contactsapi.customfield.CustomFieldUpdateRequest request,
        io.grpc.stub.StreamObserver<contactsapi.customfield.CustomField> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateCustomFieldMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateCustomFieldMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                contactsapi.customfield.CustomFieldRequest,
                contactsapi.customfield.CustomField>(
                  this, METHODID_CREATE_CUSTOM_FIELD)))
          .addMethod(
            getListCustomFieldMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                contactsapi.customfield.CustomFieldRequest,
                contactsapi.customfield.CustomField>(
                  this, METHODID_LIST_CUSTOM_FIELD)))
          .addMethod(
            getGetCustomFieldMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                contactsapi.customfield.CustomFieldRequest,
                contactsapi.customfield.CustomField>(
                  this, METHODID_GET_CUSTOM_FIELD)))
          .addMethod(
            getUpdateCustomFieldMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                contactsapi.customfield.CustomFieldUpdateRequest,
                contactsapi.customfield.CustomField>(
                  this, METHODID_UPDATE_CUSTOM_FIELD)))
          .build();
    }
  }

  /**
   */
  public static final class CustomFieldServiceStub extends io.grpc.stub.AbstractStub<CustomFieldServiceStub> {
    private CustomFieldServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomFieldServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomFieldServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomFieldServiceStub(channel, callOptions);
    }

    /**
     */
    public void createCustomField(contactsapi.customfield.CustomFieldRequest request,
        io.grpc.stub.StreamObserver<contactsapi.customfield.CustomField> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateCustomFieldMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listCustomField(contactsapi.customfield.CustomFieldRequest request,
        io.grpc.stub.StreamObserver<contactsapi.customfield.CustomField> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListCustomFieldMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCustomField(contactsapi.customfield.CustomFieldRequest request,
        io.grpc.stub.StreamObserver<contactsapi.customfield.CustomField> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCustomFieldMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCustomField(contactsapi.customfield.CustomFieldUpdateRequest request,
        io.grpc.stub.StreamObserver<contactsapi.customfield.CustomField> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateCustomFieldMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CustomFieldServiceBlockingStub extends io.grpc.stub.AbstractStub<CustomFieldServiceBlockingStub> {
    private CustomFieldServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomFieldServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomFieldServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomFieldServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public contactsapi.customfield.CustomField createCustomField(contactsapi.customfield.CustomFieldRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateCustomFieldMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public contactsapi.customfield.CustomField listCustomField(contactsapi.customfield.CustomFieldRequest request) {
      return blockingUnaryCall(
          getChannel(), getListCustomFieldMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public contactsapi.customfield.CustomField getCustomField(contactsapi.customfield.CustomFieldRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCustomFieldMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public contactsapi.customfield.CustomField updateCustomField(contactsapi.customfield.CustomFieldUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateCustomFieldMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CustomFieldServiceFutureStub extends io.grpc.stub.AbstractStub<CustomFieldServiceFutureStub> {
    private CustomFieldServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomFieldServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomFieldServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomFieldServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<contactsapi.customfield.CustomField> createCustomField(
        contactsapi.customfield.CustomFieldRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateCustomFieldMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<contactsapi.customfield.CustomField> listCustomField(
        contactsapi.customfield.CustomFieldRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListCustomFieldMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<contactsapi.customfield.CustomField> getCustomField(
        contactsapi.customfield.CustomFieldRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCustomFieldMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<contactsapi.customfield.CustomField> updateCustomField(
        contactsapi.customfield.CustomFieldUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateCustomFieldMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CUSTOM_FIELD = 0;
  private static final int METHODID_LIST_CUSTOM_FIELD = 1;
  private static final int METHODID_GET_CUSTOM_FIELD = 2;
  private static final int METHODID_UPDATE_CUSTOM_FIELD = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CustomFieldServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CustomFieldServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_CUSTOM_FIELD:
          serviceImpl.createCustomField((contactsapi.customfield.CustomFieldRequest) request,
              (io.grpc.stub.StreamObserver<contactsapi.customfield.CustomField>) responseObserver);
          break;
        case METHODID_LIST_CUSTOM_FIELD:
          serviceImpl.listCustomField((contactsapi.customfield.CustomFieldRequest) request,
              (io.grpc.stub.StreamObserver<contactsapi.customfield.CustomField>) responseObserver);
          break;
        case METHODID_GET_CUSTOM_FIELD:
          serviceImpl.getCustomField((contactsapi.customfield.CustomFieldRequest) request,
              (io.grpc.stub.StreamObserver<contactsapi.customfield.CustomField>) responseObserver);
          break;
        case METHODID_UPDATE_CUSTOM_FIELD:
          serviceImpl.updateCustomField((contactsapi.customfield.CustomFieldUpdateRequest) request,
              (io.grpc.stub.StreamObserver<contactsapi.customfield.CustomField>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CustomFieldServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomFieldServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return contactsapi.customfield.Customfieldschema.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CustomFieldService");
    }
  }

  private static final class CustomFieldServiceFileDescriptorSupplier
      extends CustomFieldServiceBaseDescriptorSupplier {
    CustomFieldServiceFileDescriptorSupplier() {}
  }

  private static final class CustomFieldServiceMethodDescriptorSupplier
      extends CustomFieldServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CustomFieldServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CustomFieldServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomFieldServiceFileDescriptorSupplier())
              .addMethod(getCreateCustomFieldMethodHelper())
              .addMethod(getListCustomFieldMethodHelper())
              .addMethod(getGetCustomFieldMethodHelper())
              .addMethod(getUpdateCustomFieldMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
