package com.developerIndian.closure

object  ClouserDemo {
  def createMultiplier(factor: Int): Int => Int = {
    (x: Int) => x * factor
  }
  def main(args: Array[String]): Unit = {
    val timesTwo = createMultiplier(2)
    println(timesTwo(5)) // Outputs: 10

  }
}
