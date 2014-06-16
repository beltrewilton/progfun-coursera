object packws {
  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil => Nil
    case x :: xs1 => //xs.takeWhile(y => x == y) :: pack(xs1.dropWhile(y => x == y))
    	val (first, rest) = xs span(y => x == y)
    	first :: pack(rest)
  }                                               //> pack: [T](xs: List[T])List[List[T]]


	val data = List("a", "a", "a", "b", "c", "c", "a")
                                                  //> data  : List[String] = List(a, a, a, b, c, c, a)
  pack(data)                                      //> res0: List[List[String]] = List(List(a, a, a), List(b), List(c, c), List(a))
                                                  //| 
  // List(List("a", "a", "a"), List("b"), List("c", "c"), List("a"))
  // List(List(a, a, a), List(b), List(c, c), List(a))
  
  def encode[T](xs: List[T]): List[(T, Int)] =
  	pack(xs) map (ys => (ys.head, ys.length)) //> encode: [T](xs: List[T])List[(T, Int)]
  
  encode(data)                                    //> res1: List[(String, Int)] = List((a,3), (b,1), (c,2), (a,1))
}