package week6

object Test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(93); 
  def isPrime(n: Int): Boolean = (2 until n) forall (n % _ != 0);System.out.println("""isPrime: (n: Int)Boolean""");$skip(12); 
  val a = 7;System.out.println("""a  : Int = """ + $show(a ));$skip(14); val res$0 = 
  isPrime(10);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(115); 

  def scalarProduct(xs: List[Double], ys: List[Double]): Double =
    (for ((x, y) <- xs zip ys) yield x * y).sum;System.out.println("""scalarProduct: (xs: List[Double], ys: List[Double])Double""");$skip(52); val res$1 = 

  scalarProduct(List(3,2,7,6,5), List(9,1,3,-6,0));System.out.println("""res1: Double = """ + $show(res$1))}
}
