package org.example.hackerrank.fp

import org.example.hackerrank.HackerRankExecutable

/**
  * A "Hello World" program has been widely adopted as the introductory program for learning how to code. So, let's start functional programming by writing the same program.
  **
  *
  *Sample Input
  **
  *(Nil)
  *Sample Output
  **
  *Hello World
*Method Signature
  **
 *Number Of Parameters: 0
*Parameters: []
*Returns: nil
*Behavior: Prints "Hello World"
  */
class HelloWorld extends HackerRankExecutable {
  def f() = println("Hello World")

  override def execute(): Unit = {
    f()
  }
}
