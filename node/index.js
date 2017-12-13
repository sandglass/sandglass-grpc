var grpc = require('grpc');
module.exports = grpc.load({root: __dirname, file: 'sandglass_no_import.proto'}).sandglass
