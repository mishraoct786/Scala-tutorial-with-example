package com.developerIndian.Singleton_object
trait AddService {
  def add(a: Int, b: Int) = a + b
}

trait MultiplyService {
  def multiply(a: Int, b: Int) = a * b
}

// implement those traits as a concrete object
object MathService extends AddService with MultiplyService


