package org.example.hackerrank.fp

import java.io.InputStream
import java.util.Scanner

import org.example.hackerrank.HackerRankExecutable

/**
  * ou are given the cartesian coordinates of a set of points in a 2D plane. When traversed sequentially, these points form a Polygon, P, which is not self-intersecting in nature. Can you compute the area of polygon P?
  **
  * Input Format
  **
  *The first line contains an integer, N, denoting the number of points.
  *The N subsequent lines each contain 2 space-separated integers denoting the respective x and y coordinates of a point.
  **
  *Constraints
  *No 2 points are coincident, and polygon P is obtained by traversing the points in a clockwise direction.
  *4 <= N <= 1000
  *0 <= x,y <= 1000
  **
 *Output Format
  **
 *For each test case, print the area of  (correct to a scale of one decimal place).
  **
 *Note: Do not add any leading/trailing spaces or units; it is assumed that your result is in square units.
  **
 *Sample Input
  **
  * 4
*0 0
  *0 1
  *1 1
  *1 0
 **
 *Sample Output
 **
 *1
  */
class PolygonArea extends HackerRankExecutable {
  def area(points: List[(Int, Int)]) = {
    val n = points.length
    math.abs((0 until n).map(i => determinant(points(i % n), points((i + 1) % n))).sum) / 2.0
  }

  def determinant(p1: (Int, Int), p2: (Int, Int)) = {
    p1._1 * p2._2 - p1._2 * p2._1
  }

  override def execute(inStream: InputStream): Unit = {
    val sc = new Scanner(inStream)
    val n: Int = sc.nextInt
    sc.nextLine()
    val points = (1 to n).map { y =>
      val arr = sc.nextLine().split(" ")
      Tuple2(arr(0).toInt, arr(1).toInt)
    }.toList
    println(area(points))
  }
}
