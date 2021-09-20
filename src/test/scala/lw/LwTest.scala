package lw

import chiseltest.ChiselScalatestTester
import chiseltest._
import fetch.Top
import org.scalatest.FlatSpec

class LwTest extends FlatSpec with ChiselScalatestTester {

  "mycpu" should "work through hex" in {
    test(new Top) { c =>
      while (!c.io.exit.peek().litToBoolean) {
        c.clock.step(1)
      }
    }
  }
}
