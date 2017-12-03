package org.example.hackerrank.fp

import java.io.InputStream
import java.util.Scanner

import org.example.hackerrank.HackerRankExecutable

import scala.annotation.tailrec
import scala.collection.immutable.Nil

/**
  * Pawel and Shaka recently became friends. They believe their friendship will last forever if they merge their favorite strings.
  **
  * The lengths of their favorite strings are the same, n. Mingling two strings, P = p1p2...pn and Q = q1q2...qn, both of length n, will result in the creation of a new string R of length 2 x n. It will have the following structure:
  **
  *R = p1q1p2q2...pnqn
  **
  *You are given two strings P (Pawel's favorite) and Q (Shaka's favorite), determine the mingled string R.
  **
 *Input Format
  **
 *The first line of input contains the string P.
*The second line contains Q.
  **
 *Output Format
  **
 *Print the mingled string, R.
 **
 *Constraints
*1 <- n <= 10^5
 **
 *The string only consists of lowercase English characters (a - z).
*length(P) = length(Q) = n
 **
 *Sample Input #00
  **
 *abcde
*pqrst
*Sample Output #00
 **
  * apbqcrdset
*Sample Input #01
  **
 *hacker
*ranker
*Sample Output #01
 **
 *hraacnkkeerr
  */
class StringMingling extends HackerRankExecutable {

  @tailrec final def mingle(P: List[Char], Q: List[Char], acc: List[Char] = List()): List[Char] = {
    if (P.isEmpty) acc
    else mingle(P.tail, Q.tail, acc:::P.head::Q.head::Nil)
  }


  override def execute(inStream: InputStream): Unit = {
    val sc = new Scanner(inStream)
    val p = sc.nextLine.toList
    val q = sc.nextLine.toList

    val mingled = mingle(p,q).mkString("")
    print(mingled)

    // In case of timeout on Hackerrank
    //val mingled = p.indices.map(i => p(i) + "" + q(i))
    //mingled foreach print
  }
}
