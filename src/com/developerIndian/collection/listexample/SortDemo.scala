package com.developerIndian.collection.listexample

object SortDemo {
  def main(args: Array[String]): Unit = {
    var list =List("shubham","rahul","amit","jyoti")
    list .map(ls=> ls(ls.length-1)).foreach(i=>println(i))
    list .sortBy(ls=> ls.length-1).foreach(i=>println(i))
    var str= "shubham"
    print(str(6))
  }


}
