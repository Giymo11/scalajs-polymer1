package rip.hansolo.web

import rip.hansolo.polymer._

import scala.scalajs.js.annotation._
import scala.scalajs.js.JSApp
import scala.scalajs.js
import org.scalajs.dom

object ScalajsPolymerHacking extends JSApp {
	def main(): Unit = {
		println("lol")
		Polymer(js.constructorOf[ScalajsPolymerHackingElement])
	}
}

@ScalaJSDefined
@JSExport
class ScalajsPolymerHackingElement extends PolymerElement {

  override def is: String = "scalajs-hacking"

  override def created(): Unit = {
		println("Maybe it'll be alive soon? LOLOLO")
	}
  override def ready(): Unit = {
		println("It probably is now!")
		ScalaJsPolymer.main(this.`$`.root.asInstanceOf[dom.html.Div])
		ScalaJsPolymer.main(this.`$$`("#root").asInstanceOf[dom.html.Div])
	}
}

object ScalajsPolymerHacking0 extends JSApp {
	def main(): Unit = {
		println("lol")
		Polymer(js.constructorOf[ScalajsPolymerHackingElement0])
	}
}

@ScalaJSDefined
@JSExport
class ScalajsPolymerHackingElement0 extends PolymerElement {

	override def is: String = "scalajs-hacking0"

	override def created(): Unit = {
		println("Maybe it'll be alive soon? LOLOLasdasdasO")
	}
	override def ready(): Unit = {
		println("It probably is now!")
		ScalaJsPolymer.main(this.`$`.root.asInstanceOf[dom.html.Div])
		ScalaJsPolymer.main(this.`$$`("#root").asInstanceOf[dom.html.Div])
	}
}