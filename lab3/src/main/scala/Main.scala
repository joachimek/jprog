object Main extends App {
  println("LICZBY PIERWSZE / ZAD 4")
  var liczba = io.StdIn.readInt()
  /*def jestPierwsza (n: Int) : Boolean = {
    var dzielnik = 2
    if(n < 3)
    return false
    while(dzielnik < n){
      if(n % dzielnik == 0)
      return false
      dzielnik = dzielnik + 1
    }
    return true
  }*/
  def jestPierwsza (n: Int) : Boolean = {
    @annotation.tailrec
    def helper(n: Int, divisor: Int = 2) : Boolean = {
      if(divisor == n) true
      else if(n % divisor == 0) false
      else
      helper(n, divisor + 1)
    }
    if(n < 2) false else helper(n)
  }
  if (jestPierwsza(liczba)) println("jest pierwsza")
  else println("nie jest pierwsza")
  /*var mozePalindrom = io.StdIn.readLine()
  def jestPalindromem (tab: Array[Int]) : Boolean = {
    @annotation.tailrec
    def helper(przod: Int = Array(var n = 1), tyl: Int = Array(var m = Array.size)) : Boolean = {
      if(m <= n) true
      else if(przod == tyl) helper(przod(n+1), tyl(m-1))
      else false
    }
  }
  if (jestPalindromem(mozePalindrom)) println("jest palindromem")
  else println("nie jest palindromem")*/
  println("FIBONACCI / ZAD 6")
  var ktoryFibo = io.StdIn.readInt()
  def ciag(n: Int) : Int = {
    if(n < 3) 1
    else ciag(n-1) + ciag(n-2)
  }
  println(ciag(ktoryFibo))
  /*println("TROJKAT / ZAD 7")
  var wysokosc = io.StdIn.readInt()
  def trojkat(wys: Int): Unit = {
  }*/
}
