/*
Type inference in Scala refers to the compiler’s ability to automatically deduce the
types of expressions without requiring the programmer to explicitly specify them.
Scala has a powerful type inference system that minimizes the need to write out type annotations,
making the code more concise while still retaining type safety.
 */
/*
1. Variable Type Inference
val x = 42    // Scala infers that x is of type Int
val y = "Hello"   // Scala infers that y is of type String
2. Method Return Type Inference
def add(a: Int, b: Int) = a + b   // Return type is inferred to be Int
3. Type Inference in Function Literals
val add = (a: Int, b: Int) => a + b   // Compiler infers the type of add as (Int, Int) => Int
val add = (_: Int) + (_: Int)  // More concise, type inference still works
4. Type Inference with Collections
val numbers = List(1, 2, 3, 4)   // Scala infers numbers as List[Int]
val names = Array("Alice", "Bob") // Scala infers names as Array[String]

5. Type Inference and Generic Types
def pair[A](a: A, b: A) = (a, b)
val p = pair(1, 2)   // Scala infers A as Int, so p is a tuple (Int, Int)

6. Type Inference with Polymorphism
val list = List(1, 2, 3)
list.map(_ * 2)  // The compiler infers that _ is of type Int, and the result is List[Int]

7. Limitations of Type Inference
def factorial(n: Int): Int = if (n == 0) 1 else n * factorial(n - 1)
8. Type Inference with Type Bounds
def min[T <: Comparable[T]](a: T, b: T): T = if (a.compareTo(b) < 0) a else b
 */
package com.developerIndian.typeinference

class TypeinferenceDemo {
  var arr=Array(1,2,3,4)
  def show(): Unit ={
    for (a<- arr)
      println(a)
  }
  def first(x: Int) = (y: Int) => x + y

  def marth(a:Int,b:Int , f:( Int,Int) => Int) : Int = f(a,b)


  }

object TypeInterfenceDemo{
  def main(args: Array[String]): Unit = {
    var a=  new TypeinferenceDemo()
    a.show()
    a.marth(1,2,(x,y)=>x*y)
    // first case assign long string ex "hello" to x variable
    //second case assign char as String ex "h" to x variable
    //Third case assign number as string ex "5" to x variable

    var x=10
    x="5".toInt
    println(x)
    var str = "shubham"
    var obj = Option(str)
    obj=null
    /*
      x=null

    an expression of type Null is ineligible for implicit conversion
    x=null
     */


  }
}
