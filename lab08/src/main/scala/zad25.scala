object zad25 extends App {
    val strefy: Seq[String] = java.util.TimeZone.getAvailableIDs.toSeq
    val euro = strefy.filter(_.startsWith("Europe"))
    def stripPrefix(prefix: String): String
    //euro.stripPrefix("Europe/")
    println(s"$euro")
}