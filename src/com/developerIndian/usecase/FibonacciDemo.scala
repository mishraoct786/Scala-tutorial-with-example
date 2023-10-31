package com.developerIndian.usecase

class FibonacciDemo {

}
object FibonacciDemo{

    def fibonacci(n: Int): Int = {
      if (n <= 0) {
        throw new IllegalArgumentException("Input must be a positive integer.")
      } else if (n == 1 || n == 2) {
        1
      } else {
        fibonacci(n - 1) + fibonacci(n - 2)
      }
    }

    def main(args: Array[String]): Unit = {
      try {
        val n = 5 // Change this value to compute Fibonacci for a different number.
        for(i <- 1 to n)
        println(s"The ${i}th Fibonacci number is: ${fibonacci(i)}")
      } catch {
        case ex: IllegalArgumentException =>
          println(ex.getMessage)
      }
    }
  }







