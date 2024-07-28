package com.developerIndian.monads
import scala.concurrent.Future
import scala.concurrent._
import ExecutionContext.Implicits.global
import scala.util.{Failure, Success}
class FutureFailureHandleDemo {

}
object  FutureFailureHandleDemo {
  val failedFuture = Future {
    throw new RuntimeException("Something went wrong")
  }

  val recoveredFuture = failedFuture.recover {
    case e: RuntimeException => 0
  }

  recoveredFuture.onComplete {
    case Success(value) => println(s"Recovered result is $value")
    case Failure(exception) => println(s"Failed with exception: $exception")
  }

}