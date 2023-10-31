package com.developerIndian.usecase

case class Cards (Name: String)
  object MyCardDemo {
    def main(args: Array[String]): Unit = {


      def myMatching(card: Cards) : Boolean = card match {
       case  card => if (card.Name.isEmpty) true else false
      }
     var x=Cards("shubham")
     print( myMatching(x) )
    }

     
  }