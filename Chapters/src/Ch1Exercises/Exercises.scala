package Ch1Exercises

object Exercises {

  /*
  1.

  The following methods can be applied on 3 in REPL

  !=   <     abs            equals       isInstanceOf    isWhole     shortValue       toFloat         unary_-
  ##   <<    asInstanceOf   floatValue   isNaN           longValue   signum           toHexString     unary_~
  %    <=    byteValue      floor        isNegInfinity   max         synchronized     toInt           underlying
  &    ==    ceil           formatted    isPosInfinity   min         to               toLong          until
  *    >     compare        getClass     isValidByte     ne          toBinaryString   toOctalString   wait
  +    >=    compareTo      hashCode     isValidChar     notify      toByte           toRadians       |
  -    >>    doubleValue    intValue     isValidInt      notifyAll   toChar           toShort         ?
  ->   >>>   ensuring       isInfinite   isValidLong     round       toDegrees        toString
  /    ^     eq             isInfinity   isValidShort    self        toDouble         unary_+


  2.

  scala> import scala.math.sqrt
  import scala.math.sqrt

  scala> sqrt(3)
  res1: Double = 1.7320508075688772

  scala> res1*res1
  res2: Double = 2.9999999999999996

  scala> 3-res2
  res3: Double = 4.440892098500626E-16

  3.

  scala> res2=3
  <console>:13: error: reassignment to val
         res2=3
             ^
  Since res2 cannot be assigned a new value, res2 is a val.

  4.

  scala> "crazy"*3
  res4: String = crazycrazycrazy

  5.

  The max method finds the greater value between the two values.
  It can also be invoked using the syntax 10.max(2)

  scala> 10 max 2
  res5: Int = 10

  scala> 5 max 6
  res6: Int = 6

  scala> 10.max(2)
  res7: Int = 10

  6.

  scala> BigInt(2).pow(1024)
  res11: scala.math.BigInt = 179769313486231590772930519078902473361797697894230657273430081157732675805500963132708477322407536021120113879871393357658789768814416622492847430639474124377767893424865485276302219601246094119453082952085005768838150682342462881473913110540827237163350510684586298239947245938479716304835356329624224137216

  7.

  We need to use

  import scala.BigInt.probablePrime
  import scala.util.Random

  8.

  scala> probablePrime(100,Random).toString(36)
  res17: String = 2qg0b202onxus2vqesqn

  9.

  scala> val str = "HeadtoTail"
  str: String = "HeadtoTail"

  To find the first letter of the string
  scala> str.head
  res28: Char = H

  scala> str(0)
  res29: Char = H

  To find the last letter of the string
  scala> str.last
  res30: Char = l

  scala> str(str.length-1)
  res31: Char = l

  10.

  scala> str.take(5)
  res34: String = Headt

  scala> str.takeRight(5)
  res35: String = oTail

  scala> str.dropRight(5)
  res36: String = Headt

  scala> str.drop(5)
  res37: String = oTail

  Advantage: Shorthand for trimming down a string

  Disadvantage: cannot get a substring from the middle of the string as atleast one end is always fixed.

   */
}