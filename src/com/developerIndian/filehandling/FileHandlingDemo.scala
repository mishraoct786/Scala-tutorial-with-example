package com.developerIndian.filehandling

class FileHandlingDemo {
def myFileWriter(): Unit ={
     import java.io._
     val writer=new PrintWriter(new File("demo.txt"))
     writer.write("Successfully wrote to the file we created")
     print("Successfully")
     writer.close()
}

}
object FileHandlingDemo{
  def main(args: Array[String]): Unit = {
  var x = new  FileHandlingDemo ()
    x.myFileWriter()
  }
}