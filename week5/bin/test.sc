object test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def squareList(xs: List[Int]): List[Int] = xs match {
    case Nil => xs
    case y :: ys => y * y :: squareList(ys)
  }                                               //> squareList: (xs: List[Int])List[Int]

//  def squareList(xs: List[Int]): List[Int] = xs.map(n => n * n)

  val xs = List(3, 1, -4, 5, 3)                   //> xs  : List[Int] = List(3, 1, -4, 5, 3)
  squareList(xs)                                  //> res0: List[Int] = List(9, 1, 16, 25, 9)
}