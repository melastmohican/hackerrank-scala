package org.example.hackerrank.fp

import org.example.hackerrank.HackerRankStringInSpec
import org.specs2.mutable.Specification
import org.specs2.specification.BeforeEach

class FilterPositionsSpec extends Specification with HackerRankStringInSpec with BeforeEach {

  def before = {
    setIn("8\n2\n5\n3\n4\n6\n7\n9\n8")
    exec = new FilterPositions()
  }

  "FilterPositions" should {
    "execute" in {
      check("5\n4\n7\n8")
    }

  }
}
