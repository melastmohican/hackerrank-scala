package org.example.hackerrank.fp

import org.example.hackerrank.HackerRankStringInSpec
import org.specs2.mutable.Specification
import org.specs2.specification.BeforeEach

class ListLengthSpec extends Specification with HackerRankStringInSpec with BeforeEach {

  def before = {
    setIn("10\n2\n5\n1\n4\n3\n7\n8\n6\n0\n9")
    exec = new ListLength()
  }

  "ListLength" should {
    "execute" in {
      check("10")
    }

  }
}
