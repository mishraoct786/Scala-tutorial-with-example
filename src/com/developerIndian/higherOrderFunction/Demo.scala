package com.developerIndian.higherOrderFunction

object Demo {
  def count_number_list(): Unit = {
    val list=List("Tom Cruize", "Tom Moody", "Bill Gates", "Bill John","John Cena")

    var  result =list.flatMap(i=> i.split(" ")).map(i => (i,1)) //.reduce(_)
    var x= result.groupBy(i=>i._1)
    //print(x)
    x.foreach(i=>{
      println(i._2.length, i._1)
    })
    for (i <- result ) {
      if("Tom"== i._1 )
        print(i)

    }
  }

def count_number(): Unit = {
  val list=List(10,20,30,20,10)
  var  result =list.map(i => (i,1)) //.reduce(_)
for (i <- result ) {
    if(list(1)== i._1 )
      print(i)}
}

  def myFunction(ls: List[String] , dosome:String => Unit ){

    var x=ls.map(i =>dosome(i))


  }

  def main(args: Array[String]): Unit = {
    val lmd =(name:String)=> print(s"hi my name $name")
    var ls= List("shubham","ravi","ankit")
    //myFunction(ls, lmd)
    //count_number
    count_number_list

  }

}
