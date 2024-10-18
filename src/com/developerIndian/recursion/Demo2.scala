package com.developerIndian.recursion

import scala.annotation.tailrec

/* creating isprime function program using tail recursion */

class Demo2 {

}
object Demo2{
def isPrime(n:Int): Boolean ={

  @tailrec
  def helper(x: Int, accumulator: Int): Boolean = {
    if (n==1 )
      false
    else if (accumulator == 1)
      true
    else if (n % accumulator != 0)
     { helper(accumulator, accumulator-1) }
    else
      false
  }
  helper(n,n-1)
}
  def main(args: Array[String]): Unit = {
     print(isPrime(1398888))
  }
}
