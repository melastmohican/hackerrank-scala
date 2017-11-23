package org.example.hackerrank.fp

import java.util.Scanner

import org.example.hackerrank.HackerRankExecutable

/**
  * Print "Hello World"  amount of times. The input portion will be handled automatically. You need to write a function with the recommended method signature.

Input Format

A single line of input containing integer , the number of times to print "Hello World".

Output Format

Output  lines, each containing "Hello World".

Constraints


Sample Input

4
Sample Output

Hello World
Hello World
Hello World
Hello World
Recommended Method Signature

Number Of Parameters: 1
Parameters: [n]
Returns: nil
  */
class HelloWorldNTimes extends HackerRankExecutable {
  def f(n: Int) = (1 to n).foreach(e => println("Hello World"))

  override def execute(): Unit = {
    val sc = new Scanner(System.in)
    val n = sc.nextInt
    f(n)
  }
}
