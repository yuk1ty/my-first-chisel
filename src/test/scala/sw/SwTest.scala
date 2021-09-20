package sw

import chiseltest.{ChiselScalatestTester, _}
import fetch.Top
import org.scalatest.FlatSpec

class SwTest extends FlatSpec with ChiselScalatestTester {

  "mycpu" should "work through hex" in {
    test(new Top) { c =>
      while (!c.io.exit.peek().litToBoolean) {
        c.clock.step(1)
      }
    }
  }
}
