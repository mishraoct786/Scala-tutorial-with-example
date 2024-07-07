package com.developerIndian.collection

import scala.collection.mutable._

class TestStack {

}

class Fruit
class Apple extends Fruit
class Banana extends Fruit

object TestStack {

  def main(args: Array[String]): Unit = {


    val stack = new Stack[Fruit]
    val apple =new Apple()
    val banana = new Banana()

    stack.push(apple)
    stack.push(banana)
    print(stack)
  }
}