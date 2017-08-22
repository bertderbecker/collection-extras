package io.github.bertderbecker.collection.extras

object SeqUpdater {

  implicit class SeqUpdaterSeqOps[I](seq: Seq[I]) {
    def lastUpdated(element: I): Seq[I] =
      if (seq.nonEmpty) seq.updated(seq.indices.max, element)
      else throw new IllegalStateException("Seq is empty")

    def lastUpdatedOrAdd(element: I): Seq[I] =
      if (seq.isEmpty) Seq(element)
      else lastUpdated(element)
  }

}
