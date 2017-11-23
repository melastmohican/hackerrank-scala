package org.example.hackerrank.fp

import org.example.hackerrank.HackerRankStringInSpec
import org.specs2.mutable.Specification
import org.specs2.specification.BeforeEach

class HelloWorldNTimesSpec extends Specification with HackerRankStringInSpec with BeforeEach {

  def before = {
    setIn("4")
    exec = new HelloWorldNTimes()
  }

  "HelloWorldNTimes" >> {
    "execute" >> {
      check("Hello World\nHello World\nHello World\nHello World")
    }

  }
}
