object rationals {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val x = new Rational(1, 3)                      //> x  : Rational = 1/3
  val y = new Rational(5, 7)                      //> y  : Rational = 5/7
  val z = new Rational(3, 2)                      //> z  : Rational = 3/2
  val a = new Rational(3, 2)                      //> a  : Rational = 3/2
  val b = new Rational(4777, 2000000)             //> b  : Rational = 4777/2000000
  val c = new Rational(3089, 5776)                //> c  : Rational = 3089/5776
  
  x - y - z                                       //> res0: Rational = -79/42
  x < y                                           //> res1: Boolean = true
  y max x                                         //> res2: Rational = 5/7
  a - c + b                                       //> res3: Rational = 27510857/50911360
  
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