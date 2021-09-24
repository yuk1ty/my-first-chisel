package fetch

import chisel3.fromIntToLiteral
import chiseltest.ChiselScalatestTester
import org.scalatest.FlatSpec
import chiseltest._

class RiscvTest extends FlatSpec with ChiselScalatestTester {
  "mycpu" should "work through hex" in {
    test(new Top) { c =>
      while (!c.io.exit.peek().litToBoolean) {
        c.clock.step(1)
      }
      c.io.gp.expect(1.U)
    }
  }
}
