# spring_zipkin_metrics
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

## Access the traces

http://127.0.0.1:9411/
