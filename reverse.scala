object reverse{
  def reverse(arr : Array[Int]): Array[Int] = {
    var left = 0
    var right = arr.length -1
    for(i<-0 until (arr.length)/2){
      var temp = arr(left)
      arr(left) = arr(right)
      arr(right) = temp
      left += 1
      right -= 1
      
    }
    arr
  }
  
  def main(args: Array[String]): Unit = {
    val arr = Array(1,2,3,4)
    println(reverse(arr).mkString(", "))
  }
}
