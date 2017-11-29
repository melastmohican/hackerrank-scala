package org.example.hackerrank.fp

import java.io.InputStream
import java.util.Scanner

import org.example.hackerrank.HackerRankExecutable

/**
  * The series expansion of  is given by:
  **
1 + x + x^2/2! + x^3/3! + x^4/4! + ...
 **
 Evaluate e^x for given values of x by using the above expansion for the first 10 terms.
 **
 Input Format
 **
 The first line contains an integer N, the number of test cases.
*N lines follow. Each line contains a value of x for which you need to output the value of e^x^ using the above series expansion. These input values have exactly 4 decimal places each.
 **
 Output Format
 **
 Output N lines, each containing the value of e^x, computed by your program.
 **
 Constraints
*1 <= N <= 50
*-20.00 <= x <= 20.00
 **
 Var, Val in Scala and def and defn in Clojure are blocked keywords. The challenge is to accomplish this without either mutable state or direct declaration of local variables.
 **
 Sample Input
 **
 4
*20.0000
*5.0000
*0.5000
*-0.5000
 **
 Sample Output
 **
 2423600.1887
*143.6895
*1.6487
*0.6065
  */
class EvaluatingEX extends HackerRankExecutable {
  def f(x: Double) = {
    var result: Double = 0
    for (i <- 0 to 9) {
      result = result + (if (i == 0) 1 else Math.pow(x, i)) / factorial(i)
    }
    result
  }

  def factorial(n: Double): Double = if (n <= 1) 1 else n * factorial(n - 1)

  override def execute(inStream: InputStream): Unit = {
    val sc = new Scanner(inStream)
    val n = sc.nextInt
    val arr: List[Double] = (1 to n).map { e =>
      val temp = sc.nextDouble()
      temp.toDouble
    }.toList
    arr.foreach { e: Double =>
      println("%.4f".format(f(e)))
    }
  }
}
