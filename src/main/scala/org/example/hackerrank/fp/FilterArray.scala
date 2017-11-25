package org.example.hackerrank.fp

import java.util.Scanner

import org.example.hackerrank.HackerRankExecutable

import scala.collection.mutable.ListBuffer

/**
  * Filter a given array of integers and output only those values that are less than a specified value . The output integers should be in the same sequence as they were in the input. You need to write a function with the recommended method signature for the languages mentioned below. For the rest of the languages, you have to write a complete code.
  **
  * Input Format
  **
  *The first line contains the delimiter .
  *The next  lines each contain an integer, which represents the elements of the list/array. You have to read the input to the End-Of-File.
  **
  *Output Format
  **
 *Print all the integers from the array that are less than the given upper limit  in value on separate lines. The sequence should be the same as it was in the original array.
  **
 *Constraints
*1 <-- B <= 100
*For any element, Y in the array, -100 <= Y <= 100
*-100 <= X <= 100
  **
  * Note
*The purpose of this challenge is to learn how to write your own implementation of a filter function. We recommend not using the inbuilt library function.
  **
 *Sample Input
  **
  *3
  *10
  * 9
  * 8
  * 2
  * 7
  * 5
  * 1
  *3
*0
*Sample Output
  **
  *2
*1
*0
  */
class FilterArray extends HackerRankExecutable {
  def f(delim: Int, arr: List[Int]): List[Int] = {
    var result = ListBuffer[Int]()
    arr.foreach { e =>
      if (e < delim) {
        result += e
      }
    }
    result.toList
  }

  override def execute(): Unit = {
    val sc = new Scanner(System.in)
    val delim = sc.nextInt
    val n = sc.nextInt
    val arr: List[Int] = (1 to n).map { e =>
      val temp = sc.nextInt
      temp.toInt
    }.toList
    val result = f(delim, arr)
    result.foreach { e => println(e) }
  }

}
