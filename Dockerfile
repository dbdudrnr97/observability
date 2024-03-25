FROM bellsoft/liberica-openjdk-alpine:17
ARG JAR_FILE=build/libs/\*.jar
ARG JAVA_AGENT=/home/ubuntu/my-project/observability/otel/*.jar
COPY ${JAR_FILE} app.jar
COPY ${JAVA_AGENT} /otel/opentelemetry-agent.jar
ENTRYPOINT java -javaagent:/otel/opentelemetry-agent.jar \
    -Dotel.resource.attributes=service.instance.id=$HOSTNAME \
    -jar /app.jar
