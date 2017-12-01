package org.example.hackerrank.fp

import java.io.InputStream
import java.util.Scanner

import org.example.hackerrank.HackerRankExecutable

import scala.annotation.tailrec

/**
  * Given the starter code, complete the Fibonacci function to return the Nth term.
  **
  * We start counting from Fibonacci(1) = 0. This might differ from some other notations that treats Fibonacci(0) = 0.
  **
  *The overall equation is:
  **
  *= 0 , n = 1
*Fibonacci(n) = 1 , n = 2
  *Fibonacci(n-1) + Fibonacci(n-2)  , n > 2
*Input Format
  **
 *One line of input, the integer N.
  **
 *Constraints
*0 < N <= 40
  **
 *Output Format
  **
 *Output one integer, the Nth Fibonacci number.
 **
 *Sample Input
  **
 *3
*Sample Output
 **
 *1
  */
class FibonacciNumbers extends HackerRankExecutable {

  // Correct Fibonacci
  //def fibonacci(x:Int):Int = if (x <= 1) x else fibonacci(x - 1) + fibonacci(x - 2)
  // HackerRank Fibonacci
  def fibonacci(x:Int):Int = {
    x match {
      case 1 => return 0
      case 2 => return 1
      case _ => return fibonacci(x-1) + fibonacci(x-2)
    }
  }

  override def execute(inStream: InputStream): Unit = {
    val sc = new Scanner(inStream)
    println(fibonacci(sc.nextInt))
  }
}
