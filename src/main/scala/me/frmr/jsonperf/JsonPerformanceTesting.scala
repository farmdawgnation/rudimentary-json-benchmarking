package me.frmr.jsonperf

import net.liftweb.json._
  import JsonDSL._

import scala.io.Source

object JsonPerformanceTesting {
  val jsonString = Source.fromInputStream(getClass.getClassLoader.getResourceAsStream("sample.json")).mkString
  val jsonJValue = parse(jsonString)

  def runTestWith(serializer: (JValue)=>String): Double = {
    (0 until 100).map({ _ =>
      val startTime = System.currentTimeMillis()
      serializer(jsonJValue)
      val endTime = System.currentTimeMillis()

      endTime - startTime
    }).foldLeft(0D)(_ + _) / 100D
  }

  def main(args: Array[String]) = {
    println("JSON Serialization Performance Testing\n")

    println("Running test with compactRender...")
    println(runTestWith(compactRender) + " ms average over 100 runs")
    println("")

    // Uncomment below for testing the *new* code in 3.0-SNAPSHOT.
    /*
    println("Running test with prettyRender...")
    println(runTestWith(JsonAST.prettyRender) + " ms average over 100 runs")
    println("")
    */

    // Uncomment below for testing the existing Document-based code in Lift 2.6.2!
    println("Running test with pretty(render(...))...")
    println(runTestWith( j => pretty(render(j)) ) + " ms average over 100 runs")
    println("")

    println("Running test with compact(render(...))...")
    println(runTestWith( j => compact(render(j)) ) + " ms average over 100 runs")
    println("")
  }
}
