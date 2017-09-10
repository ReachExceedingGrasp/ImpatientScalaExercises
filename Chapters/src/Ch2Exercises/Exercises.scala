package Ch2Exercises

object Exercises extends App{

  // 4 and 7 incomplete


  //1.

  def signum(input:Int):Int={

    val returnVal = if(input>0) 1 else if(input==0) 0 else -1
    returnVal
  }

  /*
  2.

  The value of a {} block is the value of the last expression.
  A block that has no expressions at the end has no value and has the type Unit.
   */

  //3.


  //4.

  for(i <- 10 to 0 by -1) println(i)

  //5.

  def countdown(n:Int): Unit ={
    for(i <- n to 0 by -1) println(i)
  }

  //6. && 8.

  def product(s: String):Int={
    var returnVal = 1
    for(elem <- s) returnVal *= elem.toInt
    returnVal
  }

  println(product("Hello"))

  //7.


  //9.

  def NLProduct(inputString: String):Int={
    var prod:Int = inputString.head
    if(!inputString.tail.isEmpty)
      {
        prod *= NLProduct(inputString.tail)
      }
    prod
  }

  println(NLProduct("Hello"))

  //10.
  def xnCalc(x:Int, n: Int):Int = {
    if( n%2 == 0 && n > 0 ) { val y = xnCalc(x , n/2); y*y}
    else if (n%2 != 0 && n > 0) {x * xnCalc(x,n-1)}
    else if (n==0) 1
    else 1/xnCalc(x,-n)
  }

}
