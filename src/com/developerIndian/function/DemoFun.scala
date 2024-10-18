package com.developerIndian.function

class DemoFun {
 val double = (x :Int) => 2 *x

}
object DemoFun {
  def main(args: Array[String]): Unit = {
    val double : Int=>Int = (x :Int) => 2 *x
    print(double(4))

    println(higherFun1)
    def higherFun : List[Int] = {
      List(1,2, 3,6).filter( i=> i != 2)
    }
    def higherFun1 : List[String] = {
      List(1,2, 3,6).flatMap( i=> List('a','b','c','d').map(j=>s"$i-$j" ) )
    }
  }: Unit

 val forComprehence = for {
    x<-List(1,2, 3,6)
    y<-List('a','b','c','d')
  } yield (s"$x-$y")

  def highrOrder1 ( f:(Int ,Int)=>Int,x: Int, y: Int ):Int=
  {
    f(x,y)
  }

  println(forComprehence)
  val hof =(x:Int,y:Int ) => x+y
  println("adding of fumc "+highrOrder1(hof, 4,5))

  def curringFun (x:Int)(y:Int): Int =x+y
  val w=curringFun(3)_
  println("curringFun"+w(4))
}

