package com.developerIndian.monads

class Example1 {

}
object Example1{

  def main(args: Array[String]): Unit = {
    import scala.util.Try

    def divide(a: Int, b: Int): Try[Int] = Try(a / b)

    val result = divide(10, 2)
    // The result will be Success(5)

    val errorResult = divide(10, 0)
  }
}