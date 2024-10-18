package com.developerIndian.my_abstract

class Animal {
  def eat()="inside animal "
}

class Dog extends Animal{
  override def eat(): String = s"inside dog"
}
object DemoAbstract {
  def main(args: Array[String]): Unit = {
    var an : Animal= new Dog()
    print(an.eat())
  }
}

//abstract class
abstract class DemoAbstract {
 protected var walk = Nil     // all field are by default public
 def walkThroughLeg() : Unit //all method are by default public
def walkWithChair(Name : String ) : String
}

