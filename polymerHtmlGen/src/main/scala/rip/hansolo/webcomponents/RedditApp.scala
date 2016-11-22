package rip.hansolo.webcomponents



import scalatags.Text.all._

import rip.hansolo.polymer._
import rip.hansolo.polymer.PolymerTags._

import rip.hansolo.webcomponents.{RedditAppCommon => my}

import IronLocalStorage._
import IronFlexLayout._
import AppLayout._
/**
  * Created by giymo11 on 22.11.16.
  */
object RedditApp extends PolymerElement {

  override def is: String = my.name

  val insideScript = "rip.hansolo.webcomponents.RedditApp().main()"

  val allImports = IronLocalStorage.imports ++ AppLayout.imports ++ IronFlexLayout.imports

  val insideTemplate = Seq(
    ironFlexLayoutClassesStyleTag,
    ironLocalStorageTag(
      name := "hansolo-redditapp-oauth2-state",
      value := twoWayBinding(my.Props.oauthState),
      attr(eventListener(ironLocalStorageEmptyEvent)) := my.Method.newOauthState
    ),
    appHeaderLayoutTag(
      appFullbleedAttr := true,
      appHeaderTag(
        appfixedAttr := true,
        h1(
          "Hello Reddit?"
        )
      ),
      div(
        cls := "layout horizontal ",
        id := "container",
        style := "height: 100%",
        attr("on-wheel") := my.Method.onWheelEvent,
        for(i <- 1 until 10) yield div("lots of content", style := s"min-width: 500px; color: #$i$i$i")
      )
    )
  )

  override def rawHtmlString: String = boilerplate(my.name, insideScript, insideTemplate, allImports)
}

