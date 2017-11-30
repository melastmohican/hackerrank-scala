package org.example.hackerrank.fp

import java.io.InputStream
import java.util.Scanner

import org.example.hackerrank.HackerRankExecutable

/**
  * You are given the cartesian coordinates of a set of points in a 2D plane. When traversed sequentially, these points form a Polygon, P, which is not self-intersecting in nature. Can you compute the perimeter of polygon P?
  **
  * Input Format
  **
  *The first line contains an integer, N, denoting the number of points.
  *The N subsequent lines each contain 2 space-separated integers denoting the respective x and y coordinates of a point.
  **
  *Constraints
*No 2 points are coincident, and polygon P is obtained by traversing the points in a clockwise direction.
*3 <= N <= 1000
*0 <= x,y <= 1000
  **
 *Output Format
  **
 *For each test case, print the perimeter of  (correct to a scale of one decimal place).
  **
 *Note: Do not add any leading/trailing spaces or units.
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
 *4
  */
class PolygonPerimeter extends HackerRankExecutable {
  def perimeter(points: List[(Int, Int)]) : Double = {
    val n = points.length
    (0 until n).map(i => length(points(i % n), points((i + 1) % n))).sum
  }

  def length(p1: (Int, Int), p2: (Int, Int)) : Double = {
    Math.sqrt((Math.pow(p2._1 - p1._1, 2)) + (Math.pow(p2._2 - p1._2, 2)))
  }

  override def execute(inStream: InputStream): Unit = {
    val sc = new Scanner(inStream)
    val n: Int = sc.nextInt
    sc.nextLine()
    val points = (1 to n).map { y =>
      val arr = sc.nextLine().split(" ")
      Tuple2(arr(0).toInt, arr(1).toInt)
    }.toList
    println(perimeter(points))
  }
}
