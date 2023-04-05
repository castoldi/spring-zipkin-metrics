# spring-zipkin-metrics
Sample app for Spring Boot + Zipkin metrics

## Manual Download
https://repo1.maven.org/maven2/io/zipkin/zipkin-server/2.24.0/zipkin-server-2.24.0-slim.jar

## Running via Java:

```
curl -sSL https://zipkin.io/quickstart.sh | bash -s io.zipkin:zipkin-server:LATEST:slim zipkin.jar
java -jar zipkin.jar
```

## Running via Docker:

```
# Note: this is mirrored as ghcr.io/openzipkin/zipkin-slim
docker run -d -p 9411:9411 openzipkin/zipkin-slim
```

## Testing

* Start Zipkin server
* Start Spring Boot application.
* Access http://localhost:8080 a couple of times to generate tracing.
* Access Zipkin on http://127.0.0.1:9411/ and find the traces
