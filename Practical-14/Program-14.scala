import java.io.File 
import java.io.PrintWriter 
import scala.io.Source 
trait check[I] 
{	def show(a:I):String 
} 
object program14 
{	var a1:check[List[Int]]=new check[List[Int]] 
 	{	def show(intValue:List[Int]):String=s"Integer List is $intValue" 
 	} 
	var a2:check[List[String]]=new check[List[String]] 
 	{	def show(stringValue:List[String]):String=s"String List entered is   $stringValue" 
 	} 
 	def exception_handling() 
 	{	try
		{	println("Enter the value of denominator ")  	   
			var d=scala.io.StdIn.readInt()  	   
			var res=10/d 
 	   		println("Result is "+res) 
          	} 
 	  	catch
		{	case a: ArithmeticException=> 
 	  		{	println("Arithmetic Exception occured") 
 	  		} 
 	  	} 
 	  	finally 
 	  	{	println("Execution successfull") 
 	  	} 
 	} 
	def file() 
 	{	var obj=new File("input.txt")  	  
		var writer=new PrintWriter(obj)  	  
		println("Enter any number ")  	  
		var n=scala.io.StdIn.readInt()  	  
		while(n!=0) 
  	  	{	var temp=n.toString 
           		writer.write(temp)  	   
			writer.write(",") 
 	   		n-=1 
 	  	} 
 	 	writer.close()  	
		var filename="input.txt"  	
		for (line <- Source.fromFile(filename).getLines) 
        	{	print(line) 
 		} 
 		println() 
 	}   
 	def cart() 
 	{	var cart1=Map("Icecream"->"Vanilla Icecream","Price"->"2.99$","Quantity"->10) 
 	 	var cart2=Map("Biscuits"->"Chocolate biscuits","Price"->"3.99$","Quantity"->3)  	 
		var cart3=Map("Cupcakes"->"Cupcakes","Price"->"4.99$","Quantity"->4)  	 
		println("Enter the item to be searched")  	 
		var cart4=scala.io.StdIn.readLine() 
 	 	cart4 match 
 	 	{	case "Icecream"=>println(cart1)  	  
			case "Biscuits"=>println(cart2)  	  
			case "Cupcakes"=>println(cart3)  	  
			case cart4=>s"$cart4 not present" 
 	 	} 
 	} 
     	def main(args:Array[String]):Unit=
	{	exception_handling()  	
		println("---------------------------")  	
		file() 
 		println("---------------------------")  	
		println(a1.show(List(1,2,3,4,5)))  	
		println(a2.show(List("test","check","123")))  	
		println("----------------------------") 
 		cart() 
	} 
} 
