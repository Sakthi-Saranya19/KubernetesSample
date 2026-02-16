This project demonstrates a minimal production-ready microservice. It is designed to be containerized and deployed into a Kubernetes cluster, utilizing standard industry practices for service discovery and health management.

Key Features
Simple REST Endpoint: Returns a plain text response.

Containerized: Optimized multi-stage Dockerfile.

K8s Manifests: Includes Deployment and Service YAML configurations.

Self-Healing: Integrated with Kubernetes Liveness and Readiness probes.

🏗️ Architecture
The application runs as a Deployment with multiple replicas to ensure high availability. A Service acts as a load balancer to route traffic to the available Pods.

🛠️ Prerequisites
Java 17+ & Maven

Docker

kubectl

A Kubernetes cluster (Minikube, Kind, or Docker Desktop K8s)
