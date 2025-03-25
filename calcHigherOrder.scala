object calucaltor{
  def operate(x: Int, y:Int, func : (Int,Int)=>Int): Int = {
    func(x,y)
  }
  
  def add(x:Int, y:Int): Int = x+y
  def subtract(x:Int, y:Int): Int = x -y
  def multiply(x:Int, y:Int): Int = x*y
  def divide(x:Int, y:Int): Int = x/y
  
  def main(args: Array[String]): Unit = {
    println("Answer is: "+operate(10,5,add))
    println("Answer is: "+operate(10,5,subtract))
    println("Answer is: "+operate(10,5,multiply))
    println("Answer is: "+operate(10,5,divide))
  }
}
