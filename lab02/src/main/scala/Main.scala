object Main extends App {
  val alphabet = ('A' to 'Z').toArray
  var alphabetSize = alphabet.size 
  var codingTable = Array.ofDim[Char](alphabetSize, alphabetSize)
  //codingTable(0)(0) = alphabet(0)
  var i = 0
  var j = 0
  //while (i < alphabetSize){
  //  j = 0
  //  var k = i
  //  while (j < alphabetSize){
  //    codingTable(i)(j) = alphabet(k)
  //    if(k < alphabetSize-1){
  //      k = k + 1
  //    }
  //    else{
  //      k = 0
  //    }
  //    j = j + 1
  //  }
  //  i = i + 1
  //}
  while(j < alphabetSize){
    while(i < alphabetSize){
      if(j == 0)
      codingTable(i)(j) = alphabet(i)
      else{
        if(i == 25)
        codingTable(i)(j) = codingTable(0)(j-1)
        else
        codingTable(i)(j) = codingTable(i+1)(j-1)
      }
      i = i + 1
    }
    j = j + 1
    i = 0
  }
  //println(alphabet.mkString(" "))
  i = 0
  j = 0
  while(j < alphabetSize){
    while(i < alphabetSize){
      print(codingTable(i)(j))
      print(" ")
      i = i + 1
      }
    j = j + 1
    i = 0
    println(" ")
  }
  println(" ")
  val pawiany = ("pawianywchodzanasciany").toArray
  val wiadomosc = io.StdIn.readLine()
  var wSize = wiadomosc.size
  var pSize = pawiany.size
  val encrypted = Array[Char](wSize)
  i = 0
  j = 0
  while(i < wSize){
    if(j > pSize)
    j = 0
    encrypted(i) = codingTable(i)(j)
    i += 1
    j += 1
  }
  println(encrypted.mkString(" "))
}