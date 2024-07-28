package com.developerIndian.currying

//Currying is the process of converting a function with multiple arguments into a sequence of functions that take one argument.

class CurryingDemo {

}
object CurryingDemo {
  //def multiply(a:Int,b:Int,c:Int): Int= a*b*c
   def multiply(a:Int)(b:Int)(c:Int)=a*b*c
  //  multiply: (a: Int)(b: Int)(c: Int)Int.
  def main(args: Array[String]): Unit = {
    var mul=multiply(2)(3)(4)
    println("value of element"+mul)
  }

}
