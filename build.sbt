name := "json-performance-testing"

scalaVersion := "2.11.7"

libraryDependencies += "net.liftweb" %% "lift-json" % "3.0-SNAPSHOT"

mainClass in Compile := Some("me.frmr.jsonperf.JsonPerformanceTesting")
