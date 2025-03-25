object arraySum {
  def arraySum(arr : Array[Int], n : Int): Int = {
    if (n==0) {
      0
    }
    else{
      arr(n-1) + arraySum(arr,n-1)
    }
  }
  def main(args: Array[String]): Unit = {
    val arr = Array(1,2,3,4)
    println("Sum of all elements in the array is : "+arraySum(arr,arr.length))
  }
}
