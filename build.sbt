name := "[STUB]"

version := "SNAPSHOT"

organization := "name.dmitrym"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.4.8",
  "com.typesafe.akka" %% "akka-testkit" % "2.4.8" % "test",
  "org.specs2" %% "specs2-core" % "3.8.4" % "test",
  "org.specs2" %% "specs2-scalacheck" % "3.8.4" % "test"
)

scalacOptions ++= Seq(
  "-deprecation", "-feature", "-unchecked", "-Xlint:_", "-Ydead-code", "-Yopt:_", "-Ywarn-dead-code",
  "-Ywarn-numeric-widen", "-Ywarn-unused", "-Ywarn-unused-import", "-Ywarn-value-discard"
  )

scalacOptions in Test ++= Seq(
  "-Yrangepos"
  )

javacOptions ++= Seq(
  "-deprecation", "-Xlint"
  )

incOptions := incOptions.value.withNameHashing(true)
