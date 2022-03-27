organization := "com.ru.waka"

name := "scala-json-samples"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.13.6"

libraryDependencies ++= Seq(
  "org.json4s"   %% "json4s-jackson" % "4.0.4",
  "io.circe" %% "circe-core" % "0.14.1",
  "io.circe" %% "circe-generic" % "0.14.1",
  "io.circe" %% "circe-parser" % "0.14.1",
  "com.typesafe.play" %% "play-json" % "2.9.2"
)

