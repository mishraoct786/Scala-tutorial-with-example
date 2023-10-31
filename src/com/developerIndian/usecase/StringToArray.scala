package com.developerIndian.usecase

class StringToArray {

}
object StringToArray{
  def main(args: Array[String]): Unit = {

val str = "i love my india"
var arr=str.toArray
    println(arr(1) +arr(4) +arr(0))
    val arr1=str.toCharArray().toList
  arr= arr  :+ 'u'
 var ar3=   arr.mkString
    print(ar3)
//arr.foreach(println)

  }
}