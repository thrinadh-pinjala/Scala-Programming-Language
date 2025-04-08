object WildCard {
  def matching(value: String): Unit = value match {
    case "January" | "March" | "May" | "July" | "August" | "October" | "December" =>
      println(s"$value has 31 days.")
    case "February" =>
      println(s"$value has 28 or 29 days.")
    case "April" | "June" | "September" | "November" =>
      println(s"$value has 30 days.")
    case _ =>
      println("Invalid month name!")
  }

  def main(args: Array[String]): Unit = {
    matching("January") // Test with January
    matching("February") // Test with February
    matching("April") // Test with April
    matching("abc") // Test with invalid input
  }
}
