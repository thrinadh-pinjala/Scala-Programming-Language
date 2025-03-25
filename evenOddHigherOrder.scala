object evenOdd{
  def evenOdd(arr :  Array[Int], func : Int => Boolean): Array[Int] = {
    arr.filter(func)
  }
  def isEven(x:Int): Boolean = x%2==0
  def isOdd(x:Int): Boolean = x%2!=0
  
  def main(args: Array[String]): Unit = {
    val arr= Array(1,2,3,4)
    println(evenOdd(arr,isEven).mkString(", "))
    println(evenOdd(arr,isOdd).mkString(", "))
  }
}
