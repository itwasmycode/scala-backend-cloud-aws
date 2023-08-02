ThisBuild / scalaVersion     := "2.13.5"
ThisBuild / version          := "0.1.0"
ThisBuild / organization     := ""
ThisBuild / organizationName := ""

lazy val root = (project in file("."))
  .settings(
        name := "scala-auth-api",
    libraryDependencies ++= Seq(
      // Add other dependencies here
      "com.amazonaws" % "aws-lambda-java-core" % "1.2.1"
    ),
        addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.15")
  )