all: protobuf

.PHONY: protobuf
protobuf:
	sed 's/import/\/\/ import/g' sgproto/sandglass.proto > node/sandglass_no_import.proto
	docker-compose run protos