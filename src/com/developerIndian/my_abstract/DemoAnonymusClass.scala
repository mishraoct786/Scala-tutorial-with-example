package com.developerIndian.my_abstract

abstract class My_Animal {
  def eat():String =s"inside My animal"
}

class DemoAnonymusClass extends My_Animal {
override def eat() = s" insside demo class"
}
object DemoAnonymusClass {

  def main(args: Array[String]): Unit = {
    val demo = new DemoAnonymusClass{ override  def eat() = "inside anonymous"}
    println(demo.eat())
  }


}
