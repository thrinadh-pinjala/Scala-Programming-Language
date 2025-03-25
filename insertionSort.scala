object insertionSort {
  def insertionSort(arr : Array[Int]):Array[Int] = {
    for(i<-1 until arr.length){
      val key = arr(i)
      var j = i -1
      while(j>=0 && arr(j)>key){
        arr(j+1) = arr(j)
        j -= 1
      }
      arr(j+1) = key
    }
    arr
  }
  
  def main(args : Array[String]): Unit = {
    val arr = Array(12,1,35,23)
    println("Sorted Array: "+insertionSort(arr).mkString(", "))
  }
}

