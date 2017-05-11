/**
  * Created by xiejinpeng on 2017/5/11.
  */


object exercise {


  // exercise 2.2
  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    @annotation.tailrec
    def loop[A](n: Int): Boolean =
      if (n + 1 >= as.length) false
      else if (!ordered(as(n), as(n + 1))) false
      else loop(n + 1)

    loop(0)
  }

  // exercise 2.3
  def curry[A, B, C](f: (A, B) => C): A => (B => C) = {
    a: A => b: B => f(a, b)
  }
}
