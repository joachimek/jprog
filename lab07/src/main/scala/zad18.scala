object zad18 extends App {
  def countChars(str: String): Int ={
    str.toSet.size
  }
  val slowko = io.StdIn.readLine()
  var x = countChars(slowko)
  println(x)
}