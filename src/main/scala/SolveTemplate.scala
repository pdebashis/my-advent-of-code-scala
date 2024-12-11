import scala.io.Source

class ??? {
  def run(inputFile: String) =  {
    val startTime = System.nanoTime()
    println(s"Executing for ${inputFile.split("/").last}")
    val input = Source.fromFile(inputFile).getLines().toList

    val output1 = 0
    val output2 = 0

    println(output1)
    println(output2)

    val endTime = System.nanoTime()
    val duration = (endTime - startTime) / 1e9d
    println(s"Runtime: $duration seconds")
  }
}

object ??? {
  def main(args: Array[String]): Unit = {
    val app = new ???()

    app.run("./src/main/scala/aoc%YEAR%/Day%DAY%/Example.txt")
//    app.run("./src/main/scala/aoc%YEAR%/Day%DAY%/Input.txt")
  }
}