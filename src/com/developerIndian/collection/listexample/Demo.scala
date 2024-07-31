package com.developerIndian.collection.listexample

class Demo {
}
object  Demo{
  def main(args: Array[String]): Unit = {
    // Range methods
    val b = (1 to 5).toList         // b: List[Int] = List(1, 2, 3, 4, 5)
    val c = (1 to 10 by 2).toList   // c: List[Int] = List(1, 3, 5, 7, 9)
    val e = (1 until 5).toList      // e: List[Int] = List(1, 2, 3, 4)
    val f = List.range(1, 5)        // f: List[Int] = List(1, 2, 3, 4)
    val g = List.range(1, 10, 3)    // g: List[Int] = List(1, 4, 7)
    println(b)
    println(c)
    println(e)
    println(f)
    println(g)
  }
}