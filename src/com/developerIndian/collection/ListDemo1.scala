package com.developerIndian.collection
//How to delete elements from a list in Scala
class ListDemo1 {

}

object ListDemo1 {
  def main(args: Array[String]) {
    var progLang = List("C++", "Java", "Scala", "Python")

    println("Programming Languages: " + progLang)

    var newLang = progLang.filter(_<"P")

    println("Programming Languages: " + newLang)

  }
}

/*Other methods to modify the list are using ListBuffer which is mutable that makes the deletion process easy.

We can delete an element from ListBuffer using,

Using -= operator
Using remove() method
Using --= operator (deletes elements of another collection)
1) Using -= operator
The -= can delete single or multiple elements from the ListBuffer.

 */