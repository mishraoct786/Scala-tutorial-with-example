package com.developerIndian.patternmatching
class PatternMatching2{

}
sealed trait Device
case class Phone(model: String) extends Device {
  def screenOff = "Turning screen off"
}
case class Computer(model: String) extends Device {
  def screenSaverOn = "Turning screen saver on..."
}

object PatternMatching2 {
  def myDeviceMatch(device : Device ) : String = device match {
    case p: Phone => p.screenOff
    case c:Computer => c.screenSaverOn
  }
  def main(args: Array[String]): Unit = {
    var phone =Phone("mymodel")
   println(myDeviceMatch(phone))
  }
}
