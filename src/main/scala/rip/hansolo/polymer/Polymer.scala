package rip.hansolo.polymer

import org.scalajs.dom.raw.{HTMLElement, MouseEvent}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSExport, JSExportDescendentObjects, JSName, ScalaJSDefined}
import scala.scalajs.js.Dynamic.{literal => lit}

@js.native
object Polymer extends js.Object {
  def apply(prototype: Dynamic): js.Dynamic = js.native
}

@js.native
@JSName("Polymer.Base")
abstract class PolymerBase extends HTMLElement with PolymerLifeCycle with PolymerAttrObserver {
	@js.native
	val `$`: js.Dynamic = js.native
	@js.native
	def `$$`(selector: String): dom.raw.HTMLElement = js.native
}

@ScalaJSDefined
abstract class PolymerElement extends PolymerBase {
	def is: String
	def properties: js.Dynamic = lit()
	def observers: js.Array[String] = js.Array()
}

@ScalaJSDefined
trait PolymerLifeCycle extends js.Object {
  def beforeRegister(): Unit
  def created(): Unit
  def ready(): Unit
  def attached(): Unit
  def detached(): Unit
}

@ScalaJSDefined
trait PolymerAttrObserver extends js.Object {
  def attributeChanged(aName: String, aType: String): Unit
}


@js.native
trait Property extends js.Object {
  val aType: String = js.native
  val aValue: String = js.native
}

object Property {
  def apply(aType: String, aValue: String): Property =
    js.Dynamic.literal("type" -> aType, "value" -> aValue).asInstanceOf[Property]
}