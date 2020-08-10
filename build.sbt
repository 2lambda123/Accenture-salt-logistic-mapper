
// =====================================================================================================================
// = Metadata
// =====================================================================================================================
name := "mapper"
version := "0.0.1"
organization := "de.salt.sce"
scalaVersion := "2.12.3"

resolvers += Resolver.sonatypeRepo("snapshots")

lazy val root = project in file("")

// Remove feature warning
// Doc: http://stackoverflow.com/questions/27895790/sbt-0-12-4-there-were-x-feature-warnings-re-run-with-feature-for-details
scalacOptions in ThisBuild ++= Seq("-feature")

// =====================================================================================================================
// = Unit Test Settings
// =====================================================================================================================
parallelExecution in Test := false // Execute unit tests one by one
logBuffered in Test := false

// =====================================================================================================================
// = Dependencies
// =====================================================================================================================

val akkaVersion = "2.5.26"
val akkaHttpVersion = "10.1.10"

libraryDependencies += "com.typesafe.akka" %% "akka-http" % akkaHttpVersion
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % akkaVersion
libraryDependencies += "com.typesafe.akka" %% "akka-stream" % akkaVersion
libraryDependencies += "com.typesafe.akka" %% "akka-slf4j" % akkaVersion
libraryDependencies += "com.typesafe.akka" %% "akka-testkit" % akkaVersion % "test"
libraryDependencies += "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpVersion % "test"

libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2"
libraryDependencies += "org.apache.logging.log4j" % "log4j-slf4j-impl" % "2.13.3"
libraryDependencies += "org.apache.logging.log4j" %% "log4j-api-scala" % "12.0"

libraryDependencies += "commons-codec" % "commons-codec" % "1.13"
libraryDependencies += "org.json4s" %% "json4s-native" % "3.6.7"
libraryDependencies += "de.heikoseeberger" %% "akka-http-json4s" % "1.28.0"
// Akka HTTP :: https://doc.akka.io/docs/akka-http/current/scala/http/index.html
//libraryDependencies += "com.typesafe.akka" %% "akka-http-testkit" % "10.1.10" % "test"
//libraryDependencies += "com.typesafe.akka" %% "akka-testkit" % "2.5.26" % "test"

// Scalatest :: http://www.scalatest.org
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

libraryDependencies += "org.junit.jupiter" % "junit-jupiter-engine" % "5.0.0" % "test"
libraryDependencies += "org.mockito" % "mockito-junit-jupiter" % "2.23.0" % "test"
libraryDependencies += "org.assertj" % "assertj-core" % "3.11.1" % "test"

libraryDependencies += "org.smooks" % "smooks-all" % "2.0.0-SNAPSHOT"
