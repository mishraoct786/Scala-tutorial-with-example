package com.developerIndian.collection.listexample

class Demo1 {

}
object Demo1{
  def main(args: Array[String]): Unit = {
    val firstTen = (1 to 10).toList            // List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
   println( firstTen.reduceLeft(_ + _)   )              // 55
   println( firstTen.foldLeft(100)(_ + _))
    println( firstTen.reduceRight(_ + _)   )              // 55
    println( firstTen.foldRight(100)(_ + _))

    val str=List("a","b","c")
    println( str.foldRight("A")(_ + _))
    println( str.foldLeft(" ")(_ + _))
    println( str.reduceLeft(_ + _)   )

    case class Student(Name: String)
    val obj= Student("shubham")
    val hetero= Array(1,"2","4",true,obj)
    val heteroList= List(1,"2","4",true,obj)
    println(hetero)
    hetero.foreach(println)
  }
}