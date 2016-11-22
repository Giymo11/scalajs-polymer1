package rip.hansolo.webcomponents



import scalatags.Text.all._

import rip.hansolo.polymer._
import rip.hansolo.polymer.PolymerTags._

import rip.hansolo.webcomponents.{RedditAppCommon => my}

import IronLocalStorage._
/**
  * Created by giymo11 on 22.11.16.
  */
object RedditApp extends PolymerElement {

  override def is: String = my.name

  val insideScript = "rip.hansolo.webcomponents.RedditApp().main()"

  val allImports = IronLocalStorage.imports

  val insideTemplate = Seq(
    ironLocalStorageTag(
      name := "hansolo-redditapp-oauth2-state",
      value := twoWayBinding(my.Props.oauthState),
      attr(eventListener(ironLocalStorageEmptyEvent)) := my.Method.newOauthState
    )
  )

  override def rawHtmlString: String = boilerplate(my.name, insideScript, insideTemplate, allImports)
}

