class companionExample(val name : String) {
  def greet(): Unit = {
    println(s"Hello $name!")
  }
}

object companionExample{
  def apply(name : String) :  companionExample = new companionExample(name)
}

object Main {
  def main(args: Array[String]): Unit = {
    val obj = companionExample("Thrinadh")
    obj.greet()
  }
}
