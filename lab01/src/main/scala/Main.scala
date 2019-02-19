object Main extends App {
  var liczba = io.StdIn.readInt()
  println(s"wczytales: $liczba")
  var x = 1
  var z = 2
  while(x != 0 && z != liczba){
    x = liczba%z
    z = z + 1
  }
  if(z == liczba)
  println(s"liczba $liczba jest pierwsza")
  else
  println(s"liczba $liczba nie jest pierwsza")
  var n = io.StdIn.readInt()
}