package com.developerIndian.collection.ArrayExample

object DemoArray {
  def main(args: Array[String]): Unit = {
    var str= "1223shubbham"
    var ar=str.toArray
    var ar1 = "1368".toArray
    for (i<- 0 to ar.length -1)
      {

      }
      ar.foreach(i=>{
        if(i.isDigit )
          {
            print(i.toString.toInt)
          }
      }

      )
    val inputString = "Hello123World456!"

    // Extract digits as a list of integers
    val digitList = "\\d+".r.findAllIn(inputString).map(_.toInt).toList

    println(digitList)  // Output: List(123, 456)

    // Extract digits from the string
    val digits = inputString.replaceAll("[^\\d]", "")

    println(digits)  // Output: 123456
  }

}
