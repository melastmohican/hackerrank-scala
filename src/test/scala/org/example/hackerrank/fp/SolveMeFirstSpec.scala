package org.example.hackerrank.fp

import org.example.hackerrank.HackerRankStringInSpec
import org.specs2.mutable.Specification
import org.specs2.specification.BeforeEach

class SolveMeFirstSpec extends Specification with HackerRankStringInSpec with BeforeEach {

  def before = {
    setIn("2\n3")
    exec = new SolveMeFirst()
  }

  "SolveMeFirst" >> {
    "execute" >> {
      check("5")
    }
  }
}
