package com.developerIndian.usecase.StringType

class StringCountLetter {

}
object StringCountLetter {
  def main(args: Array[String]): Unit = {
    val str= "hello world"
    print(str.split(" ").length)
    var count : Int= 0
    var list= str.toList
    var map: Map[String, Int] = Map()
    list.foreach(i=>
    {
      count=0
      for (n <- list )
      {

        if (i == n)
          count=count+1

      }

      map=Map(i.toString -> count) ++ map

    }
    )

    print(map)
  }
}