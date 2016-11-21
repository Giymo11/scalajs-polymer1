package rip.hansolo.web

import rip.hansolo.polymer._

import scala.scalajs._
import scala.scalajs.js._
import scala.scalajs.js.annotation._
import scala.scalajs.js.Dynamic.{literal => lit}


object ObserverTest extends JSApp {
	def main(): Unit = {
		Polymer(js.constructorOf[ObserverTestElement])
	}
}

@ScalaJSDefined
@JSExport
class ObserverTestElement extends PolymerElement {

  override def is: String = "scalajs-observertest"

  override def properties = lit(
    "test" -> Property(
			aType = "Number",
			aValue = 0
		)
  )

	var test: Int = _

  override def observers = js.Array(
    "valueObserver(test)"
  )

  def valueObserver(test: Int): Unit = {
    println(test)
  }

  def buttonClick() = {
    this.test += 10
  }
}