package org.example.hackerrank.fp

import org.example.hackerrank.HackerRankStringInSpec
import org.specs2.mutable.Specification
import org.specs2.specification.BeforeEach

class EvaluatingEXSpec extends Specification with HackerRankStringInSpec with BeforeEach {

  def before = {
    setIn("4\n20.0000\n5.0000\n0.5000\n-0.5000")
    exec = new EvaluatingEX()
  }

  "EvaluatingEX" should {
    "execute" in {
      check("2423600.1887\n143.6895\n1.6487\n0.6065")
    }

  }
}
