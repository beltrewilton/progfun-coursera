object packws {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(250); 
  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil => Nil
    case x :: xs1 => //xs.takeWhile(y => x == y) :: pack(xs1.dropWhile(y => x == y))
    	val (first, rest) = xs span(y => x == y)
    	first :: pack(rest)
  };System.out.println("""pack: [T](xs: List[T])List[List[T]]""");$skip(54); 


	val data = List("a", "a", "a", "b", "c", "c", "a");System.out.println("""data  : List[String] = """ + $show(data ));$skip(13); val res$0 = 
  pack(data);System.out.println("""res0: List[List[String]] = """ + $show(res$0));$skip(219); 
  // List(List("a", "a", "a"), List("b"), List("c", "c"), List("a"))
  // List(List(a, a, a), List(b), List(c, c), List(a))
  
  def encode[T](xs: List[T]): List[(T, Int)] =
  	pack(xs) map (ys => (ys.head, ys.length));System.out.println("""encode: [T](xs: List[T])List[(T, Int)]""");$skip(18); val res$1 = 
  
  encode(data);System.out.println("""res1: List[(String, Int)] = """ + $show(res$1))}
}
