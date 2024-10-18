package com.developerIndian.collection.listexample

class LoopDemo {

}
object LoopDemo{
  def main(args: Array[String]): Unit = {
    var ls= List (1,3,5,6,7)
    for (l:Int <- ls)
yield    {  print(l)}
  }
}