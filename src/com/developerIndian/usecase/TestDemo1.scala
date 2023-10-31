package com.developerIndian.usecase

class TestDemo1{
  val list =  List(1, "a", 2, "b", 3, "c")

  def convertMapToList(): Unit =
  {

    var num =  0
    var charObj = ""
    var map1: Map[Int , String]  = Map()
    for(l <- 1 to  list.length)
    {
      print(l)
      if ( l %2 == 0)
      {
        charObj = list(l-1).toString

      }
      else
      {
        num = list(l-1).asInstanceOf[Int]

      }
      var map =Map(num -> charObj)
      map1 = map1 ++ map
    }
   map1.foreach(println)
    //to Map => Map(1 -> “a”, 2 -> “b”)
  }

  def convertToMap1(): Unit ={
   // list .zipWithIndex.map{ case(v,i) => (i,)}.toMap
  val map=  list .zipWithIndex.map{ case(v,i) => (i,v )}.toMap
    println("The values of map : "+ map)

  }
  def convertToMap2(): Unit ={
    val progLang =   List(1, "a", 2, "b", 3, "c")
    val map = progLang.zipWithIndex.map{ case (v,i) =>
      if (i!= progLang.length-1  )
        (progLang(i),progLang(i+1))   }
    println("The values of map : "+ map)
  }

  def convertToMap3(): Unit ={
    val progLang =   List(1, "a", 2, "b", 3, "c")
    val map = progLang.zipWithIndex.partition(_._2 % 2 == 0)._2
    println("The values of map : "+ map)
  }
}
object TestDemo1 {
  def main(args: Array[String]): Unit = {
   val obj = new TestDemo1
   //obj.convertToMap3()
    List(1, 2, 3, 4).zipWithIndex.foreach{
      case (element, index) if index == 3 => println("last element")
      case (element, index) => println(element)
    }
   // println(List(1,"a,",3,"b").partition(x => x.isInstanceOf(Integer)))
    //obj.convertMapToList
    var myList = List(1,"a",2,"b" ,3,"c")
    val resultMap: Map[Int, String] = myList.grouped(2).collect {
      case List(key: Int, value: String) => key -> value
    }.toMap
    print(resultMap)
  }


}
