object zad19 extends App {
    def subseq[A](seq: Seq[A], bIdx: Int, eIdx: Int): Seq[A] = {
        seq.take(eIdx + 1).drop(bIdx)
    }
    
}