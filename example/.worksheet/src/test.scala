object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(57); 
  println("Welcome to the Scala worksheet");$skip(124); 

  def squareList(xs: List[Int]): List[Int] = xs match {
    case Nil => xs
    case y :: ys => y * y :: squareList(ys)
  };System.out.println("""squareList: (xs: List[Int])List[Int]""");$skip(100); 

//  def squareList(xs: List[Int]): List[Int] = xs.map(n => n * n)

  val xs = List(3, 1, -4, 5, 3);System.out.println("""xs  : List[Int] = """ + $show(xs ));$skip(17); val res$0 = 
  squareList(xs);System.out.println("""res0: List[Int] = """ + $show(res$0))}
}
