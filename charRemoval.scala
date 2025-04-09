object charRemoval{
  def removal(s: String, pos: Int): String = {
    var str: String = ""
    for(i<- s.indices){
      if(i != pos){
        str=str + s(i)
      }
    }
    str
  }
  
  def main(args: Array[String]): Unit = {
    print(removal("abcd",2))
  }
}
