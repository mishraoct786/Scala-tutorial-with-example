package com.developerIndian.monads
import scala.concurrent.Future
import scala.concurrent._
import ExecutionContext.Implicits.global
import scala.util.{Failure, Success}
class CombiningFuturesDemo {

}
object CombiningFuturesDemo{
  def main(args: Array[String]): Unit = {
    val futureList = List(Future { 1 }, Future { 2 }, Future { 3 })
    val combinedFuture = Future.sequence(futureList)

    combinedFuture.onComplete {
      case Success(values) => println(s"The combined results are $values")
      case Failure(exception) => println(s"Failed with exception: $exception")
    }
  }
}