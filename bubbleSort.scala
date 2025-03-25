object bubbleSort {
  def bubbleSort(arr : Array[Int]): Array[Int] = {
    val n = arr.length
    for(i<- 0 until n-1) {
      for(j<-0 until n-i-1) {
        if(arr(j) > arr(j+1)) {
          val temp = arr(j)
          arr(j) = arr(j+1)
          arr(j+1) = temp
        }
      }
    }
    arr
  }
  def main(args: Array[String]):Unit = {
    val arr = Array(62,34,12,67,52,2,89,16)
    println("Sorted arrays: "+ bubbleSort(arr).mkString(", "))
  }
}
