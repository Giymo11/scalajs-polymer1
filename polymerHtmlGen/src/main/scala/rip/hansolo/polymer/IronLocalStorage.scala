package rip.hansolo.polymer

import scalatags.Text.all._

import PolymerTags._

/**
  * Created by giymo11 on 22.11.16.
  */
object IronLocalStorage {
  val imports = Seq(
    linkImport("/bower_components/iron-localstorage/iron-localstorage.html")
  )

  val ironLocalStorageTag = tag("iron-localstorage" )

  val ironLocalStorageEmptyEvent = "iron-localstorage-load-empty"
}
