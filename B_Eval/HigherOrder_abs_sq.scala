object train {
  def simple(arr : Array[Int], f1 : Array[Int] => Array[Int], f2 : Array[Int] => Array[Int]): Array[Int] = {
    f2 (f1(arr))
  }
  
  def abs(arr : Array[Int]): Array[Int] = {
    for(i <- arr.indices){
      if(arr(i) < 0){
        arr(i) = -(arr(i))
      }
    }
    arr
  }
  
  def square(arr : Array[Int]): Array[Int] = {
    for(i <- arr.indices){
      arr(i) *= arr(i)
    }
    arr
  }
  
  def main(args : Array[String]): Unit = {
    print(simple(Array(1,-2,3,-4,5),abs,square).mkString(", "))
  }
}
