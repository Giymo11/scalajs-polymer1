package rip.hansolo.polymer

import scalatags.Text.all._

import PolymerTags._

/**
  * Created by giymo11 on 22.11.16.
  */
object AppLayout {
  val imports = Seq(
    linkImport("/bower_components/app-layout/app-layout.html")
  )

  val appHeaderLayoutTag = tag("app-header-layout" )
  val appHeaderTag = tag("app-header" )

  val appFullbleedAttr = attr("fullbleed")
  val appfixedAttr = attr("fixed")
}
