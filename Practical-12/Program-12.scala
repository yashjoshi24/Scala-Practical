trait q12 
{	def show() 
}  	
class traitq12 extends q12 
{   	def show() 
  	{	println("Inside sub-class") 
  	}   
	def printAll(StringsAll:String*) 
  	{	StringsAll.map(println) 
  	} 
} 
object program12 
{	def main(args:Array[String]):Unit=
	{  	var obj=new traitq12  	
		obj.show() 
 		obj.printAll("text 1","text 2","Example of var args inside trait class")  	
		println("Enter any number ")  	
		var n=scala.io.StdIn.readInt() 
 		if(square.isDefinedAt(n)==false) 
 		{	println("Number is negative ") 
 		} 
 		else 
 		{	println("Square of "+n+" is "+square(n)) 
 		} 
 	} 
 	var square=new PartialFunction[Int,Int] 
 	{	def isDefinedAt(x:Int)=x>=0  	  
		def apply(x:Int)=x*x 
 	} 
}
