package com.developerIndian.usecase

import scala.concurrent.{Future, Promise}
import scala.concurrent.{ Future, ExecutionContext }


// the following is equivalent to `implicit val ec = ExecutionContext.global`
import ExecutionContext.Implicits.global
object TestDemo {

  val a = List(Future(1), Future(3), Future(5))

  def main(args: Array[String]): Unit = {

    // a.foreach(     println)
    /* var sum= 0;
    a.map(  i=> i match {
      case i => print( a) ; sum=sum + trySuccess( a)  // use result for something
      case _ =>  // Handle error 0
    })
    */
    var sum=0
    val p = Promise[Int]()

   // val consumer = Future {
   //   a.foreach( i=> {p.completeWith(i) ; print(i)   })
  //}


   //

    a.foreach { x =>
      println(x.value.get.get )

    }
  }
}
