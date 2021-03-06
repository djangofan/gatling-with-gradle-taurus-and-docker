package perf.gatling

import java.nio.file.{Path, Paths}

object IDEPathHelper {

	val projectRootDir: String = Paths.get(".").toAbsolutePath.normalize.toString
	val gatlingConfUrl: String = projectRootDir + "/gatling.conf"

	val mavenSourcesDirectory = projectRootDir + "/src/test/scala"
	val mavenResourcesDirectory = projectRootDir + "/src/test/resources"
	val mavenTargetDirectory = projectRootDir + "/target"
	val mavenBinariesDirectory = mavenTargetDirectory + "/test-classes"

	val resourcesDirectory = mavenResourcesDirectory
	val simulationsDirectory = mavenSourcesDirectory + "/simulations"
	val dataDirectory = mavenResourcesDirectory + "/data"

	val resultsDirectory = mavenTargetDirectory + "/gatling"

	val recorderConfigFile = mavenResourcesDirectory + "/recorder.conf"
	val recorderConfigFilePath: Path = Paths.get(recorderConfigFile)

	val recorderSimulationsDirectory = mavenSourcesDirectory + "/recorded"

	def main(args: Array[String]): Unit = {

		println(projectRootDir)
		println(gatlingConfUrl)

	}

}
