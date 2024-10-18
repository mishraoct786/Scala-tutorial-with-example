package com.developerIndian.collection.listexample.mapexample

object DemoMap {

  def main(args: Array[String]): Unit = {
    var map:Map[String,Int]=  Map()
    map=map++ Map("100" -> 1)
    map=map++ Map("100" -> 1)
    map=map++ Map("200"-> 2  )

    map.foreach(i =>{ println(i._1)  }    )
    map=map-"200"
    map.foreach(i =>{ println(i)  }    )

  }
}
