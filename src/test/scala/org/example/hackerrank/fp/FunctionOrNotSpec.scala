package org.example.hackerrank.fp

import org.example.hackerrank.HackerRankStringInSpec
import org.specs2.mutable.Specification
import org.specs2.specification.BeforeEach

class FunctionOrNotSpec extends Specification with HackerRankStringInSpec with BeforeEach {

  def before = {
    setIn("2\n3\n1 1\n2 2\n3 3\n4\n1 2\n2 4\n3 6\n4 8")
    exec = new FunctionOrNot()
  }

  "FunctionOrNot" should {
    "execute" in {
      check("YES\nYES")
    }

  }
}
