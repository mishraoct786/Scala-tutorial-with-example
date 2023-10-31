package com.developerIndian.collection

class MapDemo {

}
import scala.collection.mutable.Map
object MapDemo  {
  //creating map
  val map = scala.collection.mutable.Map(
    1 -> "Tom",
    2 -> "Alsvin",
    3 -> "Eddie"
  )

  //map containg key value pairs before remove
  println("The map elements before remove: " + map);

  //map after remove 3rd element
  println("The value against 3rd element: " + map.remove(3));
  println("The map elements after 3rd element remove: " + map);

  //map after remove 0th element which is not present in map
  println("The value against 0th element: " + map.remove(0));
  println("The map elements after 0 element remove: " + map);
}