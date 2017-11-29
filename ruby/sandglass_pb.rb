# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: sandglass.proto

require 'google/protobuf'

require 'google/api/annotations_pb'
Google::Protobuf::DescriptorPool.generated_pool.build do
  add_message "sandglass.Message" do
    optional :index, :bytes, 10
    optional :offset, :bytes, 11
    optional :key, :bytes, 20
    optional :clusteringKey, :bytes, 21
    optional :value, :bytes, 30
  end
  add_message "sandglass.ProduceMessageRequest" do
    optional :topic, :string, 1
    optional :partition, :string, 2
    repeated :messages, :message, 3, "sandglass.Message"
  end
  add_message "sandglass.PublishResponse" do
    repeated :offsets, :bytes, 1
  end
  add_message "sandglass.CreateTopicParams" do
    optional :name, :string, 1
    optional :kind, :enum, 2, "sandglass.TopicKind"
    optional :replicationFactor, :int32, 3
    optional :numPartitions, :int32, 4
    optional :storageDriver, :enum, 5, "sandglass.StorageDriver"
  end
  add_message "sandglass.GetTopicParams" do
    optional :name, :string, 1
  end
  add_message "sandglass.GetTopicReply" do
    optional :name, :string, 1
    repeated :partitions, :string, 2
  end
  add_message "sandglass.TopicReply" do
    optional :success, :bool, 1
  end
  add_message "sandglass.StoreLocallyReply" do
    optional :success, :bool, 1
  end
  add_message "sandglass.FetchFromRequest" do
    optional :topic, :string, 1
    optional :partition, :string, 2
    optional :from, :bytes, 3
  end
  add_message "sandglass.FetchRangeRequest" do
    optional :topic, :string, 1
    optional :partition, :string, 2
    optional :from, :bytes, 3
    optional :to, :bytes, 4
  end
  add_message "sandglass.GetRequest" do
    optional :topic, :string, 1
    optional :partition, :string, 2
    optional :key, :bytes, 3
    optional :clusteringKey, :bytes, 4
  end
  add_message "sandglass.ConsumeFromGroupRequest" do
    optional :topic, :string, 1
    optional :partition, :string, 2
    optional :consumerGroupName, :string, 3
    optional :consumerName, :string, 4
  end
  add_message "sandglass.OffsetChangeRequest" do
    optional :topic, :string, 1
    optional :partition, :string, 2
    optional :consumerGroup, :string, 3
    optional :consumerName, :string, 4
    optional :offset, :bytes, 5
  end
  add_message "sandglass.MultiOffsetChangeRequest" do
    optional :topic, :string, 1
    optional :partition, :string, 2
    optional :consumerGroup, :string, 3
    optional :consumerName, :string, 4
    repeated :offsets, :bytes, 5
  end
  add_message "sandglass.OffsetChangeReply" do
    optional :success, :bool, 1
  end
  add_message "sandglass.LastOffsetReply" do
    optional :offset, :bytes, 1
  end
  add_message "sandglass.LastOffsetRequest" do
    optional :topic, :string, 1
    optional :partition, :string, 2
    optional :consumerGroup, :string, 3
    optional :consumerName, :string, 4
    optional :kind, :enum, 5, "sandglass.MarkKind"
  end
  add_message "sandglass.FetchFromSyncRequest" do
    optional :topic, :string, 1
    optional :partition, :string, 2
    optional :from, :bytes, 3
  end
  add_message "sandglass.HasResponse" do
    optional :exists, :bool, 1
  end
  add_message "sandglass.MarkState" do
    optional :kind, :enum, 1, "sandglass.MarkKind"
    optional :deliveryCount, :int32, 2
  end
  add_enum "sandglass.TopicKind" do
    value :TimerKind, 0
    value :KVKind, 1
  end
  add_enum "sandglass.StorageDriver" do
    value :RocksDB, 0
    value :Badger, 1
  end
  add_enum "sandglass.MarkKind" do
    value :Unknown, 0
    value :Consumed, 10
    value :NotAcknowledged, 20
    value :Acknowledged, 30
    value :Commited, 40
  end
end

module Sandglass
  Message = Google::Protobuf::DescriptorPool.generated_pool.lookup("sandglass.Message").msgclass
  ProduceMessageRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("sandglass.ProduceMessageRequest").msgclass
  PublishResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("sandglass.PublishResponse").msgclass
  CreateTopicParams = Google::Protobuf::DescriptorPool.generated_pool.lookup("sandglass.CreateTopicParams").msgclass
  GetTopicParams = Google::Protobuf::DescriptorPool.generated_pool.lookup("sandglass.GetTopicParams").msgclass
  GetTopicReply = Google::Protobuf::DescriptorPool.generated_pool.lookup("sandglass.GetTopicReply").msgclass
  TopicReply = Google::Protobuf::DescriptorPool.generated_pool.lookup("sandglass.TopicReply").msgclass
  StoreLocallyReply = Google::Protobuf::DescriptorPool.generated_pool.lookup("sandglass.StoreLocallyReply").msgclass
  FetchFromRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("sandglass.FetchFromRequest").msgclass
  FetchRangeRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("sandglass.FetchRangeRequest").msgclass
  GetRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("sandglass.GetRequest").msgclass
  ConsumeFromGroupRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("sandglass.ConsumeFromGroupRequest").msgclass
  OffsetChangeRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("sandglass.OffsetChangeRequest").msgclass
  MultiOffsetChangeRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("sandglass.MultiOffsetChangeRequest").msgclass
  OffsetChangeReply = Google::Protobuf::DescriptorPool.generated_pool.lookup("sandglass.OffsetChangeReply").msgclass
  LastOffsetReply = Google::Protobuf::DescriptorPool.generated_pool.lookup("sandglass.LastOffsetReply").msgclass
  LastOffsetRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("sandglass.LastOffsetRequest").msgclass
  FetchFromSyncRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("sandglass.FetchFromSyncRequest").msgclass
  HasResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("sandglass.HasResponse").msgclass
  MarkState = Google::Protobuf::DescriptorPool.generated_pool.lookup("sandglass.MarkState").msgclass
  TopicKind = Google::Protobuf::DescriptorPool.generated_pool.lookup("sandglass.TopicKind").enummodule
  StorageDriver = Google::Protobuf::DescriptorPool.generated_pool.lookup("sandglass.StorageDriver").enummodule
  MarkKind = Google::Protobuf::DescriptorPool.generated_pool.lookup("sandglass.MarkKind").enummodule
end