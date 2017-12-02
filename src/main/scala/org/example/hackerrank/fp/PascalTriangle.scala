package org.example.hackerrank.fp

import java.io.InputStream
import java.util.Scanner

import org.example.hackerrank.HackerRankExecutable

/**
  * For a given integer K, print the first K rows of Pascal's Triangle. Print each row with each value separated by a single space. The value at the nth row and rth column of the
  * triangle is equal to n!(r! * (n-r)! where indexing starts from 0. These values are the binomial coefficients.
  **
  * The Pascal Triangle
  **
  * 1
  *1 1
  *1 2 1
  *1 3 3 1
  *1 4 6 4 1
  *....
  *Input Format
  **
  *A single line of input, integer K.
  **
 *Constraints
*2 <= K <= 10
  **
 *Output Format
  **
 *Output the first K rows of Pascal's triangle.
  **
 *Sample Input
  **
 *4
*Sample Output
  **
  *1
*1 1
  *1 2 1
*1 3 3 1
  */
class PascalTriangle extends HackerRankExecutable {

  def factorial(n: Double): Double = if (n <= 1) 1 else n * factorial(n - 1)

  override def execute(inStream: InputStream): Unit = {
    val sc = new Scanner(inStream)
    val k: Int = sc.nextInt

    (0 until k).foreach {
      row =>
        println(List.range(0, row + 1)
          .map(col =>
            ((factorial(row) / (factorial(col) * factorial(row - col)))).toInt)
          .mkString(" "))
    }
  }
}
