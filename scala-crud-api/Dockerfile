# Use a base Docker image that includes JDK, Scala, and sbt
FROM hseeberger/scala-sbt:11.0.12_1.5.5_2.13.6

# Set the working directory inside the container
WORKDIR /app

# Copy the sbt project files into the container
COPY build.sbt /app/
COPY project/ /app/project/

# Copy the source code into the container
COPY src/ /app/src/

# Build the Scala project with sbt-assembly
RUN sbt assembly