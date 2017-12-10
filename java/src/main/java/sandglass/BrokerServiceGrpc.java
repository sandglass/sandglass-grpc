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
public final class BrokerServiceGrpc {

  private BrokerServiceGrpc() {}

  public static final String SERVICE_NAME = "sandglass.BrokerService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<sandglass.Sandglass.CreateTopicParams,
      sandglass.Sandglass.TopicReply> METHOD_CREATE_TOPIC =
      io.grpc.MethodDescriptor.<sandglass.Sandglass.CreateTopicParams, sandglass.Sandglass.TopicReply>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "sandglass.BrokerService", "CreateTopic"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              sandglass.Sandglass.CreateTopicParams.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              sandglass.Sandglass.TopicReply.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<sandglass.Sandglass.GetTopicParams,
      sandglass.Sandglass.GetTopicReply> METHOD_GET_TOPIC =
      io.grpc.MethodDescriptor.<sandglass.Sandglass.GetTopicParams, sandglass.Sandglass.GetTopicReply>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "sandglass.BrokerService", "GetTopic"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              sandglass.Sandglass.GetTopicParams.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              sandglass.Sandglass.GetTopicReply.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<sandglass.Sandglass.ProduceMessageRequest,
      sandglass.Sandglass.ProduceResponse> METHOD_PRODUCE =
      io.grpc.MethodDescriptor.<sandglass.Sandglass.ProduceMessageRequest, sandglass.Sandglass.ProduceResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "sandglass.BrokerService", "Produce"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              sandglass.Sandglass.ProduceMessageRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              sandglass.Sandglass.ProduceResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<sandglass.Sandglass.Message,
      sandglass.Sandglass.StoreLocallyReply> METHOD_PRODUCE_MESSAGES_STREAM =
      io.grpc.MethodDescriptor.<sandglass.Sandglass.Message, sandglass.Sandglass.StoreLocallyReply>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "sandglass.BrokerService", "ProduceMessagesStream"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              sandglass.Sandglass.Message.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              sandglass.Sandglass.StoreLocallyReply.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<sandglass.Sandglass.FetchFromRequest,
      sandglass.Sandglass.Message> METHOD_FETCH_FROM =
      io.grpc.MethodDescriptor.<sandglass.Sandglass.FetchFromRequest, sandglass.Sandglass.Message>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "sandglass.BrokerService", "FetchFrom"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              sandglass.Sandglass.FetchFromRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              sandglass.Sandglass.Message.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<sandglass.Sandglass.FetchRangeRequest,
      sandglass.Sandglass.Message> METHOD_FETCH_RANGE =
      io.grpc.MethodDescriptor.<sandglass.Sandglass.FetchRangeRequest, sandglass.Sandglass.Message>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "sandglass.BrokerService", "FetchRange"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              sandglass.Sandglass.FetchRangeRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              sandglass.Sandglass.Message.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<sandglass.Sandglass.ConsumeFromGroupRequest,
      sandglass.Sandglass.Message> METHOD_CONSUME_FROM_GROUP =
      io.grpc.MethodDescriptor.<sandglass.Sandglass.ConsumeFromGroupRequest, sandglass.Sandglass.Message>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "sandglass.BrokerService", "ConsumeFromGroup"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              sandglass.Sandglass.ConsumeFromGroupRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              sandglass.Sandglass.Message.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<sandglass.Sandglass.OffsetChangeRequest,
      sandglass.Sandglass.OffsetChangeReply> METHOD_ACKNOWLEDGE =
      io.grpc.MethodDescriptor.<sandglass.Sandglass.OffsetChangeRequest, sandglass.Sandglass.OffsetChangeReply>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "sandglass.BrokerService", "Acknowledge"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              sandglass.Sandglass.OffsetChangeRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              sandglass.Sandglass.OffsetChangeReply.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<sandglass.Sandglass.OffsetChangeRequest,
      sandglass.Sandglass.OffsetChangeReply> METHOD_NOT_ACKNOWLEDGE =
      io.grpc.MethodDescriptor.<sandglass.Sandglass.OffsetChangeRequest, sandglass.Sandglass.OffsetChangeReply>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "sandglass.BrokerService", "NotAcknowledge"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              sandglass.Sandglass.OffsetChangeRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              sandglass.Sandglass.OffsetChangeReply.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<sandglass.Sandglass.OffsetChangeRequest,
      sandglass.Sandglass.OffsetChangeReply> METHOD_COMMIT =
      io.grpc.MethodDescriptor.<sandglass.Sandglass.OffsetChangeRequest, sandglass.Sandglass.OffsetChangeReply>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "sandglass.BrokerService", "Commit"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              sandglass.Sandglass.OffsetChangeRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              sandglass.Sandglass.OffsetChangeReply.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<sandglass.Sandglass.MultiOffsetChangeRequest,
      sandglass.Sandglass.OffsetChangeReply> METHOD_ACKNOWLEDGE_MESSAGES =
      io.grpc.MethodDescriptor.<sandglass.Sandglass.MultiOffsetChangeRequest, sandglass.Sandglass.OffsetChangeReply>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "sandglass.BrokerService", "AcknowledgeMessages"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              sandglass.Sandglass.MultiOffsetChangeRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              sandglass.Sandglass.OffsetChangeReply.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BrokerServiceStub newStub(io.grpc.Channel channel) {
    return new BrokerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BrokerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BrokerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BrokerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BrokerServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BrokerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createTopic(sandglass.Sandglass.CreateTopicParams request,
        io.grpc.stub.StreamObserver<sandglass.Sandglass.TopicReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_TOPIC, responseObserver);
    }

