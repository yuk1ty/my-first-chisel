IMAGE = riscv/mycpu
HOST_ROOT = $(shell pwd)

build:
	docker build . -t $(IMAGE)

run:
	docker run -it -v $(HOST_ROOT):/src $(IMAGE)