package com.developerIndian.monads

class Example2 extends App{
  val maybeValue: Option[Int] = Some(42)
  val result = maybeValue.map(_ * 2)
  // The result will be Some(84)

  val missingValue: Option[Int] = None
  val anotherResult = missingValue.map(_ * 2)
  // The result will be None
}

