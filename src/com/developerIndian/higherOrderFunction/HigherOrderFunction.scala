package com.developerIndian.higherOrderFunction

case class HigherOrderFunction() {
  def myGreatingDemo(name : String , f:(Int ,Int)=>  Int) :Int ={
    f(name.length, 10)
  }
  def sum (x:Int ,y:Int ) = x+y
  def minus(x:Int , y : Int ) = y-x


  //here  Higher-order function that takes a function f and two integers as arguments
  def operate(f: (Int, Int) => Int, x: Int, y: Int): Int = {
    f(x, y)
  }

  def operate1(f:(Int,Int)=>Int,a:Int ,b:Int):Int ={
    f(a,b)
  }

  // define functions to pass as arguments
  def add(a: Int, b: Int): Int = a + b
  def multiply(a: Int, b: Int): Int = a * b

  // calling of the higher-order function with different functions
  val resulAdd       = operate(add, 3, 5)        // Result: 8 (3 + 5)
  val resultMultiply = operate(multiply, 3, 5)   // Result: 15 (3 * 5)

}
object HigherOrderFunction {
  def main(args: Array[String]): Unit = {
   val x= HigherOrderFunction()
    println("this is operator  " + HigherOrderFunction().operate((a, b) => a * b, 3, 5))
    // println(resulAdd)
    println("my greating " + HigherOrderFunction().myGreatingDemo("shubham", HigherOrderFunction().minus))
  }
}