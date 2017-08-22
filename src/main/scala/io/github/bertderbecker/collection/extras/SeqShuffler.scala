package io.github.bertderbecker.collection.extras

import scala.util.Random

object SeqShuffler {

  implicit class SeqShufflerSeqOps[A](seq: Seq[A]) {

    def shuffled: Seq[A] = Random.shuffle(seq)

    def randomElement: A = seq(new Random(System.currentTimeMillis()).nextInt(seq.size))

  }

}
