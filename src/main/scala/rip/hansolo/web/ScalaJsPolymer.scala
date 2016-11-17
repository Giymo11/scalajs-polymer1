package rip.hansolo.web

import org.scalajs.dom

import scalatags.JsDom.all._

import scala.scalajs.js.annotation.JSExport

@JSExport
object ScalaJsPolymer {
  @JSExport
  def main(root: dom.html.Div): Unit = {
    val content = h2("Hello World.").render

    root.appendChild(content)
  }
}
