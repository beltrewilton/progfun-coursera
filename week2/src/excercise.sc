import math.abs

object excercise {
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
  val tolerance = 0.0001                          //> tolerance  : Double = 1.0E-4
  def isCloseEnough(x: Double, y: Double) =
  	abs((x - y) / x) / x < tolerance          //> isCloseEnough: (x: Double, y: Double)Boolean
  def fixedPoint(f: Double => Double)(firstGuess: Double) = {
  	def iterate(guess: Double): Double = {
  		println("guess = " + guess)
  		val next = f(guess)
  		if(isCloseEnough(guess, next)) next
  		else iterate(next)
  	}
  	iterate(firstGuess)
  }                                               //> fixedPoint: (f: Double => Double)(firstGuess: Double)Double
  fixedPoint(x => 1 + x/2)(1.0)                   //> guess = 1.0
                                                  //| guess = 1.5
                                                  //| guess = 1.75
                                                  //| guess = 1.875
                                                  //| guess = 1.9375
                                                  //| guess = 1.96875
                                                  //| guess = 1.984375
                                                  //| guess = 1.9921875
                                                  //| guess = 1.99609375
                                                  //| guess = 1.998046875
                                                  //| guess = 1.9990234375
                                                  //| guess = 1.99951171875
                                                  //| res0: Double = 1.999755859375
 	def averageDamp(f: Double => Double)(x: Double) = (x + f(x)) / 2
                                                  //> averageDamp: (f: Double => Double)(x: Double)Double
  
  def sqrt(x: Double) =
  	fixedPoint(averageDamp(y => x / y))(1.0)  //> sqrt: (x: Double)Double
  
  sqrt(16)                                        //> guess = 1.0
                                                  //| guess = 8.5
                                                  //| guess = 5.1911764705882355
                                                  //| guess = 4.136664722546242
                                                  //| guess = 4.002257524798522
                                                  //| guess = 4.000000636692939
                                                  //| res1: Double = 4.000000000000051


}