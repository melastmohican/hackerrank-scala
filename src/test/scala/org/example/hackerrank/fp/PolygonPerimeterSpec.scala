package org.example.hackerrank.fp

import org.example.hackerrank.HackerRankStringInSpec
import org.specs2.mutable.Specification
import org.specs2.specification.BeforeEach

class PolygonPerimeterSpec extends Specification with HackerRankStringInSpec with BeforeEach {

  def before = {
    setIn("4\n0 0\n0 1\n1 1\n1 0")
    exec = new PolygonPerimeter()
  }

  "PolygonPerimeter" should {
    "execute" in {
      check("4.0")
    }

  }
}
