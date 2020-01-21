package typeMapper

import enumeratum.EnumEntry.Snakecase
import enumeratum.{ CirceEnum, Enum, QuillEnum }

sealed trait CurrencyType extends Snakecase

object CurrencyType extends Enum[CurrencyType] with CirceEnum[CurrencyType] with QuillEnum[CurrencyType] {

  final case object Brl extends CurrencyType

  val values = findValues
}
