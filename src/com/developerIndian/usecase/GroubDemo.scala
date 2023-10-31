package com.developerIndian.usecase

class GroubDemo {

}
object GroubDemo{
  def main(args: Array[String]): Unit = {
    var l1= List("anc", "ahg", "tyh","anc", "ahg", "tyh")
    var x= List("anc", "ahg", "tyh","anc", "ahg", "tyh")
    //l1.groupBy(x => x.length()).foreach(println)

   // x.groupBy(i=>i).foreach(println)
    x.grouped(2).foreach(println)

  }
}