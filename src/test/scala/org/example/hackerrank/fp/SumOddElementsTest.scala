package org.example.hackerrank.fp

import org.example.hackerrank.HackerRankStringInSpec
import org.specs2.mutable.Specification
import org.specs2.specification.BeforeEach

class SumOddElementsTest extends Specification with HackerRankStringInSpec with BeforeEach {

  def before = {
    setIn("9\n3\n2\n4\n6\n5\n7\n8\n0\n1")
    exec = new SumOddElements()
  }

  "SumOddElementsTest" should {
    "execute" in {
      check("16")
    }

  }
}
