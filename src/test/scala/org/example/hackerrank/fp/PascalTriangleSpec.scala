package org.example.hackerrank.fp

import org.example.hackerrank.HackerRankStringInSpec
import org.specs2.mutable.Specification
import org.specs2.specification.BeforeEach

class PascalTriangleSpec extends Specification with HackerRankStringInSpec with BeforeEach {

  def before = {
    setIn("4")
    exec = new PascalTriangle()
  }

  "PascalTriangle" should {
    "execute" in {
      check("1\n1 1\n1 2 1\n1 3 3 1")
    }

  }
}
