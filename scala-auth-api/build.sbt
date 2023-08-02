lazy val root = (project in file("."))
  .settings(
      name := "scala-auth-api",
      version := "0.1.0",
      scalaVersion := "2.13.6",
      libraryDependencies ++= Seq(
          // Add your Scala dependencies here
      )
  )
