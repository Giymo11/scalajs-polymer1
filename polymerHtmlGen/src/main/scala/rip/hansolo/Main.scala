package rip.hansolo


import rip.hansolo.polymer.PolymerElement
import rip.hansolo.webcomponents._


object Main {
	def main(args: Array[String]): Unit = {
		println("hello world")

		val polymerElements = Seq(
			RedditApp
		)

		def writeComponentToDisk(folder: String, component: PolymerElement) = {

			import java.io.PrintWriter
			import java.io.File

			val outputPath = folder + component.is + ".html"
			println(outputPath)

			val pw = new PrintWriter(new File(outputPath))
			pw.write(component.rawHtmlString)
			pw.close()
		}

		polymerElements.foreach(writeComponentToDisk("./src/", _))

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