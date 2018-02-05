# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc

import sandglass_pb2 as sandglass__pb2


class BrokerServiceStub(object):
  # missing associated documentation comment in .proto file
  pass

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.CreateTopic = channel.unary_unary(
        '/sandglass.BrokerService/CreateTopic',
        request_serializer=sandglass__pb2.TopicConfig.SerializeToString,
        response_deserializer=sandglass__pb2.TopicReply.FromString,
        )
    self.GetTopic = channel.unary_unary(
        '/sandglass.BrokerService/GetTopic',
        request_serializer=sandglass__pb2.GetTopicParams.SerializeToString,
        response_deserializer=sandglass__pb2.GetTopicReply.FromString,
        )
    self.Produce = channel.unary_unary(
        '/sandglass.BrokerService/Produce',
        request_serializer=sandglass__pb2.ProduceMessageRequest.SerializeToString,
        response_deserializer=sandglass__pb2.ProduceResponse.FromString,
        )
    self.FetchFrom = channel.unary_stream(
        '/sandglass.BrokerService/FetchFrom',
        request_serializer=sandglass__pb2.FetchFromRequest.SerializeToString,
        response_deserializer=sandglass__pb2.Message.FromString,
        )
    self.FetchRange = channel.unary_stream(
        '/sandglass.BrokerService/FetchRange',
        request_serializer=sandglass__pb2.FetchRangeRequest.SerializeToString,
        response_deserializer=sandglass__pb2.Message.FromString,
        )
    self.ConsumeFromGroup = channel.unary_stream(
        '/sandglass.BrokerService/ConsumeFromGroup',
        request_serializer=sandglass__pb2.ConsumeFromGroupRequest.SerializeToString,
        response_deserializer=sandglass__pb2.Message.FromString,
        )
    self.Acknowledge = channel.unary_unary(
        '/sandglass.BrokerService/Acknowledge',
        request_serializer=sandglass__pb2.MarkRequest.SerializeToString,
        response_deserializer=sandglass__pb2.MarkResponse.FromString,
        )
    self.NotAcknowledge = channel.unary_unary(
        '/sandglass.BrokerService/NotAcknowledge',
        request_serializer=sandglass__pb2.MarkRequest.SerializeToString,
        response_deserializer=sandglass__pb2.MarkResponse.FromString,
        )


