package com.developerIndian.monads

import scala.concurrent.Future
import scala.concurrent._
import ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

class ComprehensionsFutureDemo {

}

object ComprehensionsFutureDemo{
  def main(args: Array[String]): Unit = {
    val future1= Future(10)
    val future2 = Future(11)


  val combinedFuture = for {
    result1 <- future1
    result2 <- future2
  } yield result1 + result2

  combinedFuture.onComplete {
    case Success(value) => println(s"The combined result is $value")
    case Failure(exception) => println(s"Failed with exception: $exception")
  }
  }
}
