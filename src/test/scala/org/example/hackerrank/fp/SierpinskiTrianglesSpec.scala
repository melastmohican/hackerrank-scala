package org.example.hackerrank.fp

import org.example.hackerrank.HackerRankStringInSpec
import org.specs2.mutable.Specification
import org.specs2.specification.BeforeEach

class SierpinskiTrianglesSpec extends Specification with HackerRankStringInSpec with BeforeEach {

  def before = {
    setIn("2")
    exec = new SierpinskiTriangles()
  }

  "SierpinskiTriangles" should {
    "execute" in {
      check("_______________________________1_______________________________\n______________________________111______________________________\n_____________________________11111_____________________________\n____________________________1111111____________________________\n___________________________111111111___________________________\n__________________________11111111111__________________________\n_________________________1111111111111_________________________\n________________________111111111111111________________________\n_______________________1_______________1_______________________\n______________________111_____________111______________________\n_____________________11111___________11111_____________________\n____________________1111111_________1111111____________________\n___________________111111111_______111111111___________________\n__________________11111111111_____11111111111__________________\n_________________1111111111111___1111111111111_________________\n________________111111111111111_111111111111111________________\n_______________1_______________________________1_______________\n______________111_____________________________111______________\n_____________11111___________________________11111_____________\n____________1111111_________________________1111111____________\n___________111111111_______________________111111111___________\n__________11111111111_____________________11111111111__________\n_________1111111111111___________________1111111111111_________\n________111111111111111_________________111111111111111________\n_______1_______________1_______________1_______________1_______\n______111_____________111_____________111_____________111______\n_____11111___________11111___________11111___________11111_____\n____1111111_________1111111_________1111111_________1111111____\n___111111111_______111111111_______111111111_______111111111___\n__11111111111_____11111111111_____11111111111_____11111111111__\n_1111111111111___1111111111111___1111111111111___1111111111111_\n111111111111111_111111111111111_111111111111111_111111111111111")
    }

  }
}