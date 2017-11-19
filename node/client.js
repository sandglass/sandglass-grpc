var grpc = require('grpc');

var sgProto = grpc.load('../sgproto/sandglass.proto');

var client = new sgProto.sandglass.BrokerService('127.0.0.1:7170', 
  grpc.credentials.createInsecure());

var topicName = "emails";

var topic = client.GetTopic({
  name: topicName
}, function (err, params) {
  if (err) {
    console.log("got error", err)
    return ;
  }

  partition = params.partitions[0]
  var stream = client.ConsumeFromGroup({
    topic: topicName,
    partition: partition,
    consumerGroupName: "group1",
    consumerName: "cons1"
  })

  stream.on('data', function(message) {
    // console.log(message);
  });

  stream.on('error', function(err) {
    console.log("error", err);
  });
  
  stream.on('end', function() {
    console.log("done")
  });

})


