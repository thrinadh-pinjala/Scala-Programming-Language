object quickSort {
  def quickSort(arr: Array[Int]): Array[Int] = {
    if (arr.length <= 1) return arr
    
    val pivot = arr(arr.length/2)
    val left = arr.filter(_ < pivot)
    val middle = arr.filter(_ == pivot)
    val right = arr.filter(_ > pivot)
      
    quickSort(left) ++ middle ++ quickSort(right)
    
  }
  
  def main(args: Array[String]): Unit = {
    val arr = Array(4,3,2,1)
    println("Sorted array: "+quickSort(arr).mkString(", "))
  }
  
}
