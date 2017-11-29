package org.example.hackerrank.fp

import java.io.InputStream
import java.util.Scanner

import org.example.hackerrank.HackerRankExecutable

/**
  * You are given a set of unique (x,y) ordered pairs constituting a relation. The x-values form the domain, and the y-values form the range to which they map. For each of these relations, identify whether they may possibly represent a valid function or not.
  **
  * Note: You do not have to find the actual function, you just need to determine that the relation may be representative of some valid function.
  **
  *Input Format
  **
  *The first line contains an integer, T, denoting the number of test cases. The subsequent lines describe T test cases, and the input for each test case is as follows:
  **
 *The first line contains an integer, N, the number of (x,y) pairs in the test case.
*The N subsequent lines each contain two space-separated integers describing the respective x and y values for each ordered pair.
*
  * Constraints
*1 <= T <= 5
*2 <= N <= 10
*0 <= x,y <= 500
*x and y are both integers
  **
 *Output Format
  **
 *On a new line for each test case, print  if the set of ordered pairs represent a valid function, or  if they do not.
  **
 *Sample Input
 **
  *2
*3
  *1 1
  *2 2
  *3 3
  * 4
*1 2
*2 4
  *3 6
  *4 8
*Sample Output
 **
  *YES
*YES
  */
class FunctionOrNot extends HackerRankExecutable {

  def isFunction(oairs: List[(Int, Int)]): Boolean = {
    val groupByX = oairs.groupBy(_._1)
    val filteredMoreThanOne = groupByX.filter(p => p._2.size > 1)
    filteredMoreThanOne.forall(_._2.map(_._2).distinct == 1)
  }

  override def execute(inStream: InputStream): Unit = {
    val sc = new Scanner(inStream)
    val t: Int = sc.nextInt
    val data = (1 to t).map { x =>
      val n: Int = sc.nextInt
      sc.nextLine()
      (1 to n).map { y =>
        val arr = sc.nextLine().split(" ")
        Tuple2(arr(0).toInt, arr(1).toInt)
      }.toList
    }.toList

    data.foreach { e =>
      println(if (isFunction(e)) "YES" else "NO")
    }
  }
}
