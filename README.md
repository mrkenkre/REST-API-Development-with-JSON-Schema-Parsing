# Northeastern University (May 2023 - August 2023)

In this project, we will develop a REST API to parse a JSON schema model divided into three demos:

**Prototype demo 1**:
  - Develop a Spring Boot based REST API to parse a given sample JSON schema.
  - Save the JSON schema in a Redis key-value store.
  - Demonstrate the use of operations like GET, POST, and DELETE for the first prototype demo.

**Prototype demo 2**:
  - Regress on your model and perform additional operations like PUT and PATCH.
  - Secure the REST API with a security protocol like OAuth2.

**Prototype demo 3**:
  - Adding Elasticsearch capabilities.
  - Using RabbitMQ for REST API queuing.

![ArchitectureDiagram_page-0001](https://github.com/mrkenkre/INFO7255-BigDataIndexing/assets/44857610/c9f8ae6e-7803-4e84-aa31-2e36fef4a29d)

# Pre-requisites

Make sure you have the following prerequisites installed:

- Java
- Maven
- Redis Server
- Elasticsearch and Kibana (Local or cloud-based)
- RabbitMQ

# Build and Run

Follow these steps to build and run the project:

1. Start RabbitMQ
2. Start Elasticsearch
3. Start Redis
4. Run as Spring Boot Application in any IDE.

# Querying Elasticsearch

To query Elasticsearch, follow these steps:

1. Run both the applications, i.e., MedPlanApp.java . ListenerClass.java will create the indexes.
2. Run POST queries from Postman.
3. Run custom search queries as per your use case using Kibana.
