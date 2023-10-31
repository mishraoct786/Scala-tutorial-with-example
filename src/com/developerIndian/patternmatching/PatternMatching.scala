package com.developerIndian.patternmatching

object PatternMatching {
  def main(args: Array[String]): Unit = {
    val amount =10
    val result :String = amount match {
      case 10 => "hi shubham 10"
      case 20=> "hi shubham 20 "
      case _=> "no available "
    }
    println("result"+ result)
  }
}
