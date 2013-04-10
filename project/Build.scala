import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "Regatta"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    javaCore,
    javaJdbc,
    javaEbean,
    "com.google.inject" % "guice" % "3.0",
    "com.google.inject.extensions" % "guice-multibindings" % "3.0"
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    
    // disable parallel execution
    // parallelExecution in jacoco.Config := false,
    
	// known as group id...
	organization := "de.htwg.seapal",

	// disable using the Scala version in output paths and artifacts
	crossPaths := false,

	// add additional resovers
    resolvers += "HTWG Resolver" at "http://lenny2.in.htwg-konstanz.de:8081/artifactory/libs-snapshot-local",
	resolvers += "db4o-repo" at "http://source.db4o.com/maven",

	// add publishing target
    publishTo := Some("HTWG Publish To" at "http://lenny2.in.htwg-konstanz.de:8081/artifactory/libs-snapshot-local;build.timestamp=" + new java.util.Date().getTime()), 
  
  	// setup entry points for sonar code analyzer
  	pomExtra :=
	  <build>
	    <sourceDirectory>app</sourceDirectory>
	    <testSourceDirectory>test</testSourceDirectory>
	    <resources>
	      <resource>
	        <directory>app</directory>
	      </resource>
	    </resources>
	  </build>
  )


}
