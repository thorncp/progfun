package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int =
    if (c == 0 || c == r)
      1
    else
      pascal(c - 1, r - 1) + pascal(c, r - 1)

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def balanceIter(count: Int, chars: List[Char]): Boolean =
      if (count < 0)
        false
      else if (chars.isEmpty && count > 1)
        false
      else if (chars.isEmpty && count == 0)
        true
      else if (chars.head == '(')
        balanceIter(count + 1, chars.tail)
      else if (chars.head == ')')
        balanceIter(count - 1, chars.tail)
      else
        balanceIter(count, chars.tail)

    balanceIter(0, chars)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
