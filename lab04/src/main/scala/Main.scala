object Main extends App {
  def merge[A](a: Seq[A], b: Seq[A])(leq: (A, A) => Boolean): Seq[A] = {
    @annotation.tailrec
    def helper(a: Seq[A], b: Seq[A], akum: Seq[A]): Seq[A] = (a, b) match {
      case _ if a.isEmpty || b.isEmpty =>
        akum.reverse ++ a ++ b 
      case (aHead +: aTail, bHead +: bTail) =>
        if (leq(aHead, bHead)) {
          helper(aTail, b, aHead +: akum)
        } else {
          helper(a, bTail, bHead +: akum)
        }
    }
  }
  val s1: Seq[Int] = Seq(1, 2, 3, 7)
  val s2: Seq[Int] = Seq(4, 21, 29)
  
}