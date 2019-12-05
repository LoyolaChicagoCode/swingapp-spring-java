name := "swingapp-spring"

version := "0.2"

javacOptions in compile += "-Xlint:all"

javaOptions += "-enableassertions"

libraryDependencies ++= Seq(
  "commons-logging"     %  "commons-logging" % "1.2",
  "org.springframework" %  "spring-core"     % "5.2.2.RELEASE",
  "org.springframework" %  "spring-beans"    % "5.2.2.RELEASE"
)

enablePlugins(JavaAppPackaging)
