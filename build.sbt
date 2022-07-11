name := """practice1"""
organization := "com.indipais"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.8"

libraryDependencies ++=Seq( guice,
"org.projectlombok" % "lombok" % "1.18.16" % "provided")
