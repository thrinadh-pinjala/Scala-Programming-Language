object charRemoval{
  def removal(s: String, ch: Char): String = {
    s.filter(_ != ch)
  }
  
  def main(args: Array[String]): Unit = {
    print(removal("abcd",'b'))
  }
}
