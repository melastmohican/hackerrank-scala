package org.example.hackerrank.fp

import org.example.hackerrank.HackerRankStringInSpec
import org.specs2.mutable.Specification
import org.specs2.specification.BeforeEach

class UpdateListSpec extends Specification with HackerRankStringInSpec with BeforeEach {

  def before = {
    setIn("7\n2\n-4\n3\n-1\n23\n-4\n-54")
    exec = new UpdateList()
  }

  "UpdateList" should {
    "execute" in {
      check("2\n4\n3\n1\n23\n4\n54")
    }

  }
}
