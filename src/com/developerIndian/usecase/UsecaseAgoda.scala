package com.developerIndian.usecase

class UsecaseAgoda {

}
/* rage 300 -400 = good
  401 -500 = excelent
  501- 600 = perfect
  601-700= elit
 */

object UsecaseAgoda
{
  def main(args: Array[String]): Unit = {
  /*  var list=List("good","excelent","good","perfect")
    var list1 : List [(Int,String)] =List()
    //var list3=list.map(i=>(i,1)).groupBy(i => i._1)
    var list3=list.groupBy(i => i).map(j=>(  j._1,j._2.length)).toList.map(i=>i._1+"-"+i._2)
    var list4=list.sorted
    var list5=list.sortWith(_>_)
    println(list3)
    println(list4) */
    var str= "[\"hello\",\"world\",\"scala\"]"
    var x:Array[Char] = Array.ofDim(str.length)
   // x.foreach(print)
    var list1:List[Char]=List()

    var s:Set[Char]=Set()
    for(i<- 0 to x.length -1)
      {
        s = s + str.charAt(i)
        //list1=list1 + str.charAt(i)
       // println(x(i)+""+i)
      }
    for(i<- 0 to x.length -1)
    {
     // s = s + str.charAt(i)
      list1= list1 :+  str.charAt(i)

    }
    var l1=list1.distinct.mkString.replace("[","").replace("]","").replace("\"","")
   var l=list1.distinct.mkString.replace("[\"[],]","")
    //list1.foreach(print)
    print(l)
    //var str1=s.mkString.replace('[ ], " , [  ]',"")
  // var x1= list.groupBy(i=>i)
  //  x1.foreach(print)

    /*
    List((2,1),(1,2),(1,3),(1,4),(2,5)).sortWith{
  case (a,b) => a._1 < b._1
}
--> List((1,2), (1,3), (1,4), (2,1), (2,5))
     */
  }
}