package rip.hansolo.webcomponents

import rip.hansolo.polymer.{Polymer, PolymerElement, Property}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => lit}
import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.{JSExport, ScalaJSDefined}

import ObserverTest0Common._

/**
  * Created by giymo11 on 21.11.16.
  */

object ObserverTest0 extends JSApp {
  def main(): Unit = {
    Polymer(js.constructorOf[ObserverTest0Element])
  }
}

@ScalaJSDefined
@JSExport
class ObserverTest0Element extends PolymerElement {

  val is = name

  def buttonClick() = {
    this.test += 10
  }

  override def properties = lit(
    Prop.test -> Property(
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
}