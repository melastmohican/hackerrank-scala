package org.example.hackerrank.fp

import org.example.hackerrank.HackerRankStringInSpec
import org.specs2.mutable.Specification
import org.specs2.specification.BeforeEach

class StringMinglingSpec extends Specification with HackerRankStringInSpec with BeforeEach {

  def before = {
    setIn("abcde\npqrst")
    exec = new StringMingling()
  }

  "StringMingling" should {
    "execute" in {
      check("apbqcrdset")
    }

  }
}
