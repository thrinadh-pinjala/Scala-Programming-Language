object Singleton{
  def show(): Unit = {
    println("Hello message")
  }
}
  
  
object Main{
  def main(args: Array[String]): Unit = {
    Singleton.show()
  }
  
}
