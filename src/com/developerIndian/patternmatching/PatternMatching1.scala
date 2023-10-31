package com.developerIndian.patternmatching

object PatternMatching1 {
  def main(args: Array[String]): Unit = {
    val amount =10

    def competition2(result: Int) :String = result match {
      case 1 => "gold"
      case 2 => "silver"
      case 3 => "bronze"
      case 4 => "well done"
    }
    println("result"+ competition2(1))
  }
}
