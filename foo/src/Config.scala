package foo

import mainargs._

case class Config(
    @arg(doc = "Print this help message.")
    help: Flag
)
