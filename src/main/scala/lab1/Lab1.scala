package lab1

object Lab1 {
	/**
	 * Трикутник Паскаля
	 */
	def pascal(col: Int, row: Int): Int = {
		if (col == 0 || col == row) 1
		else pascal(col - 1, row - 1) + pascal(col, row - 1)
	}

	/**
	 * Балансування дужок
	 */
	def balance(chars: List[Char]): Boolean = {
		def step(chars: List[Char], opened: Int): Boolean = {
			if (opened < 0 || chars.isEmpty)
				if (opened == 0) true
				else false
			else
				if (chars.head.equals('('))			step(chars.tail, opened + 1)
				else if (chars.head.equals(')'))	step(chars.tail, opened - 1)
				else								step(chars.tail, opened)
		}
		step(chars, 0)
	}

	/**
	 * Підрахунок решти
	 */
	def countChange(money: Int, coins: List[Int]): Int = {
		if(money == 0) 1
		else if(money < 0 || coins.isEmpty) 0
		else countChange(money - coins.head, coins) + countChange(money, coins.tail)
	}
}
