package contactsapi.company;

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
    comments = "Source: contactsapi/company/companies.proto")
public final class CompanyServiceGrpc {

  private CompanyServiceGrpc() {}

  public static final String SERVICE_NAME = "contactsapi.company.CompanyService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateCompanyMethod()} instead. 
  public static final io.grpc.MethodDescriptor<contactsapi.company.CreateCompanyRequest,
      contactsapi.company.CompanyResponse> METHOD_CREATE_COMPANY = getCreateCompanyMethodHelper();

  private static volatile io.grpc.MethodDescriptor<contactsapi.company.CreateCompanyRequest,
      contactsapi.company.CompanyResponse> getCreateCompanyMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<contactsapi.company.CreateCompanyRequest,
      contactsapi.company.CompanyResponse> getCreateCompanyMethod() {
    return getCreateCompanyMethodHelper();
  }

  private static io.grpc.MethodDescriptor<contactsapi.company.CreateCompanyRequest,
      contactsapi.company.CompanyResponse> getCreateCompanyMethodHelper() {
    io.grpc.MethodDescriptor<contactsapi.company.CreateCompanyRequest, contactsapi.company.CompanyResponse> getCreateCompanyMethod;
    if ((getCreateCompanyMethod = CompanyServiceGrpc.getCreateCompanyMethod) == null) {
      synchronized (CompanyServiceGrpc.class) {
        if ((getCreateCompanyMethod = CompanyServiceGrpc.getCreateCompanyMethod) == null) {
          CompanyServiceGrpc.getCreateCompanyMethod = getCreateCompanyMethod = 
              io.grpc.MethodDescriptor.<contactsapi.company.CreateCompanyRequest, contactsapi.company.CompanyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "contactsapi.company.CompanyService", "CreateCompany"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  contactsapi.company.CreateCompanyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  contactsapi.company.CompanyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompanyServiceMethodDescriptorSupplier("CreateCompany"))
                  .build();
          }
        }
     }
     return getCreateCompanyMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetCompanyMethod()} instead. 
  public static final io.grpc.MethodDescriptor<contactsapi.company.GetCompanyRequest,
      contactsapi.company.CompanyResponse> METHOD_GET_COMPANY = getGetCompanyMethodHelper();

  private static volatile io.grpc.MethodDescriptor<contactsapi.company.GetCompanyRequest,
      contactsapi.company.CompanyResponse> getGetCompanyMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<contactsapi.company.GetCompanyRequest,
      contactsapi.company.CompanyResponse> getGetCompanyMethod() {
    return getGetCompanyMethodHelper();
  }

  private static io.grpc.MethodDescriptor<contactsapi.company.GetCompanyRequest,
      contactsapi.company.CompanyResponse> getGetCompanyMethodHelper() {
    io.grpc.MethodDescriptor<contactsapi.company.GetCompanyRequest, contactsapi.company.CompanyResponse> getGetCompanyMethod;
    if ((getGetCompanyMethod = CompanyServiceGrpc.getGetCompanyMethod) == null) {
      synchronized (CompanyServiceGrpc.class) {
        if ((getGetCompanyMethod = CompanyServiceGrpc.getGetCompanyMethod) == null) {
          CompanyServiceGrpc.getGetCompanyMethod = getGetCompanyMethod = 
              io.grpc.MethodDescriptor.<contactsapi.company.GetCompanyRequest, contactsapi.company.CompanyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "contactsapi.company.CompanyService", "GetCompany"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  contactsapi.company.GetCompanyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  contactsapi.company.CompanyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompanyServiceMethodDescriptorSupplier("GetCompany"))
                  .build();
          }
        }
     }
     return getGetCompanyMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListCompaniesMethod()} instead. 
  public static final io.grpc.MethodDescriptor<contactsapi.company.ListCompaniesRequest,
      contactsapi.company.ListCompaniesResponse> METHOD_LIST_COMPANIES = getListCompaniesMethodHelper();

  private static volatile io.grpc.MethodDescriptor<contactsapi.company.ListCompaniesRequest,
      contactsapi.company.ListCompaniesResponse> getListCompaniesMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<contactsapi.company.ListCompaniesRequest,
      contactsapi.company.ListCompaniesResponse> getListCompaniesMethod() {
    return getListCompaniesMethodHelper();
  }

  private static io.grpc.MethodDescriptor<contactsapi.company.ListCompaniesRequest,
      contactsapi.company.ListCompaniesResponse> getListCompaniesMethodHelper() {
    io.grpc.MethodDescriptor<contactsapi.company.ListCompaniesRequest, contactsapi.company.ListCompaniesResponse> getListCompaniesMethod;
    if ((getListCompaniesMethod = CompanyServiceGrpc.getListCompaniesMethod) == null) {
      synchronized (CompanyServiceGrpc.class) {
        if ((getListCompaniesMethod = CompanyServiceGrpc.getListCompaniesMethod) == null) {
          CompanyServiceGrpc.getListCompaniesMethod = getListCompaniesMethod = 
              io.grpc.MethodDescriptor.<contactsapi.company.ListCompaniesRequest, contactsapi.company.ListCompaniesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "contactsapi.company.CompanyService", "ListCompanies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  contactsapi.company.ListCompaniesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  contactsapi.company.ListCompaniesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompanyServiceMethodDescriptorSupplier("ListCompanies"))
                  .build();
          }
        }
     }
     return getListCompaniesMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUpdateCompanyMethod()} instead. 
  public static final io.grpc.MethodDescriptor<contactsapi.company.UpdateCompanyRequest,
      contactsapi.company.CompanyResponse> METHOD_UPDATE_COMPANY = getUpdateCompanyMethodHelper();

  private static volatile io.grpc.MethodDescriptor<contactsapi.company.UpdateCompanyRequest,
      contactsapi.company.CompanyResponse> getUpdateCompanyMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<contactsapi.company.UpdateCompanyRequest,
      contactsapi.company.CompanyResponse> getUpdateCompanyMethod() {
    return getUpdateCompanyMethodHelper();
  }

  private static io.grpc.MethodDescriptor<contactsapi.company.UpdateCompanyRequest,
      contactsapi.company.CompanyResponse> getUpdateCompanyMethodHelper() {
    io.grpc.MethodDescriptor<contactsapi.company.UpdateCompanyRequest, contactsapi.company.CompanyResponse> getUpdateCompanyMethod;
    if ((getUpdateCompanyMethod = CompanyServiceGrpc.getUpdateCompanyMethod) == null) {
      synchronized (CompanyServiceGrpc.class) {
        if ((getUpdateCompanyMethod = CompanyServiceGrpc.getUpdateCompanyMethod) == null) {
          CompanyServiceGrpc.getUpdateCompanyMethod = getUpdateCompanyMethod = 
              io.grpc.MethodDescriptor.<contactsapi.company.UpdateCompanyRequest, contactsapi.company.CompanyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "contactsapi.company.CompanyService", "UpdateCompany"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  contactsapi.company.UpdateCompanyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  contactsapi.company.CompanyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompanyServiceMethodDescriptorSupplier("UpdateCompany"))
                  .build();
          }
        }
     }
     return getUpdateCompanyMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteCompanyMethod()} instead. 
  public static final io.grpc.MethodDescriptor<contactsapi.company.DeleteCompanyRequest,
      com.google.protobuf.Empty> METHOD_DELETE_COMPANY = getDeleteCompanyMethodHelper();

  private static volatile io.grpc.MethodDescriptor<contactsapi.company.DeleteCompanyRequest,
      com.google.protobuf.Empty> getDeleteCompanyMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<contactsapi.company.DeleteCompanyRequest,
      com.google.protobuf.Empty> getDeleteCompanyMethod() {
    return getDeleteCompanyMethodHelper();
  }

  private static io.grpc.MethodDescriptor<contactsapi.company.DeleteCompanyRequest,
      com.google.protobuf.Empty> getDeleteCompanyMethodHelper() {
    io.grpc.MethodDescriptor<contactsapi.company.DeleteCompanyRequest, com.google.protobuf.Empty> getDeleteCompanyMethod;
    if ((getDeleteCompanyMethod = CompanyServiceGrpc.getDeleteCompanyMethod) == null) {
      synchronized (CompanyServiceGrpc.class) {
        if ((getDeleteCompanyMethod = CompanyServiceGrpc.getDeleteCompanyMethod) == null) {
          CompanyServiceGrpc.getDeleteCompanyMethod = getDeleteCompanyMethod = 
              io.grpc.MethodDescriptor.<contactsapi.company.DeleteCompanyRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "contactsapi.company.CompanyService", "DeleteCompany"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  contactsapi.company.DeleteCompanyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new CompanyServiceMethodDescriptorSupplier("DeleteCompany"))
                  .build();
          }
        }
     }
     return getDeleteCompanyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CompanyServiceStub newStub(io.grpc.Channel channel) {
    return new CompanyServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CompanyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CompanyServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CompanyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CompanyServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CompanyServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createCompany(contactsapi.company.CreateCompanyRequest request,
        io.grpc.stub.StreamObserver<contactsapi.company.CompanyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateCompanyMethodHelper(), responseObserver);
    }

    /**
     */
    public void getCompany(contactsapi.company.GetCompanyRequest request,
        io.grpc.stub.StreamObserver<contactsapi.company.CompanyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCompanyMethodHelper(), responseObserver);
    }

    /**
     */
    public void listCompanies(contactsapi.company.ListCompaniesRequest request,
        io.grpc.stub.StreamObserver<contactsapi.company.ListCompaniesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListCompaniesMethodHelper(), responseObserver);
    }

    /**
     */
    public void updateCompany(contactsapi.company.UpdateCompanyRequest request,
        io.grpc.stub.StreamObserver<contactsapi.company.CompanyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateCompanyMethodHelper(), responseObserver);
    }

    /**
     */
    public void deleteCompany(contactsapi.company.DeleteCompanyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteCompanyMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateCompanyMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                contactsapi.company.CreateCompanyRequest,
                contactsapi.company.CompanyResponse>(
                  this, METHODID_CREATE_COMPANY)))
          .addMethod(
            getGetCompanyMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                contactsapi.company.GetCompanyRequest,
                contactsapi.company.CompanyResponse>(
                  this, METHODID_GET_COMPANY)))
          .addMethod(
            getListCompaniesMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                contactsapi.company.ListCompaniesRequest,
                contactsapi.company.ListCompaniesResponse>(
                  this, METHODID_LIST_COMPANIES)))
          .addMethod(
            getUpdateCompanyMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                contactsapi.company.UpdateCompanyRequest,
                contactsapi.company.CompanyResponse>(
                  this, METHODID_UPDATE_COMPANY)))
          .addMethod(
            getDeleteCompanyMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                contactsapi.company.DeleteCompanyRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_COMPANY)))
          .build();
    }
  }

  /**
   */
  public static final class CompanyServiceStub extends io.grpc.stub.AbstractStub<CompanyServiceStub> {
    private CompanyServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CompanyServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompanyServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CompanyServiceStub(channel, callOptions);
    }

    /**
     */
    public void createCompany(contactsapi.company.CreateCompanyRequest request,
        io.grpc.stub.StreamObserver<contactsapi.company.CompanyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateCompanyMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCompany(contactsapi.company.GetCompanyRequest request,
        io.grpc.stub.StreamObserver<contactsapi.company.CompanyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCompanyMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listCompanies(contactsapi.company.ListCompaniesRequest request,
        io.grpc.stub.StreamObserver<contactsapi.company.ListCompaniesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListCompaniesMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCompany(contactsapi.company.UpdateCompanyRequest request,
        io.grpc.stub.StreamObserver<contactsapi.company.CompanyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateCompanyMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCompany(contactsapi.company.DeleteCompanyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteCompanyMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CompanyServiceBlockingStub extends io.grpc.stub.AbstractStub<CompanyServiceBlockingStub> {
    private CompanyServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CompanyServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompanyServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CompanyServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public contactsapi.company.CompanyResponse createCompany(contactsapi.company.CreateCompanyRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateCompanyMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public contactsapi.company.CompanyResponse getCompany(contactsapi.company.GetCompanyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCompanyMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public contactsapi.company.ListCompaniesResponse listCompanies(contactsapi.company.ListCompaniesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListCompaniesMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public contactsapi.company.CompanyResponse updateCompany(contactsapi.company.UpdateCompanyRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateCompanyMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteCompany(contactsapi.company.DeleteCompanyRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteCompanyMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CompanyServiceFutureStub extends io.grpc.stub.AbstractStub<CompanyServiceFutureStub> {
    private CompanyServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CompanyServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompanyServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CompanyServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<contactsapi.company.CompanyResponse> createCompany(
        contactsapi.company.CreateCompanyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateCompanyMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<contactsapi.company.CompanyResponse> getCompany(
        contactsapi.company.GetCompanyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCompanyMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<contactsapi.company.ListCompaniesResponse> listCompanies(
        contactsapi.company.ListCompaniesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListCompaniesMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<contactsapi.company.CompanyResponse> updateCompany(
        contactsapi.company.UpdateCompanyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateCompanyMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteCompany(
        contactsapi.company.DeleteCompanyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteCompanyMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_COMPANY = 0;
  private static final int METHODID_GET_COMPANY = 1;
  private static final int METHODID_LIST_COMPANIES = 2;
  private static final int METHODID_UPDATE_COMPANY = 3;
  private static final int METHODID_DELETE_COMPANY = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CompanyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CompanyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_COMPANY:
          serviceImpl.createCompany((contactsapi.company.CreateCompanyRequest) request,
              (io.grpc.stub.StreamObserver<contactsapi.company.CompanyResponse>) responseObserver);
          break;
        case METHODID_GET_COMPANY:
          serviceImpl.getCompany((contactsapi.company.GetCompanyRequest) request,
              (io.grpc.stub.StreamObserver<contactsapi.company.CompanyResponse>) responseObserver);
          break;
        case METHODID_LIST_COMPANIES:
          serviceImpl.listCompanies((contactsapi.company.ListCompaniesRequest) request,
              (io.grpc.stub.StreamObserver<contactsapi.company.ListCompaniesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_COMPANY:
          serviceImpl.updateCompany((contactsapi.company.UpdateCompanyRequest) request,
              (io.grpc.stub.StreamObserver<contactsapi.company.CompanyResponse>) responseObserver);
          break;
        case METHODID_DELETE_COMPANY:
          serviceImpl.deleteCompany((contactsapi.company.DeleteCompanyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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

  private static abstract class CompanyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CompanyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return contactsapi.company.Companies.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CompanyService");
    }
  }

  private static final class CompanyServiceFileDescriptorSupplier
      extends CompanyServiceBaseDescriptorSupplier {
    CompanyServiceFileDescriptorSupplier() {}
  }

  private static final class CompanyServiceMethodDescriptorSupplier
      extends CompanyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CompanyServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CompanyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CompanyServiceFileDescriptorSupplier())
              .addMethod(getCreateCompanyMethodHelper())
              .addMethod(getGetCompanyMethodHelper())
              .addMethod(getListCompaniesMethodHelper())
              .addMethod(getUpdateCompanyMethodHelper())
              .addMethod(getDeleteCompanyMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
