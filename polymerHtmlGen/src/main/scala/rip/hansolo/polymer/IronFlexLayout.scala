package rip.hansolo.polymer

import scalatags.Text.all._

import PolymerTags._

/**
  * Created by giymo11 on 22.11.16.
  */
object IronFlexLayout {
  val imports = Seq(
    linkImport("/bower_components/iron-flex-layout/iron-flex-layout.html"),
    linkImport("/bower_components/iron-flex-layout/iron-flex-layout-classes.html")
  )

  val ironFlexLayoutClassesStyleTag = tag("style")(
    attr("include") := "iron-flex"
  )
}
