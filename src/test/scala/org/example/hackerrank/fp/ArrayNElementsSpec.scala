package org.example.hackerrank.fp

import org.example.hackerrank.HackerRankStringInSpec
import org.specs2.mutable.Specification
import org.specs2.specification.BeforeEach

class ArrayNElementsSpec extends Specification with HackerRankStringInSpec with BeforeEach {

  def before = {
    exec = new ArrayNElements()
  }

  sequential // <- this will make the examples sequentially

  "ArrayNElements" should {
    "execute(10)" in {
      setIn("10")
      check("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]")
    }
    "execute(3)" in {
      setIn("3")
      check("[0, 1, 2]")
    }
  }
}
