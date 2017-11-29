package org.example.hackerrank.fp

import org.example.hackerrank.HackerRankStringInSpec
import org.specs2.mutable.Specification
import org.specs2.specification.BeforeEach

class AreaUnderCurvesVolumeRevolvingCurveSpec extends Specification with HackerRankStringInSpec with BeforeEach {

  def before = {
    setIn("1 2 3 4 5\n6 7 8 9 10\n1 4")
    exec = new AreaUnderCurvesVolumeRevolvingCurve()
  }

  "AreaUnderCurvesVolumeRevolvingCurve" should {
    "execute" in {
      check("2435300.3\n26172951168899.3")
    }

  }
}
