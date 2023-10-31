package com.developerIndian.demo

class DemoCurrying {
}

object DemoCurrying {
  def curriedSum(x: Int)(y: Int): Int = x + y
  val increment: Int => Int = curriedSum(1)

  def main (args: Array[String] ): Unit = {
  print(increment(2))
}

}