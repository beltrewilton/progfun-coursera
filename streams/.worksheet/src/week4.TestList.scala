package week4

object TestList {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(190); 
	def nth[T](n: Int, xs: List[T]): T = {
    if (xs.isEmpty) throw new IndexOutOfBoundsException
    else if (n == 0) xs.head
    else nth(n - 1, xs.tail)
  };System.out.println("""nth: [T](n: Int, xs: week4.List[T])T""");$skip(70); 
	val list: List[Int] = new Cons(4, new Cons(6, new Cons(2, new Nil)));System.out.println("""list  : week4.List[Int] = """ + $show(list ));$skip(14); val res$0 = 
	nth(1, list);System.out.println("""res0: Int = """ + $show(res$0))}
}
