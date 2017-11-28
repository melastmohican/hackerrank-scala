package org.example.hackerrank.fp

import java.io.InputStream
import java.util.Scanner

import org.example.hackerrank.HackerRankExecutable

/**
  * Given a list, repeat each element in the list  amount of times. The input and output portions will be handled automatically by the grader. You need to write a function with the recommended method signature.
  **
  * Input Format
  **
  *The first line contains the integer  where  is the number of times you need to repeat the elements.
  *The next  lines each contain an integer. These are the  elements in the array.
  **
  *Output Format
  **
 *Output each element of the original list  times, each on a separate line. You have to return the list/vector/array of  integers. The relative positions of the values should be the same as the original list provided in the input.
  **
 *Constraints
  **
  *
  *
 *Sample Input
  **
  *3
  *1
  *2
  *3
*4
*Sample Output
  **
  * 1
  * 1
  * 1
  * 2
  * 2
  * 2
  * 3
  * 3
  *3
*4
*4
  */
class ListReplication extends HackerRankExecutable {
  def f(num: Int, arr: List[Int]): List[Int] = arr.flatMap(e => List.fill(num)(e))

  override def execute(inStream: InputStream): Unit = {
    val sc = new Scanner(inStream)
    val n = sc.nextInt
    val arr: List[Int] = (0 to n).map { e =>
      sc.nextInt.asInstanceOf[Int]
    }.toList
    val result = f(n, arr)
    result.foreach { e => println(e)}
  }
}
