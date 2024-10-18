package com.developerIndian.patternmatching

object DemoNumToString {

  def main(args: Array[String]): Unit = {
    def matchTest(x: Int): String = x match {
      case 1 => "one"
      case 2 => "two"
      case _ => "other"
    }
    println(matchTest(3) ) // returns other
    print(matchTest(1))
  }
}
