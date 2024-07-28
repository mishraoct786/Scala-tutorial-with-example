package com.developerIndian.Singleton_object
/*
Objects have several uses:

-->They are used to create collections of utility methods.
-->A companion object is an object that has the same name as the class it shares a file with. In this situation,
that class is also called a companion class.
-->They’re used to implement traits to create modules.

 */
class Demo1 {

}
object Demo1 {
  def isNullOrEmpty(s: String): Boolean = s == null || s.trim.isEmpty
  def leftTrim(s: String): String = s.replaceAll("^\\s+", "")
  def rightTrim(s: String): String = s.replaceAll("\\s+$", "")

  def main(args: Array[String]): Unit = {
    println(Demo1.isNullOrEmpty(""))
    println(Demo1.isNullOrEmpty("A"))

    println(Demo1.leftTrim(" hello"))
  }
}