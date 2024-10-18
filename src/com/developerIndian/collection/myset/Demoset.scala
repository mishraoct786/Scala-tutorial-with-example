package com.developerIndian.collection.myset

object Demoset {
  def main(args: Array[String]): Unit = {
    var s = Set(1,5,7,8,9)
    s= s-7
    println(s)
    s=s+99
    println(s(99))
    println(s)
  }
}
