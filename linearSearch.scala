object linearSearch {
  def linearSearch(arr: Array[Int], key : Int): Int = {
    for(i<- 0 until arr.length) {
      if (arr(i) == key) return i+1
    }
    -1
  }
  
  def main(args: Array[String]): Unit = {
    val arr = Array(1,2,3,4)
    println("Index is: "+linearSearch(arr,3))
  }
}
