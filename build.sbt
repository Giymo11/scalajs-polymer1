import sbt.Keys._


name := "ScalaJS + Polymer Testings"
scalaVersion in ThisBuild := "2.12.0"


lazy val shared = crossProject.crossType(CrossType.Pure).in(file("shared"))
  .settings(
    libraryDependencies += "com.lihaoyi" %%% "scalatags" % "0.6.2"
  )

lazy val sharedJvm = shared.jvm
lazy val sharedJs = shared.js



lazy val polymerHtmlGen = project.in(file("polymerHtmlGen"))
  .settings(
    name := "polymerHtmlGen"
  )
  .dependsOn(sharedJvm)

lazy val scalajsPolymer = project.in(file("scalajsPolymer"))
  .settings(
    name := "scalajsPolymer",
    skip.in(packageJSDependencies) := false,
    libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.1"
  )
  .dependsOn(sharedJs)
  .enablePlugins(ScalaJSPlugin)



lazy val root = project.in(file("."))
  .aggregate(sharedJvm, sharedJs, polymerHtmlGen, scalajsPolymer)