package rip.hansolo

object Main {
	def main(args: Array[String]): Unit = {
		println("hello world")

		import scalatags.Text.all._

		val componentName = "scalajs-test0"
		val rootId = "root"

		def addQuotes(value: String) = "\"" + value + "\""

		val polymerTags = Seq(
			link(
				rel := "import",
				href := "../bower_components/polymer/polymer.html"),
			link(
				rel := "import",
				href := "scalajs-import.html"),
			tag("dom-module")(
				attr("id") := componentName,
				tag("template")(
					tag("style")("""
						.content {
							margin-top: 32px;
							margin-bottom: 32px;
						}"""),
					div("Waddap"),
					div("IT DAT BOI"),
					div(
						id := rootId
					)
				),
				script(
					`type` := "text/javascript",
					raw("""
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
					""")
				)
			)
		)

		val polymerElementHtml = polymerTags.map(_.render).mkString("\n")
		println(polymerElementHtml)

		import java.io.PrintWriter
		import java.io.File

		val pw = new PrintWriter(new File("./src/" + componentName + ".html"))
		pw.write(polymerElementHtml)
		pw.close()
	}

/*
<dom-module id="scalajs-test">
  <template>
		<style>
		.content {
			margin-top: 32px;
			margin-bottom: 32px;
		}
		</style>
		<div>Nothing to see here.</div>
		<div>Except maybe there is?</div>
		<div id="root"></div>
  </template>
  <script type="text/javascript">
		Polymer({
			is: "scalajs-test",
			created: function() {
				console.log("It is alive.. maybe?");
			},
			ready: function() {
				console.log("It is alive!")
				rip.hansolo.web.ScalaJsPolymer().main(this.$.root);
				rip.hansolo.web.ScalaJsPolymer().main(this.$$("#root"));
			}
		});
	</script>
</dom-module>
*/
}