package org.example.hackerrank.fp

import java.io.InputStream
import java.util.Scanner

import org.example.hackerrank.HackerRankExecutable

import scala.annotation.tailrec

/**
  *
  * Given two integers,x  and y, a recursive technique to find their GCD is the Euclidean Algorithm.
 **
 The algorithm states that, for computing the GCD of two positive integers x and y, if x and y are equal, GCD(x,y) = x. Otherwise GCD(x,y) = GCD(x-y,) if x > y. There are a few optimizations that can be made to the above logic to arrive at a more efficient implementation.
 **
 Input Format
 **
 One line of input containing  space separated integers.
 **
 Constraints
*1 <- a,b <= 10^6
 **
 Output Format
 **
 Output one integer, the GCD of the two given numbers.
 **
 Sample Input
 **
 1 5
*Sample Output
 **
 1
  */
class GreatestCommonDivisor extends HackerRankExecutable {

  @tailrec final def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  def acceptInputAndComputeGCD(pair:List[Int]) = {
    println(gcd(pair.head,pair.reverse.head))
  }

  override def execute(inStream: InputStream): Unit = {
    val sc = new Scanner(inStream)
    acceptInputAndComputeGCD(sc.nextLine().trim().split(" ").map(x => x.toInt).toList)
  }
}
