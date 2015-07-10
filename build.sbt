name := "json-performance-testing"

scalaVersion := "2.11.7"

libraryDependencies += "net.liftweb" %% "lift-json" % "2.6.2"

mainClass in Compile := Some("me.frmr.jsonperf.JsonPerformanceTesting")
