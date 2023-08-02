# Use the official GraalVM Docker image as the base image
FROM ghcr.io/graalvm/graalvm-ce:latest

# Set the working directory inside the container
WORKDIR /app

# Install necessary build tools
RUN gu install native-image

# Install unzip and curl on the container
RUN apt-get update && apt-get install -y unzip curl

# Copy the Scala project files into the container
COPY build.sbt /app/
COPY src/ /app/src/

# Install sbt and download project dependencies
RUN curl -s "https://get.sdkman.io" | bash
RUN bash -c "source $HOME/.sdkman/bin/sdkman-init.sh && sdk install sbt && sbt update"

# Build the Scala project with GraalVM native-image
RUN sbt assembly
RUN native-image -jar target/scala-2.13/scala-auth-api-assembly.jar

# Set the command to run your native image Lambda function
CMD ["./scala-crud-api-assembly"]
