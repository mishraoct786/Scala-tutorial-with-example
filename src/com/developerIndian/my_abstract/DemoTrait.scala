package com.developerIndian.my_abstract

trait DemoTrait {
def eat() :String
}
abstract class MyAnimal {
  def eat():String =s"inside My animal"
}

// scala has single class inheritance
class Elephant extends DemoTrait {
  def eat ():String= s"inside elephant"
}

//scala has multiple trait  inheritance [mixing]
class Tigher extends MyAnimal with  DemoTrait  {

  override def eat (): String= s"inside tiger"
}

object DemoTrait{
  def main(args: Array[String]): Unit = {
    val  DemoTrait = new Tigher
    println(DemoTrait.eat())
  }
}