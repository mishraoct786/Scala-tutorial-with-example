package com.developerIndian.ETA_EXPANSION

class Demo {

}
object Demo {
 // def map[B](f: A => B): List[B]
  //            ^^^^^^ function type from `A` to `B`
  def main(args: Array[String]): Unit = {
    def times10(i: Int) = i * 10   // a method
    val obj=List(1, 2, 3).map(times10)     // List(10,20,30)
    print(obj )
  }
}