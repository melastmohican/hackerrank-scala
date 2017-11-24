package org.example.hackerrank.fp

import org.example.hackerrank.HackerRankStringInSpec
import org.specs2.mutable.Specification
import org.specs2.specification.BeforeEach

class ListReplicationSpec extends Specification with HackerRankStringInSpec with BeforeEach {

  def before = {
    setIn("3\n1\n2\n3\n4")
    exec = new ListReplication()
  }

  "ListReplication" should {
    "execute" in {
      check("1\n1\n1\n2\n2\n2\n3\n3\n3\n4\n4\n4")
    }

  }
}
