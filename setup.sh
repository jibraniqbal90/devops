#! /bin/bash
# Make sure namespace with dev exists.

eval $(minikube docker-env)

# Create build
cd test && ./gradlew build
cd ../caller && ./gradlew build
cd ..
# Create images
docker build -t caller caller && docker build -t test test
kubectl apply -f test/test-deploy.yaml && kubectl apply -f caller/caller-deploy.yaml
kubectl apply -f test/test-svc.yaml && kubectl apply -f caller/caller-svc.yaml

# Goto Postman and fire the curl below:
# curl --location --request GET 'http://192.168.64.2:32001/call'
