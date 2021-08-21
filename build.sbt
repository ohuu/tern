ThisBuild / scalaVersion := "3.0.0"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.tern"
ThisBuild / organizationName := "PaperPlaneSoftware"

lazy val root = (project in file("."))
  .settings(
    name := "tern",
    libraryDependencies += "com.monovore" %% "decline" % "2.1.0"
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
