package rip.hansolo.webcomponents


import scalatags.Text.all._

import rip.hansolo.polymer._
import rip.hansolo.polymer.PolymerTags._


object PolymerTest0 {

	val componentName = "scalajs-test0"

	val rawHtmlString = {

		val rootId = "root"

		val insideStyle = 
			""".content {
				margin-top: 32px;
				margin-bottom: 32px;
			}"""

		val insideTemplate = Seq(
			div("Waddap"),
			div("IT DAT BOIII"),
			div(id := rootId)
		).map(_.render).mkString("\n")

		val insideScript = """
			Polymer({
				is: """" + componentName + """",
				created: function() {
					console.log("It is alive.. maybe?");
				},
				ready: function() {
					console.log("It is alive!")
					rip.hansolo.web.ScalaJsPolymer().main(this.$.""" + rootId + """);
					rip.hansolo.web.ScalaJsPolymer().main(this.$$("#""" + rootId + """"));
				}
			});
		"""

		PolymerHtml.boilerplate(componentName, insideScript, insideTemplate, insideStyle)
	}
}