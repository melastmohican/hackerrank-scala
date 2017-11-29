package org.example.hackerrank.fp

import java.io.InputStream
import java.util.Scanner

import org.example.hackerrank.HackerRankExecutable

/**
  * Update the values of a list with their absolute values. The input and output portions will be handled automatically during grading. You only need to write a function with the recommended method signature.
  **
  * Input Format
  **
  *There are  integers, each on a separate line. These are the  elements of the input array.
  **
  *Output Format
  **
 *Output the absolute value of  integers, each on a separate line in the same input order.
  **
 *Sample Input
  **
  * 2
  * -4
* 3
  *-1
  *23
  *-4
  *-54
*Sample Output
  **
  *2
  *4
  *3
  * 1
  * 23
  * 4
*54
*Constraints
 **
 *The list will have no more than 100 integers.
*Each integer, X, in the list: -100 <= X <= 100.
  */
class UpdateList extends HackerRankExecutable  {
  def f(arr:List[Int]):List[Int] = arr.map { Math.abs(_) }.toList

  override def execute(inStream: InputStream): Unit = {
    val sc = new Scanner(inStream)
    val n = sc.nextInt
    val arr: List[Int] = (1 to n).map { e =>
      val temp = sc.nextInt
      temp.toInt
    }.toList
    val result = f(arr)
    result.foreach { e => println(e) }
  }
}
