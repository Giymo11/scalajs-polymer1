package rip.hansolo.polymer

import org.scalajs.dom
import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => lit}
import scala.scalajs.js.annotation.{JSBracketAccess, JSName, ScalaJSDefined}

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

	override def beforeRegister(): Unit = ()
  override def created(): Unit = ()
  override def ready(): Unit = ()
  override def attached(): Unit = ()
  override def detached(): Unit = ()

	def attributeChanged(aName: String, aType: String): Unit = ()
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
	val reflectToAttribute: Boolean = js.native
	val readOnly: Boolean = js.native
	val shouldNotify: Boolean = js.native
	val computed: String = js.native
	val observer: String = js.native
}

object Property {
	/**
	* aType should be of type Boolean, Date, Number, String, Array or Object
	* aValue should be of type boolean, number, string or function.
	*/
  def apply(
		aType: js.Any,
		aValue: js.Any = null,
		reflectToAttribute: Boolean = false,
		readOnly: Boolean = false,
		shouldNotify: Boolean = false,
		computed: String = null,
		observer: String = null): Property = {
			lit(
				"type" -> aType,
				"value" -> aValue,
				"reflectToAttribute" -> reflectToAttribute,
				"readOnly" -> readOnly,
				"notify" -> shouldNotify,
				"computed" -> computed,
				"observer" -> observer
			).asInstanceOf[Property]
		}
}