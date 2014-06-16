package week6

object nqueens {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(426); 
  def queens(n: Int): Set[List[Int]] = {
  	def placeQueen(k: Int): Set[List[Int]] = {
  		if (k == 0) Set(List())
  		else
  			for {
  				queens <- placeQueen(k - 1)
  				col <- 0 until n
  				if isSafe(col, queens)
  			} yield col :: queens
  	}
  	def isSafe(col: Int, queens: List[Int]): Boolean = {
  		val row = queens.length
  		// TODO: implement
  		true
  	}
	  placeQueen(n)
  };System.out.println("""queens: (n: Int)Set[List[Int]]""")}
  
  
}
