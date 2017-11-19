package sandglass;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: sandglass.proto")
public final class InternalServiceGrpc {

  private InternalServiceGrpc() {}

  public static final String SERVICE_NAME = "sandglass.InternalService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<sandglass.Sandglass.Message,
      sandglass.Sandglass.StoreLocallyReply> METHOD_STORE_MESSAGE_LOCALLY =
      io.grpc.MethodDescriptor.<sandglass.Sandglass.Message, sandglass.Sandglass.StoreLocallyReply>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "sandglass.InternalService", "StoreMessageLocally"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              sandglass.Sandglass.Message.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              sandglass.Sandglass.StoreLocallyReply.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<sandglass.Sandglass.GetRequest,
      sandglass.Sandglass.Message> METHOD_GET_BY_KEY =
      io.grpc.MethodDescriptor.<sandglass.Sandglass.GetRequest, sandglass.Sandglass.Message>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "sandglass.InternalService", "GetByKey"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              sandglass.Sandglass.GetRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              sandglass.Sandglass.Message.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<sandglass.Sandglass.GetRequest,
      sandglass.Sandglass.HasResponse> METHOD_HAS_KEY =
      io.grpc.MethodDescriptor.<sandglass.Sandglass.GetRequest, sandglass.Sandglass.HasResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "sandglass.InternalService", "HasKey"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              sandglass.Sandglass.GetRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              sandglass.Sandglass.HasResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<sandglass.Sandglass.FetchFromSyncRequest,
      sandglass.Sandglass.Message> METHOD_FETCH_FROM_SYNC =
      io.grpc.MethodDescriptor.<sandglass.Sandglass.FetchFromSyncRequest, sandglass.Sandglass.Message>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "sandglass.InternalService", "FetchFromSync"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              sandglass.Sandglass.FetchFromSyncRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              sandglass.Sandglass.Message.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<sandglass.Sandglass.LastOffsetRequest,
      sandglass.Sandglass.LastOffsetReply> METHOD_LAST_OFFSET =
      io.grpc.MethodDescriptor.<sandglass.Sandglass.LastOffsetRequest, sandglass.Sandglass.LastOffsetReply>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "sandglass.InternalService", "LastOffset"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              sandglass.Sandglass.LastOffsetRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              sandglass.Sandglass.LastOffsetReply.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<sandglass.Sandglass.OffsetChangeRequest,
      sandglass.Sandglass.OffsetChangeReply> METHOD_MARK_CONSUMED =
      io.grpc.MethodDescriptor.<sandglass.Sandglass.OffsetChangeRequest, sandglass.Sandglass.OffsetChangeReply>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "sandglass.InternalService", "MarkConsumed"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              sandglass.Sandglass.OffsetChangeRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              sandglass.Sandglass.OffsetChangeReply.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<sandglass.Sandglass.OffsetChangeRequest,
      sandglass.Sandglass.Message> METHOD_GET_MARK_STATE_MESSAGE =
      io.grpc.MethodDescriptor.<sandglass.Sandglass.OffsetChangeRequest, sandglass.Sandglass.Message>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "sandglass.InternalService", "GetMarkStateMessage"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              sandglass.Sandglass.OffsetChangeRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              sandglass.Sandglass.Message.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InternalServiceStub newStub(io.grpc.Channel channel) {
    return new InternalServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InternalServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new InternalServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InternalServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new InternalServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class InternalServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void storeMessageLocally(sandglass.Sandglass.Message request,
        io.grpc.stub.StreamObserver<sandglass.Sandglass.StoreLocallyReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_STORE_MESSAGE_LOCALLY, responseObserver);
    }

