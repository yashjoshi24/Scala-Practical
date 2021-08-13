class Calculator 
{	def +(a: Int, b: Int): Int = a+b
  	def -(a: Int, b: Int): Int = a-b
  	def *(a: Int, b: Int): Long = a*b
  	def /(a: Int, b: Int): Int = 
  	{	require(b != 0)    
    		a/b
  	}
}
object Calculator
{	def main(args: Array[String]) =
  	{	val calc = new Calculator()
   		println("Addition: " + calc.+(10, 5))
    		println("Subtraction: " + calc.-(10, 5))
    		println("Multiplication: " + calc.*(10, 5))
    		println("Division: " + calc./(10, 5))
	}
}
