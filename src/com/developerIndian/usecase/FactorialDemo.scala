package com.developerIndian.usecase

class FactorialDemo {

  def fact(x:Int) : Int ={   if (x==0) 1 else  x*fact(x-1) }
}

object test{
  def main(args: Array[String]): Unit = {
    var obj = new FactorialDemo
    print(obj.fact(3))
  }
}