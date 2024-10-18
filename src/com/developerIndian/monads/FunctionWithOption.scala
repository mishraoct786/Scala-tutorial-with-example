package com.developerIndian.monads

class FunctionWithOption {
}

object FunctionWithOption {

  def main(args: Array[String]): Unit = {

    def stringWithoutNull(Name : String)={
      s"hi $Name"
    }

 val output=  Option(stringWithoutNull("Ram"))

  val result = output match {
    case Some(output) => s"in side match $output"
    case None=> "none in side match"
  }
    println(result)
}
  }