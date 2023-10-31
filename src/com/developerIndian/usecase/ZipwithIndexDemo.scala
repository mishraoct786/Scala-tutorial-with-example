package com.developerIndian.usecase

class ZipWithIndexDemo{
  val days = Array("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")

  def zipWithIndexTest(): Unit ={
    days.zipWithIndex.foreach {
      case(day, count) =>  println(s"$count is $day")
    }

  }
  def zipWithIndexTest1(): Unit ={
    days.zipWithIndex.map {
      case(day, count) =>  println(s"$count is $day")
    }

  }

}
object ZipWithIndexDemo{
  def main (args: Array[String] ): Unit = {
  new ZipWithIndexDemo().zipWithIndexTest
    new ZipWithIndexDemo().zipWithIndexTest1

  }
}

