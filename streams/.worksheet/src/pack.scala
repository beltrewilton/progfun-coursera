object pack {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(61); val res$0 = 
  pack(List("a", "a", "a", "b", "c", "c", "a"));System.out.println("""res0: List[List[String]] = """ + $show(res$0));$skip(211); 
  // List(List("a", "a", "a"), List("b"), List("c", "c"), List("a"))
  
  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil => Nil
    case x :: xs1 => xs.takeWhile(y => x == y) :: pack(xs1)
  };System.out.println("""pack: [T](xs: List[T])List[List[T]]""")}
}
