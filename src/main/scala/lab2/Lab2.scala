package lab2

object Lab2 {
  /**
   * Тип множини представлений за його характерною функцією, тобто чи даний елемент є в множині
   */
  type Set = Int => Boolean

  /**
   * Вказує, чи містить набір заданий елемент.
   */
  def contains(s: Set, elem: Int): Boolean = s(elem)

  /**
   *
   * Створює множину з одного заданого елемента.
   */
  def singletonSet(elem: Int): Set = ???

  /**
   * Повертає об'єднання двох заданих множин,
   * множину всіх елементів, що знаходяться або в 's' або 't'.
   */
  def union(s: Set, t: Set): Set = ???

  /**
   * Повертає перетин двох заданих множин,
   * множину всіх елементів, що знаходяться як у 's', так і у 't'.
   */
  def intersect(s: Set, t: Set): Set = ???

  /**
   * Повертає різницю двох заданих множин,
   * множину усіх елементів 's', які не знаходяться в 't'.
   */
  def diff(s: Set, t: Set): Set = ???

  /**
   * Повертає підмножину 's', яка задовольняє предикат 'p'.
   */
  def filter(s: Set, p: Int => Boolean): Set = ???

  /**
   * обмежує значення "forall" і "exist" до +/- 1000.
   */
  val bound = 1000

  /**
   * Перевіряє чи всі цілі числа в межах 's' задовольняють 'p'.
   */
  def forall(s: Set, p: Int => Boolean): Boolean = {
    def iter(a: Int): Boolean = {
      if (???) ???
      else if (???) ???
      else iter(???)
    }

    iter(???)
  }

  /**
   * Перевіряє чи існує хоча би одне ціле число в множині 's'
   * для якого виконується 'p'.
   */
  def exists(s: Set, p: Int => Boolean): Boolean = ???

  /**
   * Повертає перетворений набір, застосовуючи 'f' до кожного елемента 's'.
   */
  def map(s: Set, f: Int => Int): Set = ???

  /**
   * Відображає вміст набору.
   */
  def makeString(s: Set): String = {
    (-bound to bound)
      .filter(contains(s, _))
      .mkString("{", ", ", "}")
  }

  /**
   * Друкує вміст набору в консоль.
   */
  def printSet(s: Set): Unit = {
    println(makeString(s))
  }

  // Тут можна побавитись з функціями
  def main(args: Array[String]): Unit = {
    println(contains(singletonSet(1), 1))

    printSet(union(singletonSet(1), singletonSet(2)))
  }
}
