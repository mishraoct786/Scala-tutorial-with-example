package com.developerIndian.recursion
/* creating factorial program using tail recursion */
import scala.annotation.tailrec

class Demo {
}



object Demo {

  def newFactorial(n:Int) :Int = {
    @tailrec
  def helper(x: Int, accumulator: Int): Int =
    if (x <= 1) accumulator
    else
      helper(x - 1, x * accumulator)
    helper(n,1)

}



  def factorial(n:Int) :Int =
    if (n<=1)
      1
    else{
      n*factorial(n-1)
    }

  def main(args: Array[String]): Unit = {
    println(factorial(4));
  }
}