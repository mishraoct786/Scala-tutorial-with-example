package com.developerIndian.monads
object MonadsForBeginners{
case  class SafeValue[+T] (private val  internalValue: T)
{
  def get : T = synchronized{
    internalValue
  }

}
}
