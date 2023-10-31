package com.developerIndian.usecase

class LeftFoldDemo {
def myFunction(): Unit ={
  val numbers = List(1, 2, 3, 4, 5)

  val sum = numbers.foldLeft(3)((acc, num) => acc + num)
  print(sum)
}
}

object LeftFoldDemo{
  def main(args: Array[String]): Unit = {
    val obj =new LeftFoldDemo
      obj.myFunction()
  }
}