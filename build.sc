import mill._, mill.scalalib._

object foo extends ScalaModule {
  def scalaVersion = "2.13.10"
  override def ivyDeps = Agg(ivy"com.lihaoyi::mainargs:0.3.0")
}
