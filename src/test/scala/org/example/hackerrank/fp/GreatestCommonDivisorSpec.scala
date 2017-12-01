package org.example.hackerrank.fp

import org.example.hackerrank.HackerRankStringInSpec
import org.specs2.mutable.Specification
import org.specs2.specification.BeforeEach

class GreatestCommonDivisorSpec extends Specification with HackerRankStringInSpec with BeforeEach {

  def before = {
    setIn("1 5")
    exec = new GreatestCommonDivisor()
  }

  "GreatestCommonDivisor" should {
    "execute" in {
      check("1")
    }

  }
}
