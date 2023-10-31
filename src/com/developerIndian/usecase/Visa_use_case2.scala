package com.developerIndian.usecase

//input two string   state[Int]  and   operation [String]
//if L is there in state(i) =1
//if c3 so state of state(3) = 0
//input [00010000] or [L,L,c0,c4 ]
//[0,1,0,1,0,0]
class Visa_use_case2 {
def fun ( state : Array[Int]  ,  operations : Array[String]): String ={
 var i =0
  var count=0
  println("test"+state.mkString)
  for(ele<- operations)
    {
      count=0
      i=0
      if(ele=="L")
        {

          for(s <- state )
            {
              if(state (i) == 0 && count == 0) {
                    println("i"+ i)
                      state(i) =1
                       count=1
                         }
              i=i+1
            }
        }
    }
  state.mkString
}
}
object Visa_use_case2{
  def main(args: Array[String]): Unit = {
    var obj =new Visa_use_case2()
    println(obj.fun(Array(0,1,0,1,0,0), Array("L","L","c0","c4")))
  }
}
