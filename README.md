# edusubmit-config-server

Spring Boot 4.x based Spring Cloud Config Server for the EduSubmit microservices.

## Tech Stack

- Java 25
- Maven
- Spring Boot 4.x
- Spring Cloud Config Server
- Spring Boot Actuator

## Package

`com.edusubmit.configserver`

## Configuration

- Server port: `8888`
- Config Server enabled via `@EnableConfigServer`
- Native profile active for local development
- Config files served from local folder: `./config`
- Health endpoint available at: `http://localhost:8888/actuator/health`

## Run

1. Make sure Java 25 and Maven are installed.
2. From project root:

```bash
cd edusubmit-config-server
mvn spring-boot:run
```

## Build

```bash
cd edusubmit-config-server
mvn clean package
```

## Test Config Endpoints

Examples:

- `http://localhost:8888/api-gateway/default`
- `http://localhost:8888/student-service/default`
- `http://localhost:8888/submission-service/default`
- `http://localhost:8888/file-service/default`

## Included Example Client Configs

- `api-gateway.yml`
- `student-service.yml`
- `submission-service.yml`
- `file-service.yml`

All are located in:

`config/`
# edusubmit-config-server
