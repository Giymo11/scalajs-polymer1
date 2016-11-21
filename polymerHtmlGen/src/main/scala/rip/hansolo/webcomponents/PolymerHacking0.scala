package rip.hansolo.webcomponents

import rip.hansolo.polymer._

import scalatags.Text.all._

/**
  * Created by giymo11 on 21.11.16.
  */
object PolymerHacking0 extends PolymerElement {

  val is = "scalajs-hacking0"
  val rootId = "root"

  val insideStyle =
    """.content {
				margin-top: 32px;
				margin-bottom: 32px;
			}"""

  val insideTemplate = Seq(
    div("Waddap"),
    div("IT DAT BOIIIII"),
    div(id := rootId)
  ).map(_.render).mkString("\n")

  val insideScript = "rip.hansolo.web.ScalajsPolymerHacking0().main();"

  override def rawHtmlString: String = boilerplate(is, insideScript, insideTemplate, insideStyle)
}