    /**
     */
    public void getByKey(sandglass.Sandglass.GetRequest request,
        io.grpc.stub.StreamObserver<sandglass.Sandglass.Message> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_BY_KEY, responseObserver);
    }

    /**
     */
    public void hasKey(sandglass.Sandglass.GetRequest request,
        io.grpc.stub.StreamObserver<sandglass.Sandglass.HasResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_HAS_KEY, responseObserver);
    }

    /**
     */
    public void fetchFromSync(sandglass.Sandglass.FetchFromSyncRequest request,
        io.grpc.stub.StreamObserver<sandglass.Sandglass.Message> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FETCH_FROM_SYNC, responseObserver);
    }

    /**
     */
    public void lastOffset(sandglass.Sandglass.LastOffsetRequest request,
        io.grpc.stub.StreamObserver<sandglass.Sandglass.LastOffsetReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LAST_OFFSET, responseObserver);
    }

    /**
     */
    public void markConsumed(sandglass.Sandglass.OffsetChangeRequest request,
        io.grpc.stub.StreamObserver<sandglass.Sandglass.OffsetChangeReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_MARK_CONSUMED, responseObserver);
    }

    /**
     */
    public void getMarkStateMessage(sandglass.Sandglass.OffsetChangeRequest request,
        io.grpc.stub.StreamObserver<sandglass.Sandglass.Message> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_MARK_STATE_MESSAGE, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_STORE_MESSAGE_LOCALLY,
            asyncUnaryCall(
              new MethodHandlers<
                sandglass.Sandglass.Message,
                sandglass.Sandglass.StoreLocallyReply>(
                  this, METHODID_STORE_MESSAGE_LOCALLY)))
          .addMethod(
            METHOD_GET_BY_KEY,
            asyncUnaryCall(
              new MethodHandlers<
                sandglass.Sandglass.GetRequest,
                sandglass.Sandglass.Message>(
                  this, METHODID_GET_BY_KEY)))
          .addMethod(
            METHOD_HAS_KEY,
            asyncUnaryCall(
              new MethodHandlers<
                sandglass.Sandglass.GetRequest,
                sandglass.Sandglass.HasResponse>(
                  this, METHODID_HAS_KEY)))
          .addMethod(
            METHOD_FETCH_FROM_SYNC,
            asyncServerStreamingCall(
              new MethodHandlers<
                sandglass.Sandglass.FetchFromSyncRequest,
                sandglass.Sandglass.Message>(
                  this, METHODID_FETCH_FROM_SYNC)))
          .addMethod(
            METHOD_LAST_OFFSET,
            asyncUnaryCall(
              new MethodHandlers<
                sandglass.Sandglass.LastOffsetRequest,
                sandglass.Sandglass.LastOffsetReply>(
                  this, METHODID_LAST_OFFSET)))
          .addMethod(
            METHOD_MARK_CONSUMED,
            asyncUnaryCall(
              new MethodHandlers<
                sandglass.Sandglass.OffsetChangeRequest,
                sandglass.Sandglass.OffsetChangeReply>(
                  this, METHODID_MARK_CONSUMED)))
          .addMethod(
            METHOD_GET_MARK_STATE_MESSAGE,
            asyncUnaryCall(
              new MethodHandlers<
                sandglass.Sandglass.OffsetChangeRequest,
                sandglass.Sandglass.Message>(
                  this, METHODID_GET_MARK_STATE_MESSAGE)))
          .build();
    }
  }

  /**
   */
  public static final class InternalServiceStub extends io.grpc.stub.AbstractStub<InternalServiceStub> {
    private InternalServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InternalServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InternalServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InternalServiceStub(channel, callOptions);
    }

    /**
     */
    public void storeMessageLocally(sandglass.Sandglass.Message request,
        io.grpc.stub.StreamObserver<sandglass.Sandglass.StoreLocallyReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_STORE_MESSAGE_LOCALLY, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getByKey(sandglass.Sandglass.GetRequest request,
        io.grpc.stub.StreamObserver<sandglass.Sandglass.Message> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_BY_KEY, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void hasKey(sandglass.Sandglass.GetRequest request,
        io.grpc.stub.StreamObserver<sandglass.Sandglass.HasResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_HAS_KEY, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fetchFromSync(sandglass.Sandglass.FetchFromSyncRequest request,
        io.grpc.stub.StreamObserver<sandglass.Sandglass.Message> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_FETCH_FROM_SYNC, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lastOffset(sandglass.Sandglass.LastOffsetRequest request,
        io.grpc.stub.StreamObserver<sandglass.Sandglass.LastOffsetReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LAST_OFFSET, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void markConsumed(sandglass.Sandglass.OffsetChangeRequest request,
        io.grpc.stub.StreamObserver<sandglass.Sandglass.OffsetChangeReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_MARK_CONSUMED, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMarkStateMessage(sandglass.Sandglass.OffsetChangeRequest request,
        io.grpc.stub.StreamObserver<sandglass.Sandglass.Message> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_MARK_STATE_MESSAGE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class InternalServiceBlockingStub extends io.grpc.stub.AbstractStub<InternalServiceBlockingStub> {
    private InternalServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InternalServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InternalServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InternalServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public sandglass.Sandglass.StoreLocallyReply storeMessageLocally(sandglass.Sandglass.Message request) {
      return blockingUnaryCall(
          getChannel(), METHOD_STORE_MESSAGE_LOCALLY, getCallOptions(), request);
    }

    /**
     */
    public sandglass.Sandglass.Message getByKey(sandglass.Sandglass.GetRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_BY_KEY, getCallOptions(), request);
    }

    /**
     */
    public sandglass.Sandglass.HasResponse hasKey(sandglass.Sandglass.GetRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_HAS_KEY, getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<sandglass.Sandglass.Message> fetchFromSync(
        sandglass.Sandglass.FetchFromSyncRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_FETCH_FROM_SYNC, getCallOptions(), request);
    }

    /**
     */
    public sandglass.Sandglass.LastOffsetReply lastOffset(sandglass.Sandglass.LastOffsetRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LAST_OFFSET, getCallOptions(), request);
    }

    /**
     */
    public sandglass.Sandglass.OffsetChangeReply markConsumed(sandglass.Sandglass.OffsetChangeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_MARK_CONSUMED, getCallOptions(), request);
    }

    /**
     */
    public sandglass.Sandglass.Message getMarkStateMessage(sandglass.Sandglass.OffsetChangeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_MARK_STATE_MESSAGE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class InternalServiceFutureStub extends io.grpc.stub.AbstractStub<InternalServiceFutureStub> {
    private InternalServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InternalServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InternalServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InternalServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sandglass.Sandglass.StoreLocallyReply> storeMessageLocally(
        sandglass.Sandglass.Message request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_STORE_MESSAGE_LOCALLY, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sandglass.Sandglass.Message> getByKey(
        sandglass.Sandglass.GetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_BY_KEY, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sandglass.Sandglass.HasResponse> hasKey(
        sandglass.Sandglass.GetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_HAS_KEY, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sandglass.Sandglass.LastOffsetReply> lastOffset(
        sandglass.Sandglass.LastOffsetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LAST_OFFSET, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sandglass.Sandglass.OffsetChangeReply> markConsumed(
        sandglass.Sandglass.OffsetChangeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_MARK_CONSUMED, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sandglass.Sandglass.Message> getMarkStateMessage(
        sandglass.Sandglass.OffsetChangeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_MARK_STATE_MESSAGE, getCallOptions()), request);
    }
  }

  private static final int METHODID_STORE_MESSAGE_LOCALLY = 0;
  private static final int METHODID_GET_BY_KEY = 1;
  private static final int METHODID_HAS_KEY = 2;
  private static final int METHODID_FETCH_FROM_SYNC = 3;
  private static final int METHODID_LAST_OFFSET = 4;
  private static final int METHODID_MARK_CONSUMED = 5;
  private static final int METHODID_GET_MARK_STATE_MESSAGE = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InternalServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InternalServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STORE_MESSAGE_LOCALLY:
          serviceImpl.storeMessageLocally((sandglass.Sandglass.Message) request,
              (io.grpc.stub.StreamObserver<sandglass.Sandglass.StoreLocallyReply>) responseObserver);
          break;
        case METHODID_GET_BY_KEY:
          serviceImpl.getByKey((sandglass.Sandglass.GetRequest) request,
              (io.grpc.stub.StreamObserver<sandglass.Sandglass.Message>) responseObserver);
          break;
        case METHODID_HAS_KEY:
          serviceImpl.hasKey((sandglass.Sandglass.GetRequest) request,
              (io.grpc.stub.StreamObserver<sandglass.Sandglass.HasResponse>) responseObserver);
          break;
        case METHODID_FETCH_FROM_SYNC:
          serviceImpl.fetchFromSync((sandglass.Sandglass.FetchFromSyncRequest) request,
              (io.grpc.stub.StreamObserver<sandglass.Sandglass.Message>) responseObserver);
          break;
        case METHODID_LAST_OFFSET:
          serviceImpl.lastOffset((sandglass.Sandglass.LastOffsetRequest) request,
              (io.grpc.stub.StreamObserver<sandglass.Sandglass.LastOffsetReply>) responseObserver);
          break;
        case METHODID_MARK_CONSUMED:
          serviceImpl.markConsumed((sandglass.Sandglass.OffsetChangeRequest) request,
              (io.grpc.stub.StreamObserver<sandglass.Sandglass.OffsetChangeReply>) responseObserver);
          break;
        case METHODID_GET_MARK_STATE_MESSAGE:
          serviceImpl.getMarkStateMessage((sandglass.Sandglass.OffsetChangeRequest) request,
              (io.grpc.stub.StreamObserver<sandglass.Sandglass.Message>) responseObserver);
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

  private static final class InternalServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sandglass.Sandglass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (InternalServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InternalServiceDescriptorSupplier())
              .addMethod(METHOD_STORE_MESSAGE_LOCALLY)
              .addMethod(METHOD_GET_BY_KEY)
              .addMethod(METHOD_HAS_KEY)
              .addMethod(METHOD_FETCH_FROM_SYNC)
              .addMethod(METHOD_LAST_OFFSET)
              .addMethod(METHOD_MARK_CONSUMED)
              .addMethod(METHOD_GET_MARK_STATE_MESSAGE)
              .build();
        }
      }
    }
    return result;
  }
}
