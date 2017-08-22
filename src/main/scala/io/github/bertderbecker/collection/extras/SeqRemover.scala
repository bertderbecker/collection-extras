package io.github.bertderbecker.collection.extras

object SeqRemover {

  implicit class SeqRemoverSeqOps[I](seq: Seq[I]) {
    def -(element: I): Seq[I] = --(Seq(element))

    def --(that: Seq[I]): Seq[I] = seq diff that
  }

}
