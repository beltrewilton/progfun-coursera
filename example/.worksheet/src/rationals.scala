object rationals {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(62); 
  println("Welcome to the Scala worksheet");$skip(29); 
  val x = new Rational(1, 3);System.out.println("""x  : Rational = """ + $show(x ));$skip(29); 
  val y = new Rational(5, 7);System.out.println("""y  : Rational = """ + $show(y ));$skip(29); 
  val z = new Rational(3, 2);System.out.println("""z  : Rational = """ + $show(z ));$skip(29); 
  val a = new Rational(3, 2);System.out.println("""a  : Rational = """ + $show(a ));$skip(38); 
  val b = new Rational(4777, 2000000);System.out.println("""b  : Rational = """ + $show(b ));$skip(35); 
  val c = new Rational(3089, 5776);System.out.println("""c  : Rational = """ + $show(c ));$skip(15); val res$0 = 
  
  x - y - z;System.out.println("""res0: Rational = """ + $show(res$0));$skip(8); val res$1 = 
  x < y;System.out.println("""res1: Boolean = """ + $show(res$1));$skip(10); val res$2 = 
  y max x;System.out.println("""res2: Rational = """ + $show(res$2));$skip(12); val res$3 = 
  a - c + b;System.out.println("""res3: Rational = """ + $show(res$3))}
  
//  (((a + b) ^? (c ?^ d)) less ((a ==> b) | c ))
}

class Rational(x: Int, y: Int) {
	require(y != 0, "denominator must be nonzero")

	def this(x: Int) = this(x, 1)

	private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
	
	val numer = x
	val denom = y
	
	def + (that: Rational) =
		new Rational(
			numer * that.denom + that.numer * denom,
			denom * that.denom)
	
	def unary_- = new Rational(-numer, denom)
	
	def - (that: Rational) = this + -that
	
	def < (that: Rational) = numer * that.denom < that.numer * denom
	
	def max(that: Rational) = if (this < that) that else this
	
//	override def toString = numer + "/" + denom
	
	override def toString = {
		val g = gcd(x, y)
		numer/g + "/" + denom/g
	}
}
