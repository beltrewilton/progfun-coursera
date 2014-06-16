import math.abs

object excercise {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(1045); 
  /*
  def sum(f: Int => Int)(a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a + 1, f(a) + acc)
    }
    loop(a, 0)
  }
  sum(x => x)(3, 5)

  def product(f: Int => Int)(a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a + 1, f(a) * acc)
    }
    loop(a, 1)
  }
  product(x => x * x)(3, 4)
  
  def fact(n: Int) = product(x => x)(1, n)
  fact(5)
  */
  /*
  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int = {
  	def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a + 1, combine(f(a), acc))
    }
    loop(a, zero)
  }
  def product(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x, y) => x * y, 1)(a, b)
  product(x => x * x)(3, 4)
  
  def sum(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x, y) => x + y, 0)(a, b)
  sum(x => x)(3, 5)
  
  def fact(n: Int) = product(x => x)(1, n)
  fact(5)
  
  */
  val tolerance = 0.0001;System.out.println("""tolerance  : Double = """ + $show(tolerance ));$skip(80); 
  def isCloseEnough(x: Double, y: Double) =
  	abs((x - y) / x) / x < tolerance;System.out.println("""isCloseEnough: (x: Double, y: Double)Boolean""");$skip(255); 
  def fixedPoint(f: Double => Double)(firstGuess: Double) = {
  	def iterate(guess: Double): Double = {
  		println("guess = " + guess)
  		val next = f(guess)
  		if(isCloseEnough(guess, next)) next
  		else iterate(next)
  	}
  	iterate(firstGuess)
  };System.out.println("""fixedPoint: (f: Double => Double)(firstGuess: Double)Double""");$skip(32); val res$0 = 
  fixedPoint(x => 1 + x/2)(1.0);System.out.println("""res0: Double = """ + $show(res$0));$skip(67); 
 	def averageDamp(f: Double => Double)(x: Double) = (x + f(x)) / 2;System.out.println("""averageDamp: (f: Double => Double)(x: Double)Double""");$skip(71); 
  
  def sqrt(x: Double) =
  	fixedPoint(averageDamp(y => x / y))(1.0);System.out.println("""sqrt: (x: Double)Double""");$skip(14); val res$1 = 
  
  sqrt(16);System.out.println("""res1: Double = """ + $show(res$1))}


}
