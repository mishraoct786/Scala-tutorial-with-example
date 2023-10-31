package com.developerIndian.usecase

class CombinationOfList {

  def twoCombinationWithArray(): Unit ={
    var arr = Array(0,2,3,2,5,6,2,3)
    var len = arr.length
    var sum= 6
    for (i<- 0 to len-2)
      {
        for (j <- i+1 to len-1 )
          {
           if( arr(i)+arr (j) == sum)
             {
               println( arr(i)+" "+arr (j))
             }

          }
      }

  }

  def fourCombinationWithList(): Unit =
  {
    var nums = List(2,4,5,0,6,7,2)

    val n = nums.length;
    // given value
    val s = 8;
    println("\nGiven value: " + s);
    println("Combination of four elements:");
    // Find other three elements after fixing first element
    for (i <- 0 to n - 4) {
      // Find other two elements after fixing second element
      for (j <- i + 1 to n - 3) {
        // Find the fourth element after fixing third element
        for (k <- j + 1 to n - 2) {
          // find the fourth
          for (l <- k + 1 to n - 1) {
            if (nums(i) + nums(j) + nums(k) + nums(l) == s)
              println(
                "\n" + nums(i) + " " + nums(j) + " " + nums(k)
                  + " " + nums(l)
              );
          }
        }
      }
    }
  }

}

object CombinationOfList {

  def main(args: Array[String]): Unit = {
   var obj =new CombinationOfList()
    obj.twoCombinationWithArray()

  }
}