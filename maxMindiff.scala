object difference {
  def difference(arr: Array[Int]): Int = {
    var min = arr(0)
    var max = arr(0)
    for(i<-1 until arr.length) {
      if(arr(i) < arr(i-1)){
        min = arr(i)
      }
      if(arr(i) > arr(i-1)){
        max = arr(i)
      }
    }
    max-min
  }
  
  def main(args : Array[String]) : Unit = {
    val arr = Array(1,2,3,4)
    println(difference(arr))
  }
}
