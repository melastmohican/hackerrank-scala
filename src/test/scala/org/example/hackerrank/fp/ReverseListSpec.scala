package org.example.hackerrank.fp

import org.example.hackerrank.HackerRankStringInSpec
import org.specs2.mutable.Specification
import org.specs2.specification.BeforeEach

class ReverseListSpec extends Specification with HackerRankStringInSpec with BeforeEach {

  def before = {
    setIn("10\n19\n22\n3\n28\n26\n17\n18\n4\n28\n0")
    exec = new ReverseList()
  }

  "ReverseList" should {
    "execute" in {
      check("0\n28\n4\n18\n17\n26\n28\n3\n22\n19")
    }

  }
}
