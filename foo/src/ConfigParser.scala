package foo

import mainargs._

object ConfigParser {

  private[this] lazy val parser: ParserForClass[Config] = mainargs.ParserForClass[Config]

  lazy val usageText = parser.helpText()

  def main (args: Array[String]): Unit = {
    parser.constructOrThrow(
      args.toIndexedSeq,
      allowRepeats = true
    )
    ()
  }

}
