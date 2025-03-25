object mergeSort{
  def mergeSort(arr : Array[Int]): Array[Int] = {
    if (arr.length <= 1) {
      arr
    }
    else{
      val mid = arr.length/2
      val left = mergeSort(arr.slice(0,mid))
      val right = mergeSort(arr.slice(mid, arr.length))
      merge(left,right)
    }
  }
  
  def merge(left: Array[Int], right: Array[Int]): Array[Int] = {
    var i, j = 0
    var result = Array[Int]()
    while(i<left.length && j<right.length) {
      if(left(i) < right(j)) {
        result :+= left(i)
        i += 1
      }
      else{
        result :+= right(j)
        j += 1
      }
    }
    result ++ left.drop(i) ++ right.drop(j)
  }
  
  def main(args: Array[String]): Unit = {
    val arr = Array(9,8,7,6)
    println("Sorted array: "+mergeSort(arr).mkString(", "))
  }
}
