package org.example.hackerrank.fp

import java.io.InputStream
import java.util.Scanner

import org.example.hackerrank.HackerRankExecutable

/**
  * You are given a list. Return the sum of odd elements from the given list. The input and output portions will be handled automatically. You need to write a function with the recommended method signature.

Constraints

The list will have 1 - 100 elements.
Each element will be an integer X where -100 <= X <= 100.

Sample Input

3
2
4
6
5
7
8
0
1
Sample Output

16
  */
class SumOddElements extends HackerRankExecutable  {
  def f(arr:List[Int]):Int = {
    arr.filter(_ % 2 != 0).foldLeft(0) { (a, b) => a + b }
  }


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
