package rip.hansolo.webcomponents


import rip.hansolo.polymer.{Polymer, PolymerElement, Property}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => lit}
import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.{JSExport, ScalaJSDefined}
import rip.hansolo.webcomponents.{RedditAppCommon => my}

import scala.util.Random

/**
  * Created by giymo11 on 21.11.16.
  */

object RedditApp extends JSApp {
  def main(): Unit = {
    Polymer(js.constructorOf[RedditAppElement])
  }
}

@ScalaJSDefined
@JSExport
class RedditAppElement extends PolymerElement {

  val is = my.name

  var oauthState: String = _

  override def created(): Unit = println("waddap " + my.name)

  def newOauthState() = {
    this.oauthState = (1 to 16).map((_) => Random.nextPrintableChar()).mkString("")
  }
}
