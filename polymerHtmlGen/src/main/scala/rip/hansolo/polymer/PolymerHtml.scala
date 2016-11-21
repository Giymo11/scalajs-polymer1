package rip.hansolo.polymer

import scalatags.Text.all._


object PolymerTags {

	def linkImport(hrefValue: String) = link(
				rel := "import",
				href := hrefValue)

	val domModule = tag("dom-module")
	val template = tag("template")
}

abstract class PolymerElement {

  def is: String
  def rawHtmlString: String

  import PolymerTags._

  def boilerplate(componentName: String, insideScript: String, insideTemplate: String = "", insideStyle: String = "") = Seq(
    linkImport("../bower_components/polymer/polymer.html"),
    linkImport("scalajs-import.html"),
    domModule(
      id := componentName,
      template(
        tag("style")(
          raw(insideStyle)
        ),
        raw(insideTemplate)
      ),
      script(
        `type` := "text/javascript",
        raw(insideScript)
      )
    )
  ).map(_.render).mkString("\n")

  def twoWayBinding(prop: String) = s"{{$prop}}"
  def oneWayBinding(prop: String) = s"[[$prop]]"
}