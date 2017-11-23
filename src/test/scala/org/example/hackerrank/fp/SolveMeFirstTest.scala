package org.example.hackerrank.fp

import org.example.hackerrank.HackerRankTest
import org.specs2.specification.BeforeEach

class SolveMeFirstTest extends HackerRankTest with BeforeEach {

  def before = {
    initStreams("2\n3")
    exec = new SolveMeFirst()
  }

  "SolveMeFirstTest" should {
    "execute" in {
      exec.execute()
      checkResult("5")
    }
  }
}
