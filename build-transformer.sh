#!/bin/bash

# Build and push transformer image

docker build -t wetransform/hale-transformer:latest images/hale-transformer
