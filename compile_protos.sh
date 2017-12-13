#!/bin/sh

protoc 	\
		-I/protobuf \
		--swagger_out=logtostderr=true:swagger \
		\
		--gofast_out=plugins=grpc:go/sgproto \
		--grpc-gateway_out=logtostderr=true:go/sgproto \
		\
		--python_out=plugins=grpc:python \
		--grpc-python_out=python \
		--plugin=protoc-gen-grpc-python=/usr/bin/grpc_python_plugin \
		\
		--ruby_out=plugins=grpc:ruby \
		--grpc-ruby_out=ruby \
		--plugin=protoc-gen-grpc-ruby=/usr/bin/grpc_ruby_plugin \
		\
		--java_out=java/src/main/java \
		--grpc-java_out=java/src/main/java \
		\
		--proto_path=sgproto \
	sgproto/sandglass.proto


# keep this config here currently in order to build a static node.js client
# \
# --js_out=import_style=commonjs,binary:node \
# --grpc-node_out=node \
# --plugin=protoc-gen-grpc-node=/usr/bin/grpc_node_plugin \