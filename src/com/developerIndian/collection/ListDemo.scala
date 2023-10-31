package com.developerIndian.collection

class ListDemo {
  var list= List(1,2,3,4,5)
  def removeElementfromList(list : List[Int]): List[Int]=
   list.filter(_ != 2)

}

object ListDemo {
  var numbers =  List(1,2,3,4,5,6)
 var s= numbers.sum
 var p= numbers.product
 var mn= numbers.min
 var mx= numbers.max

  def main(args: Array[String]): Unit = {
    println(numbers)
    println(s)
    println(p)
    println(mn)
    println(mx)
    println()
  }
}