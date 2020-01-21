import proto_test.ProtoTest
import proto_test2.ProtoTest2
import typeMapper.CurrencyType

object Main {
  def main(args: Array[String]): Unit = {
    val p1 = ProtoTest(CurrencyType.Brl)
    val p2 = ProtoTest2(p1)
    p1.toByteArray // works
    p2.toByteArray // boom
  }
}
