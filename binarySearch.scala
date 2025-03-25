object bianrySearch{
  def binarySearch(arr: Array[Int],left: Int,right : Int, key : Int): Int = {
    if (left > right) return -1
    var mid = left + (right-left) /2
    if(arr(mid) == key) return mid+1
    if(arr(mid) > key) return binarySearch(arr,left,mid-1,key)
    binarySearch(arr,mid+1,right,key)
  }
  
  def main(arr: Array[String]): Unit = {
    val arr = Array(1,2,3,4)
    println("Index: "+binarySearch(arr,0,arr.length,5))
  }
}
