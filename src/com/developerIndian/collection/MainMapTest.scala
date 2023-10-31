package com.developerIndian.collection

import scala.collection.immutable._

object MainMapTest
{
  def main(args: Array[String])
  {

    // Creating and initializing immutable sets
    val names: Set[String] = Set("Emily", "Smith",
      "Johnsons", "Adler")
    val age = Set("22", "23", "25", "21")

    // Display the value of names
    println("Name:"+names)
    println("\nAge:"+age)

    var mapIm = Map("Ajay" -> 30, "Bhavesh" -> 20,"Charlie" -> 50)
    println(mapIm)
    //Updating
   // mapIm("Ajay") = 10;

    println(mapIm)

   var mapMutable= scala.collection.mutable.Map("Ajay" -> 30, "Bhavesh" -> 20,"Charlie" -> 50)
    mapMutable("Ajay") = 10;
    println(mapMutable)

//Key-value pair corresponds to a tuple with two elements. Therefore, while performing iteration loop variable needs to be a pair.
    //To understand syntax and working of loops in Scala refe
    // (k, v) is a tuple with two elements
    for((k, v) <- mapMutable)
    {
      //where k is key and v is value
      print("Key:"+k+", ")
      println("Value:"+v)
    }

  }

}