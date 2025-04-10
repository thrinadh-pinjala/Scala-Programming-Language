object train{
  def main(args: Array[String]): Unit = {
    val a = Array(Array(3,2), Array(1,3))
    val b = Array(Array(4,5), Array(2,1))
    
    val result = Array.ofDim[Int](2,2)
    for(i <- 0 until 2; j<-0 until 2){
      result(i)(j) = a(i)(j) + b(i)(j)
    }
    
    for(i<- 0 until 2){
      for(j<- 0 until 2){
        print(result(i)(j) + " ")
      }
      println()
    }
    
  }
}
