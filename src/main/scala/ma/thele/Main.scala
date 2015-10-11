package ma.thele

/**
 * @author Evgeniy Muravev
 */
object Main extends App {
  {
    val orders = OrderParser.fromInputStream(this.getClass.getClassLoader.getResourceAsStream("00.txt"))
    println(s"${MinAverageTimeCalculator(orders)}")
  }
}
