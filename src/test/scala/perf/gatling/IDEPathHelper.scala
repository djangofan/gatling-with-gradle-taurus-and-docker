package perf.gatling

import java.nio.file.Path

import io.gatling.commons.util.PathHelper._

object IDEPathHelper {

	val gatlingConfUrl: Path = getConfigFile("gatling.conf")

	private def getConfigFile(fileName: String) : Path = {
		try {
			return getClass.getClassLoader.getResource(fileName)
		} catch {
				case e: Throwable =>
				throw new java.lang.ExceptionInInitializerError("Missing config file " + fileName + " in resources.")
		}
	}

	val projectRootDir = gatlingConfUrl.ancestor(3) //refers to gatling-gradle-example/build folder

	val mavenSourcesDirectory = projectRootDir / "src" / "test" / "scala"
	val mavenResourcesDirectory = projectRootDir / "src" / "test" / "resources"
	val mavenTargetDirectory = projectRootDir / "target"
	val mavenBinariesDirectory = mavenTargetDirectory / "test-classes"

	val resourcesDirectory = mavenResourcesDirectory
	val simulationsDirectory = mavenSourcesDirectory / "simulations"
	val dataDirectory = mavenResourcesDirectory / "data"

	val resultsDirectory = mavenTargetDirectory / "gatling"

	val recorderConfigFile = mavenResourcesDirectory / "recorder.conf"
	val recorderSimulationsDirectory = mavenSourcesDirectory / "recorded"

}
