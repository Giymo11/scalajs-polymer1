import sbt.Keys._

lazy val root: Project = (project in file("."))
  .settings(
    name := """scalajs-test""",
    version := "1.0",
    scalaVersion := "2.12.0",
    libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.1",
    libraryDependencies += "com.lihaoyi" %%% "scalatags" % "0.6.2",
    skip in packageJSDependencies := false
  )
  .enablePlugins(ScalaJSPlugin)


fork in run := true