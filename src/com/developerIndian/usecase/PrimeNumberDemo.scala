package com.developerIndian.usecase

class PrimeNumberDemo {

}
object PrimeNumberDemo {
  def isPrime(n: Int): Boolean = {
    var set = true
    for (i <- 2 until n-1) {
      if (n % i == 0)
         { println(i); set= false }

    }
    set

  }


  def main(args: Array[String]): Unit = {

    println(PrimeNumberDemo.isPrime(97))
  }
}