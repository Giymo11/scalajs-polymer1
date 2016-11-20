package rip.hansolo.web

import rip.hansolo.polymer._
import Polymer._

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

	def beforeRegister(): Unit = ()
  def created(): Unit = {
		println("Maybe it'll be alive soon?")
	}
  def ready(): Unit = {
		println("It probably is now!");
		ScalaJsPolymer.main(this.`$`.root.asInstanceOf[dom.html.Div]);
		ScalaJsPolymer.main(this.`$$`("#root").asInstanceOf[dom.html.Div]);
	}
  def attached(): Unit = ()
  def detached(): Unit = ()

	def attributeChanged(aName: String, aType: String): Unit = ()
}
