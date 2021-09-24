package fetch

import chisel3.fromIntToLiteral
import chiseltest.{ChiselScalatestTester, _}
import org.scalatest.FlatSpec

class CTest extends FlatSpec with ChiselScalatestTester {
  "mycpu" should "work through hex" in {
    test(new Top) { c =>
      while (!c.io.exit.peek().litToBoolean) {
        c.clock.step(1)
      }
    }
  }
}
