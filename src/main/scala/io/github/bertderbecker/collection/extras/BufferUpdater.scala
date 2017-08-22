package io.github.bertderbecker.collection.extras

import scala.collection.mutable

object BufferUpdater {

  implicit class BufferUpdaterBufferOps[T](buffer: mutable.Buffer[T]) {

    def setLastOrAdd(element: T): Unit =
      if (buffer.isEmpty) buffer += element
      else buffer(buffer.indices.max) = element

  }

}
