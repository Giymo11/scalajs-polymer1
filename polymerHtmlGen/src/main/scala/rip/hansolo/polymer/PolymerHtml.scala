package rip.hansolo.polymer

import scalatags.Text.TypedTag
import scalatags.Text.all._


object PolymerTags {

	def linkImport(hrefValue: String) = link(
				rel := "import",
				href := hrefValue)
  def eventListener(event: String): String = "on-" + event

	val domModule = tag("dom-module")
	val template = tag("template")
}

abstract class PolymerElement {

  def is: String
  def rawHtmlString: String

  import PolymerTags._

  def boilerplate(
                   componentName: String,
                   insideScript: String,
                   insideTemplate: Seq[TypedTag[String]] = Seq(),
                   imports: Seq[TypedTag[String]] = Seq(),
                   insideStyle: String = ""
                 ): String = {
    imports ++ Seq(
      linkImport("../bower_components/polymer/polymer.html"),
      linkImport("scalajs-import.html"),
      domModule(
        id := componentName,
        template(
          tag("style")(
            raw(insideStyle)
          ),
          insideTemplate
        ),
        script(
          `type` := "text/javascript",
          raw(insideScript)
        )
      )
    )}.render

  def twoWayBinding(prop: String) = s"{{$prop}}"
  def oneWayBinding(prop: String) = s"[[$prop]]"
}