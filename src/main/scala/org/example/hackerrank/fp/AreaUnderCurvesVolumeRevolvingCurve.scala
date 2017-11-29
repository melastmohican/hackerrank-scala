package org.example.hackerrank.fp

import java.io.InputStream
import java.util.Scanner

import org.example.hackerrank.HackerRankExecutable

/**
  * Definite Integrals via Numerical Methods
  **
This relates to definite integration via numerical methods.
 **
 Consider the algebraic expression given by:
 **
 (a1)x^b1 + (a2)x^b2 + (a3)x^b3 ... (an)x^bn
 **
 For the purpose of numerical computation, the area under the curve y=f(x) between the limits a and b can be computed by the Limit Definition of a Definite Integral.
 **
 Using equal subintervals of length = 0.001, you need to:
 **
 Evaluate the area bounded by a given polynomial function of the kind described above, between the given limits of L and R.
 **
 Evaluate the volume of the solid obtained by revolving this polynomial curve around the x-axis.
 **
 An absolute error margin of 0.02 will be tolerated.
 **
 Input Format
 **
 The first line contains N integers separated by spaces, which are the values of a1,a2...an.
*The second line contains N integers separated by spaces, which are the values of b1,b2...bn.
*The third line contains two space separated integers, L and R, the lower and upper range limits in which the integration needs to be performed, respectively.
 **
 Constraints
*-1000 <= a <= 1000
*-20 <= b <= 20
*1 <= L < R <= 20
 **
 Output Format
 **
 The first line should contain the area between the curve and the -axis, bound between the specified limits.
*The second line should contain the volume of the solid obtained by rotating the curve around the -axis, between the specified limits.
 **
 Sample Input
 **
 1 2 3 4 5
*6 7 8 9 10
*1 4
  * Sample Output

2435300.3
26172951168940.8
  */
class AreaUnderCurvesVolumeRevolvingCurve extends HackerRankExecutable {
  /**
    * This function will be used while invoking "Summation" to compute The area under the curve.
    *
    * @param coefficients
    * @param powers
    * @param x
    * @return
    */
  def f(coefficients: List[Int], powers: List[Int], x: Double): Double = {
    coefficients.zip(powers).map(y => y._1 * math.pow(x, y._2)).sum
  }

  /**
    * This function will be used while invoking "Summation" to compute the Volume of revolution of the curve around the X-Axis the 'Area' referred to here is the area of the circle obtained by rotating the point on the curve (x,f(x)) around the X-Axis
    *
    * @param coefficients
    * @param powers
    * @param x
    * @return
    */
  def area(coefficients: List[Int], powers: List[Int], x: Double): Double = {
    math.Pi * math.pow(f(coefficients, powers, x), 2)
  }

  /**
    * This is the part where the series is summed up This function is invoked once with func = f to compute the area under the curve Then it is invoked again with func = area to compute the volume of revolution of the curve
    *
    * @param func
    * @param upperLimit
    * @param lowerLimit
    * @param coefficients
    * @param powers
    * @return
    */
  def summation(func: (List[Int], List[Int], Double) => Double, upperLimit: Int, lowerLimit: Int, coefficients: List[Int], powers: List[Int]): Double = {
    val step = 0.001D
    val (start, end) = (lowerLimit.toDouble, upperLimit.toDouble)
    (start to end by step).map(func(coefficients, powers, _) * step).sum
  }

  override def execute(inStream: InputStream): Unit = {
    val sc = new Scanner(inStream)
    val a = sc.nextLine().split(" ").map { _.toInt }.toList
    val b = sc.nextLine().split(" ").map { _.toInt }.toList
    val l = sc.nextInt
    val r = sc.nextInt
    println("%.1f".format(summation(f, r, l, a, b)))
    println("%.1f".format(summation(area, r, l, a, b)))
  }
}
