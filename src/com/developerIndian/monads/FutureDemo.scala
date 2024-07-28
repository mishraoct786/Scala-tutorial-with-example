package com.developerIndian.monads
import scala.concurrent._
import ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

class FutureDemo {

}

object FutureDemo{
  def main(args: Array[String]): Unit = {
    val future = Future {
      // Some long-running computation
      Thread.sleep(1000)
      42
    }
    val future2 = future.map(result => result * 2)
    future.onComplete {
      case Success(value) => println(s"The result is $value")
      case Failure(exception) => println(s"Failed with exception: $exception")

    }
    future2.onComplete {
      case Success(value) => println(s"The result is $value")
      case Failure(exception) => println(s"Failed with exception: $exception")

    }
  }
}