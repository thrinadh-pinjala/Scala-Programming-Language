object stringRotation{
  def stringRotation(s1: String, s2: String): Boolean = {
    if(s1.length != s2.length) return false
    val concat = s1 + s1
    concat.contains(s2)
  }
  
  def main(args: Array[String]): Unit = {
    val s1 = "ABACD"
    val s2 = "CDABA"
    println(stringRotation(s1,s2))
  }
}
