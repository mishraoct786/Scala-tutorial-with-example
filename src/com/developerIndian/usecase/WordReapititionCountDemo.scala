package com.developerIndian.usecase

class WordReapititionCountDemo {

}
object WordReapititionCountDemo{
  def main(args: Array[String]): Unit = {
    println("Hello, World!")
    var st ="aaaabbbaa"
    var arr= st.toArray
    var result=""
    var count=1
    var x=""
    arr.foreach(
      i=> {

        //print(x)
        if (x.toString == i.toString) {
          count = count + 1
         // println(x + "- " + count)
        }
        else {
          if (count != 1)
            result = result + x + count
          count = 1
        }

        x = i.toString
      })
    result =result+x+count
    print(result)

  }
}