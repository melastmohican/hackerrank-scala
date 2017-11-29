package org.example.hackerrank.fp

import java.io.InputStream
import java.util.Scanner

import org.example.hackerrank.HackerRankExecutable

/**
  * Count the number of elements in an array without using count, size or length operators (or their equivalents). The input and output portions will be handled automatically by the grader. You only need to write a function with the recommended method signature.

Input Format

A list of  integers, each on a separate line.

Output Format

Output a single integer , the length of the list that was provided as input.

Sample Input

2
5
1
4
3
7
8
6
0
9
Sample Output

10

Constraints
0 <= N <= 100
Each element, X, in the list 0<= X <= 100
  */
class ListLength extends HackerRankExecutable {
  def f(arr:List[Int]):Int =  arr.foldLeft(0) { (a, b) => a + 1 }

  override def execute(inStream: InputStream): Unit = {
    val sc = new Scanner(inStream)
    val n = sc.nextInt
    val arr: List[Int] = (1 to n).map { e =>
      val temp = sc.nextInt
      temp.toInt
    }.toList
    println(f(arr))
  }
}
