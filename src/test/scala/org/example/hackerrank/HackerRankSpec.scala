package org.example.hackerrank

import java.io._
import java.util.Scanner

import org.specs2.mutable.Specification

import scala.Console


trait HackerRankStringInSpec extends Specification {
  private var inStream: InputStream = null
  private var outStream: OutputStream = new ByteArrayOutputStream
  protected var exec: HackerRankExecutable = null

  def setIn(input: String): Unit = {
    inStream = new ByteArrayInputStream(input.getBytes)
    outStream = new ByteArrayOutputStream
  }

  def check(expected: String): Boolean = {
    Console.withIn(inStream) {
      Console.withOut(outStream) {
        exec.execute(inStream)
        val result = outStream.toString.trim
        result == expected
      }
    }
  }
}

trait HackerRankOutOnlySpec extends Specification {
  private var outStream: OutputStream = new ByteArrayOutputStream
  protected var exec: HackerRankExecutable = null

  def check(expected: String): Boolean = {
    Console.withOut(outStream) {
      exec.execute()
      val result = outStream.toString.trim
      result == expected
    }
  }
}

trait HackerRankFileInSpec extends Specification {
  private var inStream: InputStream = null
  private var outStream: OutputStream = new ByteArrayOutputStream
  protected var exec: HackerRankExecutable = null

  def setIn(input: String): Unit = {
    val file = classOf[HackerRankFileInSpec].getClassLoader.getResource(input).getFile
    inStream = new FileInputStream(file)
  }

  def check(expected: String): Boolean = {
    Console.withIn(inStream) {
      Console.withOut(outStream) {
        exec.execute()
        val file = classOf[HackerRankFileInSpec].getClassLoader.getResource(expected).getFile
        val eis = new FileInputStream(file)
        val s = new Scanner(eis).useDelimiter("\\A")
        val expectedResult = if (s.hasNext) s.next
        else ""
        val result = outStream.toString.trim
        result == expectedResult
      }
    }
  }
}