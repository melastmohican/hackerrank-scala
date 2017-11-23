package org.example.hackerrank

import java.io._
import java.util.Scanner

import org.specs2.mutable.Specification

class HackerRankTest extends Specification {
  private var inStream: InputStream = null
  private var outStream: OutputStream = null
  protected var exec: HackerRankExecutable = null

  def initStreams(input: String): Unit = {
    inStream = new ByteArrayInputStream(input.getBytes)
    System.setIn(inStream)
    outStream = new ByteArrayOutputStream
    System.setOut(new PrintStream(outStream))
  }

  def initFileStreams(input: String): Unit = {
    val file = classOf[HackerRankTest].getClassLoader.getResource(input).getFile
    inStream = new FileInputStream(file)
    System.setIn(inStream)
    outStream = new ByteArrayOutputStream
    System.setOut(new PrintStream(outStream))
  }

  def initOut(): Unit = {
    outStream = new ByteArrayOutputStream
    System.setOut(new PrintStream(outStream))
  }

  def checkResult(expected: String): Boolean = {
    val result = outStream.toString.trim
    result must_== expected
  }

  def checkFileResult(expected: String): Boolean = {
    val file = classOf[HackerRankTest].getClassLoader.getResource(expected).getFile
    val eis = new FileInputStream(file)
    val s = new Scanner(eis).useDelimiter("\\A")
    val expectedResult = if (s.hasNext) s.next
    else ""
    val result = outStream.toString.trim
    result must_== expectedResult
  }
}