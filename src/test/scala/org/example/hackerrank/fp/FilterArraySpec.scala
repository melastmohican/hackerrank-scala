package org.example.hackerrank.fp

import org.example.hackerrank.HackerRankStringInSpec
import org.specs2.mutable.Specification
import org.specs2.specification.BeforeEach

class FilterArraySpec extends Specification with HackerRankStringInSpec with BeforeEach {

  def before = {
    setIn("3\n10\n3\n10\n9\n8\n2\n7\n5\n1\n3\n0")
    exec = new FilterArray()
  }

  "FilterArray" should {
    "execute" in {
      check("2\n1\n0")
    }

  }
}
