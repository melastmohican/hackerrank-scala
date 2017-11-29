package org.example.hackerrank.fp

import java.io.InputStream
import java.util.Scanner

import org.example.hackerrank.HackerRankExecutable

/**
  * You are given a list of  elements. Reverse the list without using the reverse function. The input and output portions will be handled automatically. You need to write a function with the recommended method signature.
  **
  * Input Format
  **
  *Each element, , of the list is displayed on a separate line.
  **
  *Output Format
  **
 *The output is the reverse of the input list.
  **
 *Sample Input
  **
  *19
  * 22
* 3
  *28
  *26
  *17
  * 18
* 4
  * 28
*0
*Sample Output
  **
  * 0
  * 28
  * 4
* 18
* 17
* 26
  * 28
  * 3
*22
*19
  */
class ReverseList extends HackerRankExecutable {
  def f(arr: List[Int]): List[Int] = {
    arr.foldLeft(List[Int]()) { (r, h) => h :: r }
  }

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
