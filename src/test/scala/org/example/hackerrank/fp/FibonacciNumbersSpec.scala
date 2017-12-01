package org.example.hackerrank.fp

import org.example.hackerrank.HackerRankStringInSpec
import org.specs2.mutable.Specification
import org.specs2.specification.BeforeEach

class FibonacciNumbersSpec extends Specification with HackerRankStringInSpec with BeforeEach {

  def before = {
    setIn("3")
    exec = new FibonacciNumbers()
  }

  "FibonacciNumbers" should {
    "execute" in {
      check("1")
    }

  }
}
