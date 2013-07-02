name := "activator-template-template"

version := "1.0"

scalaVersion := "2.10.1"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "1.9.1" % "test",
  "junit" % "junit" % "4.11" % "test",
  "com.novocode" % "junit-interface" % "0.7" % "test->default"
  
  // Add your own project dependencies in the form:
  // "group" % "artifact" % "version"
)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")
