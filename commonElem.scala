object common{
  def common(arr1:Array[Int],arr2:Array[Int]):Array[Int] = {
    var result = Array[Int]()
    for (i<-0 until arr1.length) {
      for(j<-0 until arr2.length) {
        if(arr1(i) == arr2(j)){
          result :+= arr1(i)
        }
      }
    }
    result
  }
  
  def main(args: Array[String]): Unit = {
    val arr1 = Array(1,2,3,4)
    val arr2 = Array(2,3,4,5)
    println(common(arr1,arr2).mkString(", "))
  }
}
