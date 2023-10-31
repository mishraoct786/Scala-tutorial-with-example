package com.developerIndian.collection

import scala.collection.immutable._

object ArrayTest
{
  def show(arr :Array[Int]){
    for(a<-arr)                       // Traversing array elements
      println("element"+a)
     // println("Third Element  = "+ arr(2))        // Accessing elements by using index
  }
  def addElementInArray(arr : Array[Int] , element : Int) : Array[Int]={
   var result =   element +: arr
    result
  }
  def removeElementInArray(arr : Array[Int] , element : Int) : Array[Int]={
    var result =   arr.filter(! _.equals(element))
    result
  }
  def main(args: Array[String])
  {
     var arr = Array(1,2,3,4,5)      // Creating single dimensional array
     show(arr)
    show(    addElementInArray(arr, 100))
    show(removeElementInArray(arr, 3))
  }

}