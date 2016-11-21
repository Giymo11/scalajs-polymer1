package rip.hansolo.webcomponents



import rip.hansolo.polymer._

import scalatags.Text.all._



/**
  * Created by giymo11 on 21.11.16.
  */
object ObserverTest0 extends PolymerElement {

  import ObserverTest0Common._

  override def is: String = name

  val insideScript = "rip.hansolo.webcomponents.ObserverTest0().main();"

  val insideStyle =
    """.content {
				margin-top: 32px;
				margin-bottom: 32px;
			}"""

  val insideTemplate = Seq(
    div(oneWayBinding(Prop.test)),
    div("asdf"),
    button(
      attr("on-tap") := Obs.buttonClick,
      "TEST BUTTON!!!"
    )
  ).map(_.render).mkString("\n")



  override def rawHtmlString(): String = boilerplate(name, insideScript, insideTemplate, insideStyle)
}
