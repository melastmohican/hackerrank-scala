package org.example.hackerrank.fp

import org.example.hackerrank.HackerRankStringInSpec
import org.specs2.mutable.Specification
import org.specs2.specification.BeforeEach

class PolygonAreaSpec extends Specification with HackerRankStringInSpec with BeforeEach {

  def before = {
    setIn("4\n0 0\n0 1\n1 1\n1 0")
    exec = new PolygonArea()
  }

  "PolygonAreaSpec" should {
    "execute" in {
      check("1.0")
    }

  }
}
