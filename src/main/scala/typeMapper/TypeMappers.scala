package typeMapper

import scalapb.TypeMapper

object TypeMappers {
  implicit val typeMapperCurrencyType: TypeMapper[String, CurrencyType] =
    TypeMapper[String, CurrencyType](CurrencyType.withNameInsensitive)(_.entryName)

}