    /**
     */
    public void getTopic(sandglass.Sandglass.GetTopicParams request,
        io.grpc.stub.StreamObserver<sandglass.Sandglass.GetTopicReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_TOPIC, responseObserver);
    }

    /**
     */
    public void produce(sandglass.Sandglass.ProduceMessageRequest request,
        io.grpc.stub.StreamObserver<sandglass.Sandglass.ProduceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PRODUCE, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<sandglass.Sandglass.Message> produceMessagesStream(
        io.grpc.stub.StreamObserver<sandglass.Sandglass.StoreLocallyReply> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_PRODUCE_MESSAGES_STREAM, responseObserver);
    }

    /**
     */
    public void fetchFrom(sandglass.Sandglass.FetchFromRequest request,
        io.grpc.stub.StreamObserver<sandglass.Sandglass.Message> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FETCH_FROM, responseObserver);
    }

    /**
     */
    public void fetchRange(sandglass.Sandglass.FetchRangeRequest request,
        io.grpc.stub.StreamObserver<sandglass.Sandglass.Message> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FETCH_RANGE, responseObserver);
    }

    /**
     */
    public void consumeFromGroup(sandglass.Sandglass.ConsumeFromGroupRequest request,
        io.grpc.stub.StreamObserver<sandglass.Sandglass.Message> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CONSUME_FROM_GROUP, responseObserver);
    }

    /**
     */
    public void acknowledge(sandglass.Sandglass.OffsetChangeRequest request,
        io.grpc.stub.StreamObserver<sandglass.Sandglass.OffsetChangeReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ACKNOWLEDGE, responseObserver);
    }

    /**
     */
    public void notAcknowledge(sandglass.Sandglass.OffsetChangeRequest request,
        io.grpc.stub.StreamObserver<sandglass.Sandglass.OffsetChangeReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_NOT_ACKNOWLEDGE, responseObserver);
    }

    /**
     */
    public void commit(sandglass.Sandglass.OffsetChangeRequest request,
        io.grpc.stub.StreamObserver<sandglass.Sandglass.OffsetChangeReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_COMMIT, responseObserver);
    }

    /**
     */
    public void acknowledgeMessages(sandglass.Sandglass.MultiOffsetChangeRequest request,
        io.grpc.stub.StreamObserver<sandglass.Sandglass.OffsetChangeReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ACKNOWLEDGE_MESSAGES, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_TOPIC,
            asyncUnaryCall(
              new MethodHandlers<
                sandglass.Sandglass.CreateTopicParams,
                sandglass.Sandglass.TopicReply>(
                  this, METHODID_CREATE_TOPIC)))
          .addMethod(
            METHOD_GET_TOPIC,
            asyncUnaryCall(
              new MethodHandlers<
                sandglass.Sandglass.GetTopicParams,
                sandglass.Sandglass.GetTopicReply>(
                  this, METHODID_GET_TOPIC)))
          .addMethod(
            METHOD_PRODUCE,
            asyncUnaryCall(
              new MethodHandlers<
                sandglass.Sandglass.ProduceMessageRequest,
                sandglass.Sandglass.ProduceResponse>(
                  this, METHODID_PRODUCE)))
          .addMethod(
            METHOD_PRODUCE_MESSAGES_STREAM,
            asyncClientStreamingCall(
              new MethodHandlers<
                sandglass.Sandglass.Message,
                sandglass.Sandglass.StoreLocallyReply>(
                  this, METHODID_PRODUCE_MESSAGES_STREAM)))
          .addMethod(
            METHOD_FETCH_FROM,
            asyncServerStreamingCall(
              new MethodHandlers<
                sandglass.Sandglass.FetchFromRequest,
                sandglass.Sandglass.Message>(
                  this, METHODID_FETCH_FROM)))
          .addMethod(
            METHOD_FETCH_RANGE,
            asyncServerStreamingCall(
              new MethodHandlers<
                sandglass.Sandglass.FetchRangeRequest,
                sandglass.Sandglass.Message>(
                  this, METHODID_FETCH_RANGE)))
          .addMethod(
            METHOD_CONSUME_FROM_GROUP,
            asyncServerStreamingCall(
              new MethodHandlers<
                sandglass.Sandglass.ConsumeFromGroupRequest,
                sandglass.Sandglass.Message>(
                  this, METHODID_CONSUME_FROM_GROUP)))
          .addMethod(
            METHOD_ACKNOWLEDGE,
            asyncUnaryCall(
              new MethodHandlers<
                sandglass.Sandglass.OffsetChangeRequest,
                sandglass.Sandglass.OffsetChangeReply>(
                  this, METHODID_ACKNOWLEDGE)))
          .addMethod(
            METHOD_NOT_ACKNOWLEDGE,
            asyncUnaryCall(
              new MethodHandlers<
                sandglass.Sandglass.OffsetChangeRequest,
                sandglass.Sandglass.OffsetChangeReply>(
                  this, METHODID_NOT_ACKNOWLEDGE)))
          .addMethod(
            METHOD_COMMIT,
            asyncUnaryCall(
              new MethodHandlers<
                sandglass.Sandglass.OffsetChangeRequest,
                sandglass.Sandglass.OffsetChangeReply>(
                  this, METHODID_COMMIT)))
          .addMethod(
            METHOD_ACKNOWLEDGE_MESSAGES,
            asyncUnaryCall(
              new MethodHandlers<
                sandglass.Sandglass.MultiOffsetChangeRequest,
                sandglass.Sandglass.OffsetChangeReply>(
                  this, METHODID_ACKNOWLEDGE_MESSAGES)))
          .build();
    }
  }

  /**
   */
  public static final class BrokerServiceStub extends io.grpc.stub.AbstractStub<BrokerServiceStub> {
    private BrokerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BrokerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BrokerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BrokerServiceStub(channel, callOptions);
    }

    /**
     */
    public void createTopic(sandglass.Sandglass.CreateTopicParams request,
        io.grpc.stub.StreamObserver<sandglass.Sandglass.TopicReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_TOPIC, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTopic(sandglass.Sandglass.GetTopicParams request,
        io.grpc.stub.StreamObserver<sandglass.Sandglass.GetTopicReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_TOPIC, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void produce(sandglass.Sandglass.ProduceMessageRequest request,
        io.grpc.stub.StreamObserver<sandglass.Sandglass.ProduceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PRODUCE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<sandglass.Sandglass.Message> produceMessagesStream(
        io.grpc.stub.StreamObserver<sandglass.Sandglass.StoreLocallyReply> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_PRODUCE_MESSAGES_STREAM, getCallOptions()), responseObserver);
    }

    /**
     */
    public void fetchFrom(sandglass.Sandglass.FetchFromRequest request,
        io.grpc.stub.StreamObserver<sandglass.Sandglass.Message> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_FETCH_FROM, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fetchRange(sandglass.Sandglass.FetchRangeRequest request,
        io.grpc.stub.StreamObserver<sandglass.Sandglass.Message> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_FETCH_RANGE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void consumeFromGroup(sandglass.Sandglass.ConsumeFromGroupRequest request,
        io.grpc.stub.StreamObserver<sandglass.Sandglass.Message> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_CONSUME_FROM_GROUP, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void acknowledge(sandglass.Sandglass.OffsetChangeRequest request,
        io.grpc.stub.StreamObserver<sandglass.Sandglass.OffsetChangeReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ACKNOWLEDGE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void notAcknowledge(sandglass.Sandglass.OffsetChangeRequest request,
        io.grpc.stub.StreamObserver<sandglass.Sandglass.OffsetChangeReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_NOT_ACKNOWLEDGE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void commit(sandglass.Sandglass.OffsetChangeRequest request,
        io.grpc.stub.StreamObserver<sandglass.Sandglass.OffsetChangeReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_COMMIT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void acknowledgeMessages(sandglass.Sandglass.MultiOffsetChangeRequest request,
        io.grpc.stub.StreamObserver<sandglass.Sandglass.OffsetChangeReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ACKNOWLEDGE_MESSAGES, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BrokerServiceBlockingStub extends io.grpc.stub.AbstractStub<BrokerServiceBlockingStub> {
    private BrokerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BrokerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BrokerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BrokerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public sandglass.Sandglass.TopicReply createTopic(sandglass.Sandglass.CreateTopicParams request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_TOPIC, getCallOptions(), request);
    }

    /**
     */
    public sandglass.Sandglass.GetTopicReply getTopic(sandglass.Sandglass.GetTopicParams request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_TOPIC, getCallOptions(), request);
    }

    /**
     */
    public sandglass.Sandglass.ProduceResponse produce(sandglass.Sandglass.ProduceMessageRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PRODUCE, getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<sandglass.Sandglass.Message> fetchFrom(
        sandglass.Sandglass.FetchFromRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_FETCH_FROM, getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<sandglass.Sandglass.Message> fetchRange(
        sandglass.Sandglass.FetchRangeRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_FETCH_RANGE, getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<sandglass.Sandglass.Message> consumeFromGroup(
        sandglass.Sandglass.ConsumeFromGroupRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_CONSUME_FROM_GROUP, getCallOptions(), request);
    }

    /**
     */
    public sandglass.Sandglass.OffsetChangeReply acknowledge(sandglass.Sandglass.OffsetChangeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ACKNOWLEDGE, getCallOptions(), request);
    }

    /**
     */
    public sandglass.Sandglass.OffsetChangeReply notAcknowledge(sandglass.Sandglass.OffsetChangeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_NOT_ACKNOWLEDGE, getCallOptions(), request);
    }

    /**
     */
    public sandglass.Sandglass.OffsetChangeReply commit(sandglass.Sandglass.OffsetChangeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_COMMIT, getCallOptions(), request);
    }

    /**
     */
    public sandglass.Sandglass.OffsetChangeReply acknowledgeMessages(sandglass.Sandglass.MultiOffsetChangeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ACKNOWLEDGE_MESSAGES, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BrokerServiceFutureStub extends io.grpc.stub.AbstractStub<BrokerServiceFutureStub> {
    private BrokerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BrokerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BrokerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BrokerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sandglass.Sandglass.TopicReply> createTopic(
        sandglass.Sandglass.CreateTopicParams request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_TOPIC, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sandglass.Sandglass.GetTopicReply> getTopic(
        sandglass.Sandglass.GetTopicParams request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_TOPIC, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sandglass.Sandglass.ProduceResponse> produce(
        sandglass.Sandglass.ProduceMessageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PRODUCE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sandglass.Sandglass.OffsetChangeReply> acknowledge(
        sandglass.Sandglass.OffsetChangeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ACKNOWLEDGE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sandglass.Sandglass.OffsetChangeReply> notAcknowledge(
        sandglass.Sandglass.OffsetChangeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_NOT_ACKNOWLEDGE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sandglass.Sandglass.OffsetChangeReply> commit(
        sandglass.Sandglass.OffsetChangeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_COMMIT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sandglass.Sandglass.OffsetChangeReply> acknowledgeMessages(
        sandglass.Sandglass.MultiOffsetChangeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ACKNOWLEDGE_MESSAGES, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TOPIC = 0;
  private static final int METHODID_GET_TOPIC = 1;
  private static final int METHODID_PRODUCE = 2;
  private static final int METHODID_FETCH_FROM = 3;
  private static final int METHODID_FETCH_RANGE = 4;
  private static final int METHODID_CONSUME_FROM_GROUP = 5;
  private static final int METHODID_ACKNOWLEDGE = 6;
  private static final int METHODID_NOT_ACKNOWLEDGE = 7;
  private static final int METHODID_COMMIT = 8;
  private static final int METHODID_ACKNOWLEDGE_MESSAGES = 9;
  private static final int METHODID_PRODUCE_MESSAGES_STREAM = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BrokerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BrokerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_TOPIC:
          serviceImpl.createTopic((sandglass.Sandglass.CreateTopicParams) request,
              (io.grpc.stub.StreamObserver<sandglass.Sandglass.TopicReply>) responseObserver);
          break;
        case METHODID_GET_TOPIC:
          serviceImpl.getTopic((sandglass.Sandglass.GetTopicParams) request,
              (io.grpc.stub.StreamObserver<sandglass.Sandglass.GetTopicReply>) responseObserver);
          break;
        case METHODID_PRODUCE:
          serviceImpl.produce((sandglass.Sandglass.ProduceMessageRequest) request,
              (io.grpc.stub.StreamObserver<sandglass.Sandglass.ProduceResponse>) responseObserver);
          break;
        case METHODID_FETCH_FROM:
          serviceImpl.fetchFrom((sandglass.Sandglass.FetchFromRequest) request,
              (io.grpc.stub.StreamObserver<sandglass.Sandglass.Message>) responseObserver);
          break;
        case METHODID_FETCH_RANGE:
          serviceImpl.fetchRange((sandglass.Sandglass.FetchRangeRequest) request,
              (io.grpc.stub.StreamObserver<sandglass.Sandglass.Message>) responseObserver);
          break;
        case METHODID_CONSUME_FROM_GROUP:
          serviceImpl.consumeFromGroup((sandglass.Sandglass.ConsumeFromGroupRequest) request,
              (io.grpc.stub.StreamObserver<sandglass.Sandglass.Message>) responseObserver);
          break;
        case METHODID_ACKNOWLEDGE:
          serviceImpl.acknowledge((sandglass.Sandglass.OffsetChangeRequest) request,
              (io.grpc.stub.StreamObserver<sandglass.Sandglass.OffsetChangeReply>) responseObserver);
          break;
        case METHODID_NOT_ACKNOWLEDGE:
          serviceImpl.notAcknowledge((sandglass.Sandglass.OffsetChangeRequest) request,
              (io.grpc.stub.StreamObserver<sandglass.Sandglass.OffsetChangeReply>) responseObserver);
          break;
        case METHODID_COMMIT:
          serviceImpl.commit((sandglass.Sandglass.OffsetChangeRequest) request,
              (io.grpc.stub.StreamObserver<sandglass.Sandglass.OffsetChangeReply>) responseObserver);
          break;
        case METHODID_ACKNOWLEDGE_MESSAGES:
          serviceImpl.acknowledgeMessages((sandglass.Sandglass.MultiOffsetChangeRequest) request,
              (io.grpc.stub.StreamObserver<sandglass.Sandglass.OffsetChangeReply>) responseObserver);
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
        case METHODID_PRODUCE_MESSAGES_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.produceMessagesStream(
              (io.grpc.stub.StreamObserver<sandglass.Sandglass.StoreLocallyReply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class BrokerServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sandglass.Sandglass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BrokerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BrokerServiceDescriptorSupplier())
              .addMethod(METHOD_CREATE_TOPIC)
              .addMethod(METHOD_GET_TOPIC)
              .addMethod(METHOD_PRODUCE)
              .addMethod(METHOD_PRODUCE_MESSAGES_STREAM)
              .addMethod(METHOD_FETCH_FROM)
              .addMethod(METHOD_FETCH_RANGE)
              .addMethod(METHOD_CONSUME_FROM_GROUP)
              .addMethod(METHOD_ACKNOWLEDGE)
              .addMethod(METHOD_NOT_ACKNOWLEDGE)
              .addMethod(METHOD_COMMIT)
              .addMethod(METHOD_ACKNOWLEDGE_MESSAGES)
              .build();
        }
      }
    }
    return result;
  }
}
