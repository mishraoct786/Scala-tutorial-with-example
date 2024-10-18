package com.developerIndian.patternmatching
trait Shape;
case class Circle(radius:Double) extends Shape
case class Rectangle(height: Double , width :Double) extends Shape
case class Triangle (double: Double , height : Double) extends Shape

object DemoPatternMatching {
  def myMatch (shape: Shape): String = shape match
    {
    case shape:Circle => "this is circle"
    case shape:Rectangle=> "this is rectangle"
    case shape:Triangle => "this is triangle"
  }
  def main(args: Array[String]): Unit = {
    val circle = Circle(100)
    val rectangle= Rectangle(100,200)
    print(myMatch(rectangle))
    }
}
