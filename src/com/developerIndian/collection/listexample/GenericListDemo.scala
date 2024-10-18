package com.developerIndian.collection.listexample
abstract class MyList[T]{
  def head : T
  def tial : MyList[T]
}

object GenericListDemo {
  def main(args: Array[String]): Unit = {
    val list : List[Int]= List (1,2,3,4,5)
    println(list.head)
    println(list.tail)
  }
}
