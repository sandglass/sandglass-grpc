all: protobuf

.PHONY: protobuf
protobuf:
	docker-compose build protos && docker-compose run protos