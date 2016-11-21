package rip.hansolo


import rip.hansolo.webcomponents._


object Main {
	def main(args: Array[String]): Unit = {
		println("hello world")

		val polymerElementHtml = PolymerTest0.rawHtmlString
		println(polymerElementHtml)

		import java.io.PrintWriter
		import java.io.File

		val pw = new PrintWriter(new File("./src/" + PolymerTest0.componentName + ".html"))
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