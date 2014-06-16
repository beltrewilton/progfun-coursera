package week6

object Test {
  def isPrime(n: Int): Boolean = (2 until n) forall (n % _ != 0)
                                                  //> isPrime: (n: Int)Boolean
  val a = 7                                       //> a  : Int = 7
  isPrime(10)                                     //> res0: Boolean = false

  def scalarProduct(xs: List[Double], ys: List[Double]): Double =
    (for ((x, y) <- xs zip ys) yield x * y).sum   //> scalarProduct: (xs: List[Double], ys: List[Double])Double

  scalarProduct(List(3,2,7,6,5), List(9,1,3,-6,0))//> res1: Double = 14.0
}