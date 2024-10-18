package com.developerIndian.collection.mapExample

object DemoBook {
  def main(args: Array[String]): Unit = {
    var phoneBook=Map(("jim",500), "dennial"-> 789).withDefaultValue(-1)
    println(phoneBook)

    //key method
   println(phoneBook.contains("jim"))
    println(phoneBook("merry"))

    //adding pair in map
    var phone= "SHubham"->999
    val newphoneBook = phoneBook+phone
    println(newphoneBook)

    //function on map
    //flatMap , map , filter

    println(newphoneBook.map(i=> i._1.toLowerCase -> i._2))


    //filter
    println(newphoneBook.filter(i => i._1.startsWith("j")))

    // map value
    println(newphoneBook.map(i => i._1-> i._2*100 ))

    //convert into list

    var ls= newphoneBook.toList
    println(ls)

    var list= List(("shubham",1),("Ram",2),("rahul",3),("mayur",4))
    println(list.toMap)

    var listGroup = List("shubham","Ram","rahul","mayur")
    println(listGroup.groupBy(name => name.charAt(0)))


  }

}
