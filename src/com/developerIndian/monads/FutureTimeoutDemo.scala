package com.developerIndian.monads
import scala.concurrent.duration._
import scala.concurrent.Await
import scala.concurrent.Future
import scala.concurrent._
import ExecutionContext.Implicits.global
import scala.util.{Failure, Success}
class FutureTimeoutDemo {

}
object FutureTimeoutDemo {
  def main(args: Array[String]): Unit = {
    val future = Future { 10 }

    try {
      val result = Await.result(future, 2.seconds)
      println(s"The result is $result")
    } catch {
      case e: TimeoutException => println("The operation timed out")
    }
  }
}