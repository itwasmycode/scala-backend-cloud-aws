lazy val root = (project in file("."))
  .settings(
    name := "your-scala-lambda-function",
    version := "0.1.0",
    scalaVersion := "2.13.5",
    libraryDependencies ++= Seq(
      // Add your Scala dependencies here
    ),
    assembly / assemblyOutputPath := file("target/scala-2.13/your-scala-lambda-function-assembly.jar")
  )
