package com.developerIndian.ObjectOrientedBasic

class Demo {

}

trait School{
  var obj="school"
}

class Student extends School {
  var obj1 ="student"
}
class Teacher extends School {
  var obj1 ="Teacher"
}


object Demo {
 def myMatch(obj: School) = obj match {

   case x:Student => x.obj1
   case x:Teacher => x.obj1
   case x:School=> x.obj
 }
  def main(args: Array[String]): Unit = {
    var x:School= new Student()
    var y:School= new Teacher()
   print( myMatch(y))
  }
}