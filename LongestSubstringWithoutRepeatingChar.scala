object LongestSubstringWithoutRepeatingChar{
  def lengthLongest(s: String): Int = {
    var longest = 0
    var start = 0
    val lastSeen = scala.collection.mutable.Map[Char, Int]()
    for(i <- s.indices){
      val ch = s(i)
      if(lastSeen.contains(ch) && lastSeen(ch) >= start){
        start = lastSeen(ch) +1
      }
      lastSeen(ch) = i
      longest = math.max(longest , i - start + 1)
      
    }
    longest
  }
  
  def main(args: Array[String]): Unit = {
    print(lengthLongest("abcabcbb"))
  }
}
