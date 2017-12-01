// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var sandglass_pb = require('./sandglass_pb.js');
var google_api_annotations_pb = require('./google/api/annotations_pb.js');
var github_com_gogo_protobuf_gogoproto_gogo_pb = require('./github.com/gogo/protobuf/gogoproto/gogo_pb.js');

function serialize_sandglass_ConsumeFromGroupRequest(arg) {
  if (!(arg instanceof sandglass_pb.ConsumeFromGroupRequest)) {
    throw new Error('Expected argument of type sandglass.ConsumeFromGroupRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_sandglass_ConsumeFromGroupRequest(buffer_arg) {
  return sandglass_pb.ConsumeFromGroupRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sandglass_CreateTopicParams(arg) {
  if (!(arg instanceof sandglass_pb.CreateTopicParams)) {
    throw new Error('Expected argument of type sandglass.CreateTopicParams');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_sandglass_CreateTopicParams(buffer_arg) {
  return sandglass_pb.CreateTopicParams.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sandglass_FetchFromRequest(arg) {
  if (!(arg instanceof sandglass_pb.FetchFromRequest)) {
    throw new Error('Expected argument of type sandglass.FetchFromRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_sandglass_FetchFromRequest(buffer_arg) {
  return sandglass_pb.FetchFromRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sandglass_FetchFromSyncRequest(arg) {
  if (!(arg instanceof sandglass_pb.FetchFromSyncRequest)) {
    throw new Error('Expected argument of type sandglass.FetchFromSyncRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_sandglass_FetchFromSyncRequest(buffer_arg) {
  return sandglass_pb.FetchFromSyncRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sandglass_FetchRangeRequest(arg) {
  if (!(arg instanceof sandglass_pb.FetchRangeRequest)) {
    throw new Error('Expected argument of type sandglass.FetchRangeRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_sandglass_FetchRangeRequest(buffer_arg) {
  return sandglass_pb.FetchRangeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sandglass_GetRequest(arg) {
  if (!(arg instanceof sandglass_pb.GetRequest)) {
    throw new Error('Expected argument of type sandglass.GetRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_sandglass_GetRequest(buffer_arg) {
  return sandglass_pb.GetRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sandglass_GetTopicParams(arg) {
  if (!(arg instanceof sandglass_pb.GetTopicParams)) {
    throw new Error('Expected argument of type sandglass.GetTopicParams');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_sandglass_GetTopicParams(buffer_arg) {
  return sandglass_pb.GetTopicParams.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sandglass_GetTopicReply(arg) {
  if (!(arg instanceof sandglass_pb.GetTopicReply)) {
    throw new Error('Expected argument of type sandglass.GetTopicReply');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_sandglass_GetTopicReply(buffer_arg) {
  return sandglass_pb.GetTopicReply.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sandglass_HasResponse(arg) {
  if (!(arg instanceof sandglass_pb.HasResponse)) {
    throw new Error('Expected argument of type sandglass.HasResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_sandglass_HasResponse(buffer_arg) {
  return sandglass_pb.HasResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sandglass_LastOffsetReply(arg) {
  if (!(arg instanceof sandglass_pb.LastOffsetReply)) {
    throw new Error('Expected argument of type sandglass.LastOffsetReply');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_sandglass_LastOffsetReply(buffer_arg) {
  return sandglass_pb.LastOffsetReply.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sandglass_LastOffsetRequest(arg) {
  if (!(arg instanceof sandglass_pb.LastOffsetRequest)) {
    throw new Error('Expected argument of type sandglass.LastOffsetRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_sandglass_LastOffsetRequest(buffer_arg) {
  return sandglass_pb.LastOffsetRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sandglass_Message(arg) {
  if (!(arg instanceof sandglass_pb.Message)) {
    throw new Error('Expected argument of type sandglass.Message');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_sandglass_Message(buffer_arg) {
  return sandglass_pb.Message.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sandglass_MultiOffsetChangeRequest(arg) {
  if (!(arg instanceof sandglass_pb.MultiOffsetChangeRequest)) {
    throw new Error('Expected argument of type sandglass.MultiOffsetChangeRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_sandglass_MultiOffsetChangeRequest(buffer_arg) {
  return sandglass_pb.MultiOffsetChangeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sandglass_OffsetChangeReply(arg) {
  if (!(arg instanceof sandglass_pb.OffsetChangeReply)) {
    throw new Error('Expected argument of type sandglass.OffsetChangeReply');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_sandglass_OffsetChangeReply(buffer_arg) {
  return sandglass_pb.OffsetChangeReply.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sandglass_OffsetChangeRequest(arg) {
  if (!(arg instanceof sandglass_pb.OffsetChangeRequest)) {
    throw new Error('Expected argument of type sandglass.OffsetChangeRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_sandglass_OffsetChangeRequest(buffer_arg) {
  return sandglass_pb.OffsetChangeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sandglass_ProduceMessageRequest(arg) {
  if (!(arg instanceof sandglass_pb.ProduceMessageRequest)) {
    throw new Error('Expected argument of type sandglass.ProduceMessageRequest');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_sandglass_ProduceMessageRequest(buffer_arg) {
  return sandglass_pb.ProduceMessageRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sandglass_ProduceResponse(arg) {
  if (!(arg instanceof sandglass_pb.ProduceResponse)) {
    throw new Error('Expected argument of type sandglass.ProduceResponse');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_sandglass_ProduceResponse(buffer_arg) {
  return sandglass_pb.ProduceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sandglass_StoreLocallyReply(arg) {
  if (!(arg instanceof sandglass_pb.StoreLocallyReply)) {
    throw new Error('Expected argument of type sandglass.StoreLocallyReply');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_sandglass_StoreLocallyReply(buffer_arg) {
  return sandglass_pb.StoreLocallyReply.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sandglass_TopicReply(arg) {
  if (!(arg instanceof sandglass_pb.TopicReply)) {
    throw new Error('Expected argument of type sandglass.TopicReply');
  }
  return new Buffer(arg.serializeBinary());
}

function deserialize_sandglass_TopicReply(buffer_arg) {
  return sandglass_pb.TopicReply.deserializeBinary(new Uint8Array(buffer_arg));
}


var BrokerServiceService = exports.BrokerServiceService = {
  createTopic: {
    path: '/sandglass.BrokerService/CreateTopic',
    requestStream: false,
    responseStream: false,
    requestType: sandglass_pb.CreateTopicParams,
    responseType: sandglass_pb.TopicReply,
    requestSerialize: serialize_sandglass_CreateTopicParams,
    requestDeserialize: deserialize_sandglass_CreateTopicParams,
    responseSerialize: serialize_sandglass_TopicReply,
    responseDeserialize: deserialize_sandglass_TopicReply,
  },
  getTopic: {
    path: '/sandglass.BrokerService/GetTopic',
    requestStream: false,
    responseStream: false,
    requestType: sandglass_pb.GetTopicParams,
    responseType: sandglass_pb.GetTopicReply,
    requestSerialize: serialize_sandglass_GetTopicParams,
    requestDeserialize: deserialize_sandglass_GetTopicParams,
    responseSerialize: serialize_sandglass_GetTopicReply,
    responseDeserialize: deserialize_sandglass_GetTopicReply,
  },
  produce: {
    path: '/sandglass.BrokerService/Produce',
    requestStream: false,
    responseStream: false,
    requestType: sandglass_pb.ProduceMessageRequest,
    responseType: sandglass_pb.ProduceResponse,
    requestSerialize: serialize_sandglass_ProduceMessageRequest,
    requestDeserialize: deserialize_sandglass_ProduceMessageRequest,
    responseSerialize: serialize_sandglass_ProduceResponse,
    responseDeserialize: deserialize_sandglass_ProduceResponse,
  },
  produceMessagesStream: {
    path: '/sandglass.BrokerService/ProduceMessagesStream',
    requestStream: true,
    responseStream: false,
    requestType: sandglass_pb.Message,
    responseType: sandglass_pb.StoreLocallyReply,
    requestSerialize: serialize_sandglass_Message,
    requestDeserialize: deserialize_sandglass_Message,
    responseSerialize: serialize_sandglass_StoreLocallyReply,
    responseDeserialize: deserialize_sandglass_StoreLocallyReply,
  },
  fetchFrom: {
    path: '/sandglass.BrokerService/FetchFrom',
    requestStream: false,
    responseStream: true,
    requestType: sandglass_pb.FetchFromRequest,
    responseType: sandglass_pb.Message,
    requestSerialize: serialize_sandglass_FetchFromRequest,
    requestDeserialize: deserialize_sandglass_FetchFromRequest,
    responseSerialize: serialize_sandglass_Message,
    responseDeserialize: deserialize_sandglass_Message,
  },
  fetchRange: {
    path: '/sandglass.BrokerService/FetchRange',
    requestStream: false,
    responseStream: true,
    requestType: sandglass_pb.FetchRangeRequest,
    responseType: sandglass_pb.Message,
    requestSerialize: serialize_sandglass_FetchRangeRequest,
    requestDeserialize: deserialize_sandglass_FetchRangeRequest,
    responseSerialize: serialize_sandglass_Message,
    responseDeserialize: deserialize_sandglass_Message,
  },
  consumeFromGroup: {
    path: '/sandglass.BrokerService/ConsumeFromGroup',
    requestStream: false,
    responseStream: true,
    requestType: sandglass_pb.ConsumeFromGroupRequest,
    responseType: sandglass_pb.Message,
    requestSerialize: serialize_sandglass_ConsumeFromGroupRequest,
    requestDeserialize: deserialize_sandglass_ConsumeFromGroupRequest,
    responseSerialize: serialize_sandglass_Message,
    responseDeserialize: deserialize_sandglass_Message,
  },
  acknowledge: {
    path: '/sandglass.BrokerService/Acknowledge',
    requestStream: false,
    responseStream: false,
    requestType: sandglass_pb.OffsetChangeRequest,
    responseType: sandglass_pb.OffsetChangeReply,
    requestSerialize: serialize_sandglass_OffsetChangeRequest,
    requestDeserialize: deserialize_sandglass_OffsetChangeRequest,
    responseSerialize: serialize_sandglass_OffsetChangeReply,
    responseDeserialize: deserialize_sandglass_OffsetChangeReply,
  },
  acknowledgeMessages: {
    path: '/sandglass.BrokerService/AcknowledgeMessages',
    requestStream: false,
    responseStream: false,
    requestType: sandglass_pb.MultiOffsetChangeRequest,
    responseType: sandglass_pb.OffsetChangeReply,
    requestSerialize: serialize_sandglass_MultiOffsetChangeRequest,
    requestDeserialize: deserialize_sandglass_MultiOffsetChangeRequest,
    responseSerialize: serialize_sandglass_OffsetChangeReply,
    responseDeserialize: deserialize_sandglass_OffsetChangeReply,
  },
  commit: {
    path: '/sandglass.BrokerService/Commit',
    requestStream: false,
    responseStream: false,
    requestType: sandglass_pb.OffsetChangeRequest,
    responseType: sandglass_pb.OffsetChangeReply,
    requestSerialize: serialize_sandglass_OffsetChangeRequest,
    requestDeserialize: deserialize_sandglass_OffsetChangeRequest,
    responseSerialize: serialize_sandglass_OffsetChangeReply,
    responseDeserialize: deserialize_sandglass_OffsetChangeReply,
  },
};

exports.BrokerServiceClient = grpc.makeGenericClientConstructor(BrokerServiceService);
var InternalServiceService = exports.InternalServiceService = {
  getByKey: {
    path: '/sandglass.InternalService/GetByKey',
    requestStream: false,
    responseStream: false,
    requestType: sandglass_pb.GetRequest,
    responseType: sandglass_pb.Message,
    requestSerialize: serialize_sandglass_GetRequest,
    requestDeserialize: deserialize_sandglass_GetRequest,
    responseSerialize: serialize_sandglass_Message,
    responseDeserialize: deserialize_sandglass_Message,
  },
  hasKey: {
    path: '/sandglass.InternalService/HasKey',
    requestStream: false,
    responseStream: false,
    requestType: sandglass_pb.GetRequest,
    responseType: sandglass_pb.HasResponse,
    requestSerialize: serialize_sandglass_GetRequest,
    requestDeserialize: deserialize_sandglass_GetRequest,
    responseSerialize: serialize_sandglass_HasResponse,
    responseDeserialize: deserialize_sandglass_HasResponse,
  },
  fetchFromSync: {
    path: '/sandglass.InternalService/FetchFromSync',
    requestStream: false,
    responseStream: true,
    requestType: sandglass_pb.FetchFromSyncRequest,
    responseType: sandglass_pb.Message,
    requestSerialize: serialize_sandglass_FetchFromSyncRequest,
    requestDeserialize: deserialize_sandglass_FetchFromSyncRequest,
    responseSerialize: serialize_sandglass_Message,
    responseDeserialize: deserialize_sandglass_Message,
  },
  lastOffset: {
    path: '/sandglass.InternalService/LastOffset',
    requestStream: false,
    responseStream: false,
    requestType: sandglass_pb.LastOffsetRequest,
    responseType: sandglass_pb.LastOffsetReply,
    requestSerialize: serialize_sandglass_LastOffsetRequest,
    requestDeserialize: deserialize_sandglass_LastOffsetRequest,
    responseSerialize: serialize_sandglass_LastOffsetReply,
    responseDeserialize: deserialize_sandglass_LastOffsetReply,
  },
  markConsumed: {
    path: '/sandglass.InternalService/MarkConsumed',
    requestStream: false,
    responseStream: false,
    requestType: sandglass_pb.OffsetChangeRequest,
    responseType: sandglass_pb.OffsetChangeReply,
    requestSerialize: serialize_sandglass_OffsetChangeRequest,
    requestDeserialize: deserialize_sandglass_OffsetChangeRequest,
    responseSerialize: serialize_sandglass_OffsetChangeReply,
    responseDeserialize: deserialize_sandglass_OffsetChangeReply,
  },
  getMarkStateMessage: {
    path: '/sandglass.InternalService/GetMarkStateMessage',
    requestStream: false,
    responseStream: false,
    requestType: sandglass_pb.OffsetChangeRequest,
    responseType: sandglass_pb.Message,
    requestSerialize: serialize_sandglass_OffsetChangeRequest,
    requestDeserialize: deserialize_sandglass_OffsetChangeRequest,
    responseSerialize: serialize_sandglass_Message,
    responseDeserialize: deserialize_sandglass_Message,
  },
};

exports.InternalServiceClient = grpc.makeGenericClientConstructor(InternalServiceService);
