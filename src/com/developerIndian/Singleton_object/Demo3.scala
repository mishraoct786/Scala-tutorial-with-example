package com.developerIndian.Singleton_object

class Demo3 {

}
object Demo3
{
  def main(args: Array[String]): Unit = {
    import MathService._
    println(add(1, 1)) // 2
    println(multiply(2, 2)) // 4
  }

}