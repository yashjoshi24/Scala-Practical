object program8 
{ 
 	def compare(a:String,b:String)
	{ 	var n=a.compareTo(b) 
 		if(n>0) 
 		{ 	println(a+" is bigger than "+b) 
 		} 
 		else if(n<0) 
 		{ 	println(b+" is bigger than "+a) 
 		} 
 		else 
 		{ 	println("Both strings are equal") 
 		} 
 	} 
 	 
	def case_change(a:String,b:String)
	{ 	println("After changing to lowercase string 1 is "+a.toLowerCase()+" and  string 2 is "+b.toLowerCase()) 	 
	println("After changing to uppercase string 1 is "+a.toUpperCase()+" and string 2 is "+b.toUpperCase()) 
	} 
	def index(a:String)
	{  	println("Enter the character to be searched")  	
		var temp=scala.io.StdIn.readLine()  	
		println("Enter the sub-string to be searched")  	
		var temp1=scala.io.StdIn.readLine() 
 		var n=a.indexOf(temp)  	
		var n1=a.indexOf(temp1) 
 		if(n<0 && n1<0) 
 		{ 	println("Character as well as sub-string not present") 
 		} 
 		else if(n>=0 && n1<0) 
 		{ 	println("Index of character at "+n+" but sub-string not present") 
 		} 
 		else if(n<0 && n1>=0) 
 		{ 	println("Character not present but Index of sub-string at "+n1) 
 		} 
 		else 
 		{ 	println("Index of character and sub-string is at "+n+","+n1) 
 		} 
	}	 
	def char_arrayTOString(a:String)
	{  	var c=a.toCharArray()  	
		var f:String=""  	
		println("The character array is ")  	
		for(i<-c) 
 		{ 	print("'"+i+"'") 
 			f+=i 
 		} 
 		println() 
 		println("Converted character array to string is "+f) 
	} 

	def main(args:Array[String]):Unit=
	{  	println("Enter any two strings==>")  	
		var c=scala.io.StdIn.readLine() 
	 	var d=scala.io.StdIn.readLine() 
	 	compare(c,d) 
	 	println("**************************************")  	
		case_change(c,d)  	
		println("**************************************")  	
		println("Enter another string") 
	 	var t=scala.io.StdIn.readLine()  	
		index(t) 
	 	println("**************************************")  	
		char_arrayTOString(t)  	
		println("**************************************") 
	} 
} 
