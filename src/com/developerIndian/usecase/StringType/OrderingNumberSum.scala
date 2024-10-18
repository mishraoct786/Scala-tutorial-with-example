package com.developerIndian.usecase.StringType

object  OrderingNumberSum {
  def main(args: Array[String]): Unit = {
    var list  = List (100,11 ,23,34,302)
    var x : List[String]= list.map(i => i.toString)
    var y = x.map(i => i.map(i=>i.asDigit))
    var z=y.map(i=> i.sum)
    z.map(println)

    val str= "hello world"
    var h= str.map(i=>if(i.isDigit) 0 else 1)
    print(h)
  }

}
