package org.example.hackerrank.fp

import org.example.hackerrank.HackerRankOutOnlySpec
import org.specs2.mutable.Specification
import org.specs2.specification.BeforeEach

class HelloWorldSpec extends Specification with HackerRankOutOnlySpec with BeforeEach {

  def before = {
    exec = new HelloWorld()
  }

  "HelloWorld" >> {
    "execute" >> {
      check("Hello World")
    }

  }
}
