package week4

object TestList {
	def nth[T](n: Int, xs: List[T]): T = {
    if (xs.isEmpty) throw new IndexOutOfBoundsException
    else if (n == 0) xs.head
    else nth(n - 1, xs.tail)
  }                                               //> nth: [T](n: Int, xs: week4.List[T])T
	val list: List[Int] = new Cons(4, new Cons(6, new Cons(2, new Nil)))
                                                  //> list  : week4.List[Int] = {4, {6, {2, Nil}}}
	nth(1, list)                              //> res0: Int = 6
}