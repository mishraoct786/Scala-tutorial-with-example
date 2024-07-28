package com.developerIndian.Singleton_object

import scala.math._

class Circle(radius: Double) {
  import Circle._
  def area: Double = calculateArea(radius)
}

object Circle {
  private def calculateArea(radius: Double): Double =
    Pi * pow(radius, 2.0)
}

object Demo2 {
  def main(args: Array[String]): Unit = {
    val circle1 = new Circle(5.0)
    circle1.area // Double = 78.53981633974483
    val circle2 = new Circle(7)
    println(circle2.area)
  }

}