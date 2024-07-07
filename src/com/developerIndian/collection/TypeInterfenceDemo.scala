package com.developerIndian.collection

class TypeInterfenceDemo {
  var arr=Array(1,2,3,4)
  def show(): Unit ={
    for (a<- arr)
      println(a)
  }
  def first(x: Int) = (y: Int) => x + y

  def marth(a:Int,b:Int , f:( Int,Int) => Int) : Int = f(a,b)


  }

object TypeInterfenceDemo{
  def main(args: Array[String]): Unit = {
    var a=  new TypeInterfenceDemo()
    a.show()
    a.marth(1,2,(x,y)=>x*y)
  }
}