class BrokerServiceServicer(object):
  # missing associated documentation comment in .proto file
  pass

  def CreateTopic(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def GetTopic(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def Produce(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def FetchFrom(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def FetchRange(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def ConsumeFromGroup(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def Acknowledge(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def NotAcknowledge(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_BrokerServiceServicer_to_server(servicer, server):
  rpc_method_handlers = {
      'CreateTopic': grpc.unary_unary_rpc_method_handler(
          servicer.CreateTopic,
          request_deserializer=sandglass__pb2.TopicConfig.FromString,
          response_serializer=sandglass__pb2.TopicReply.SerializeToString,
      ),
      'GetTopic': grpc.unary_unary_rpc_method_handler(
          servicer.GetTopic,
          request_deserializer=sandglass__pb2.GetTopicParams.FromString,
          response_serializer=sandglass__pb2.GetTopicReply.SerializeToString,
      ),
      'Produce': grpc.unary_unary_rpc_method_handler(
          servicer.Produce,
          request_deserializer=sandglass__pb2.ProduceMessageRequest.FromString,
          response_serializer=sandglass__pb2.ProduceResponse.SerializeToString,
      ),
      'FetchFrom': grpc.unary_stream_rpc_method_handler(
          servicer.FetchFrom,
          request_deserializer=sandglass__pb2.FetchFromRequest.FromString,
          response_serializer=sandglass__pb2.Message.SerializeToString,
      ),
      'FetchRange': grpc.unary_stream_rpc_method_handler(
          servicer.FetchRange,
          request_deserializer=sandglass__pb2.FetchRangeRequest.FromString,
          response_serializer=sandglass__pb2.Message.SerializeToString,
      ),
      'ConsumeFromGroup': grpc.unary_stream_rpc_method_handler(
          servicer.ConsumeFromGroup,
          request_deserializer=sandglass__pb2.ConsumeFromGroupRequest.FromString,
          response_serializer=sandglass__pb2.Message.SerializeToString,
      ),
      'Acknowledge': grpc.unary_unary_rpc_method_handler(
          servicer.Acknowledge,
          request_deserializer=sandglass__pb2.MarkRequest.FromString,
          response_serializer=sandglass__pb2.MarkResponse.SerializeToString,
      ),
      'NotAcknowledge': grpc.unary_unary_rpc_method_handler(
          servicer.NotAcknowledge,
          request_deserializer=sandglass__pb2.MarkRequest.FromString,
          response_serializer=sandglass__pb2.MarkResponse.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'sandglass.BrokerService', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))


class InternalServiceStub(object):
  # missing associated documentation comment in .proto file
  pass

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.GetByKey = channel.unary_unary(
        '/sandglass.InternalService/GetByKey',
        request_serializer=sandglass__pb2.GetRequest.SerializeToString,
        response_deserializer=sandglass__pb2.Message.FromString,
        )
    self.HasKey = channel.unary_unary(
        '/sandglass.InternalService/HasKey',
        request_serializer=sandglass__pb2.GetRequest.SerializeToString,
        response_deserializer=sandglass__pb2.HasResponse.FromString,
        )
    self.FetchFromSync = channel.unary_stream(
        '/sandglass.InternalService/FetchFromSync',
        request_serializer=sandglass__pb2.FetchFromSyncRequest.SerializeToString,
        response_deserializer=sandglass__pb2.Message.FromString,
        )
    self.LastOffset = channel.unary_unary(
        '/sandglass.InternalService/LastOffset',
        request_serializer=sandglass__pb2.LastOffsetRequest.SerializeToString,
        response_deserializer=sandglass__pb2.LastOffsetReply.FromString,
        )
    self.Mark = channel.unary_unary(
        '/sandglass.InternalService/Mark',
        request_serializer=sandglass__pb2.MarkRequest.SerializeToString,
        response_deserializer=sandglass__pb2.MarkResponse.FromString,
        )
    self.GetMarkStateMessage = channel.unary_unary(
        '/sandglass.InternalService/GetMarkStateMessage',
        request_serializer=sandglass__pb2.GetMarkRequest.SerializeToString,
        response_deserializer=sandglass__pb2.Message.FromString,
        )
    self.LastWALIndex = channel.unary_unary(
        '/sandglass.InternalService/LastWALIndex',
        request_serializer=sandglass__pb2.LastWALIndexRequest.SerializeToString,
        response_deserializer=sandglass__pb2.LastWALIndexReply.FromString,
        )


class InternalServiceServicer(object):
  # missing associated documentation comment in .proto file
  pass

  def GetByKey(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def HasKey(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def FetchFromSync(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def LastOffset(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def Mark(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def GetMarkStateMessage(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def LastWALIndex(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_InternalServiceServicer_to_server(servicer, server):
  rpc_method_handlers = {
      'GetByKey': grpc.unary_unary_rpc_method_handler(
          servicer.GetByKey,
          request_deserializer=sandglass__pb2.GetRequest.FromString,
          response_serializer=sandglass__pb2.Message.SerializeToString,
      ),
      'HasKey': grpc.unary_unary_rpc_method_handler(
          servicer.HasKey,
          request_deserializer=sandglass__pb2.GetRequest.FromString,
          response_serializer=sandglass__pb2.HasResponse.SerializeToString,
      ),
      'FetchFromSync': grpc.unary_stream_rpc_method_handler(
          servicer.FetchFromSync,
          request_deserializer=sandglass__pb2.FetchFromSyncRequest.FromString,
          response_serializer=sandglass__pb2.Message.SerializeToString,
      ),
      'LastOffset': grpc.unary_unary_rpc_method_handler(
          servicer.LastOffset,
          request_deserializer=sandglass__pb2.LastOffsetRequest.FromString,
          response_serializer=sandglass__pb2.LastOffsetReply.SerializeToString,
      ),
      'Mark': grpc.unary_unary_rpc_method_handler(
          servicer.Mark,
          request_deserializer=sandglass__pb2.MarkRequest.FromString,
          response_serializer=sandglass__pb2.MarkResponse.SerializeToString,
      ),
      'GetMarkStateMessage': grpc.unary_unary_rpc_method_handler(
          servicer.GetMarkStateMessage,
          request_deserializer=sandglass__pb2.GetMarkRequest.FromString,
          response_serializer=sandglass__pb2.Message.SerializeToString,
      ),
      'LastWALIndex': grpc.unary_unary_rpc_method_handler(
          servicer.LastWALIndex,
          request_deserializer=sandglass__pb2.LastWALIndexRequest.FromString,
          response_serializer=sandglass__pb2.LastWALIndexReply.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'sandglass.InternalService', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))
