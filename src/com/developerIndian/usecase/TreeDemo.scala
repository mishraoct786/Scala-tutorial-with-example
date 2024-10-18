package com.developerIndian.usecase

class TreeDemo {

}

// Define the Tree Node
sealed trait Tree[+A]
case object Empty extends Tree[Nothing]
case class Node[A](value: A, left: Tree[A] = Empty, right: Tree[A] = Empty) extends Tree[A]

// Define Tree Operations
object BinaryTree {

  // Insert an element into the tree
  def insert[A](tree: Tree[A], newValue: A)(implicit ordering: Ordering[A]): Tree[A] = tree match {
    case Empty => Node(newValue)
    case Node(value, left, right) =>
      if (ordering.lt(newValue, value)) Node(value, insert(left, newValue), right)
      else Node(value, left, insert(right, newValue))
  }

  // Search for an element in the tree
  def contains[A](tree: Tree[A], value: A)(implicit ordering: Ordering[A]): Boolean = tree match {
    case Empty => false
    case Node(v, left, right) =>
      if (ordering.equiv(value, v)) true
      else if (ordering.lt(value, v)) contains(left, value)
      else contains(right, value)
  }

  // In-order traversal of the tree (left, root, right)
  def inOrder[A](tree: Tree[A]): List[A] = tree match {
    case Empty => List.empty
    case Node(value, left, right) => inOrder(left) ::: List(value) ::: inOrder(right)
  }

  // Pre-order traversal of the tree (root, left, right)
  def preOrder[A](tree: Tree[A]): List[A] = tree match {
    case Empty => List.empty
    case Node(value, left, right) => List(value) ::: preOrder(left) ::: preOrder(right)
  }

  // Post-order traversal of the tree (left, right, root)
  def postOrder[A](tree: Tree[A]): List[A] = tree match {
    case Empty => List.empty
    case Node(value, left, right) => postOrder(left) ::: postOrder(right) ::: List(value)
  }
}

// Test the Binary Tree
object TreeTest extends App {
  import BinaryTree._

  // Create a tree and insert some values
  var tree: Tree[Int] = Empty
  tree = insert(tree, 5)
  tree = insert(tree, 3)
  tree = insert(tree, 7)
  tree = insert(tree, 2)
  tree = insert(tree, 4)
  tree = insert(tree, 6)
  tree = insert(tree, 8)

  // Check if a value exists
  println(contains(tree, 4)) // Output: true
  println(contains(tree, 9)) // Output: false

  // In-order traversal
  println("In-order: " + inOrder(tree)) // Output: List(2, 3, 4, 5, 6, 7, 8)

  // Pre-order traversal
  println("Pre-order: " + preOrder(tree)) // Output: List(5, 3, 2, 4, 7, 6, 8)

  // Post-order traversal
  println("Post-order: " + postOrder(tree)) // Output: List(2, 4, 3, 6, 8, 7, 5)
}
