# Generated by the protocol buffer compiler.  DO NOT EDIT!
# Source: sandglass.proto for package 'sandglass'

require 'grpc'
require 'sandglass_pb'

module Sandglass
  module BrokerService
    class Service

      include GRPC::GenericService

      self.marshal_class_method = :encode
      self.unmarshal_class_method = :decode
      self.service_name = 'sandglass.BrokerService'

      rpc :CreateTopic, TopicConfig, TopicReply
      rpc :GetTopic, GetTopicParams, GetTopicReply
      rpc :Produce, ProduceMessageRequest, ProduceResponse
      rpc :FetchFrom, FetchFromRequest, stream(Message)
      rpc :FetchRange, FetchRangeRequest, stream(Message)
      rpc :ConsumeFromGroup, ConsumeFromGroupRequest, stream(Message)
      rpc :Acknowledge, MarkRequest, MarkResponse
      rpc :NotAcknowledge, MarkRequest, MarkResponse
    end

    Stub = Service.rpc_stub_class
  end
  module InternalService
    class Service

      include GRPC::GenericService

      self.marshal_class_method = :encode
      self.unmarshal_class_method = :decode
      self.service_name = 'sandglass.InternalService'

      rpc :GetByKey, GetRequest, Message
      rpc :HasKey, GetRequest, HasResponse
      rpc :FetchFromSync, FetchFromSyncRequest, stream(Message)
      rpc :LastOffset, LastOffsetRequest, LastOffsetReply
      rpc :Mark, MarkRequest, MarkResponse
      rpc :GetMarkStateMessage, GetMarkRequest, Message
      rpc :LastWALIndex, LastWALIndexRequest, LastWALIndexReply
    end

    Stub = Service.rpc_stub_class
  end
end
