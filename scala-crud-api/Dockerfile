# Define the base image with OpenJDK 11 (or later) and Scala SBT 1.5.x (for Scala 3 support)
FROM hseeberger/scala-sbt:11.0.12_1.5.5_2.13.6

# Set the working directory inside the container
WORKDIR /app

# Copy the Scala source code and build.sbt to the container
COPY . /app

# Build the Scala project
RUN sbt compile

# Run the Scala application
CMD ["sbt", "run"]
