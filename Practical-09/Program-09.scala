object test 
{ 	def input() 
 	{ 	var a:Array[String] = new Array[String](3)  	
		println("Enter the array elements ")  	
		for(i<-0 to 2) 
 		{	a(i)=scala.io.StdIn.readLine() 
 		} 
 		var z = new Array[String](3) 
 		z(0) = "Zara"; 
		z(1) = "Nuha"; 
		z(4/2) = "Ayan"  
		var k = Array("Zara", "Nuha", "Ayan")  
		println("Value(a)  Value(z)  Value(k)")  
		for(i<-0 to 2) 
 		{	print("   "+a(i)+"      "+z(i)+"      "+k(i))  
			println() 
 		} 
 		println("Size of each array is "+a.size) 
 	} 
 	def sort() 
 	{ 	println("Enter the size of the array ")  	
		var n=scala.io.StdIn.readInt()  	
		var a=new Array[Int](n)  	
		println("Enter the array elements..")  	
		for(i<-0 until a.size) 
 		{ 	 a(i)=scala.io.StdIn.readInt() 
 		} 
 		for(i<-0 until a.size) 
 		{	var temp=0 
 	  		for(j<-0 until a.size) 
 	  		{	if(a(j)>=a(i)) 
 	    			{	temp=a(j)  	      
					a(j)=a(i) 
              				a(i)=temp 
            			} 
 	  		} 
 		} 
 		println("Array after sorting is ")  	
		for(i<-0 to n-1) 
 		{	print(a(i)+" ") 
 		} 
 	} 
 	def main(args:Array[String]):Unit=
	{  	input()
	  	sort() 
 	} 
} 
import Array.ofDim; 
object program9 
{	def matrix1() 
 	{ 	var arr=ofDim[Int](3,3)  	
		for(i<-0 to 2) 
 		{ 	println("Enter row"+(i+1)+" elements ") 
 	 		for(j<-0 to 2) 
 	 		{ 	arr(i)(j)=scala.io.StdIn.readInt() 
 	 		} 
 		} 
 		for(i<-0 to 2) 
 		{ 	for(j<-0 to 2) 
 	 		{ 	print(arr(i)(j)+" ") 
 	 		}  	
			println() 
 		} 
 		println("Matrix in reverse is....")  	
		for(i<-(0 to 2).reverse) 
 		{ 	for(j<-(0 to 2).reverse) 
 	 		{ 	print(arr(i)(j)+" ") 
 	 		}  	
			println() 
 		} 
 	} 
 	def matrix2() 
 	{ 	var arr=ofDim[Int](3,3)  	
		for(i<-0 to 2) 
 		{	println("Enter row"+(i+1)+" elements ") 
	 		for(j<-0 to 2) 
 	 		{ 	arr(i)(j)=scala.io.StdIn.readInt() 
 	 		} 
 		} 
 		println("Converted matrix by arr(i)(N)/3 is==>")  	
		for(i<-0 to 2) 
 		{	for(j<-0 to 2) 
 	    		{	print(arr(i)(2)/3+" ") 
 	    		} 
        		println() 
 		} 
 		println("Converted matrix by index is==>")  	
		for(i<-0 to 2) 
 		{	for(j<-0 to 2) 
 	    		{	print((i+1)+" ") 
 	    		} 
        		println() 
 		}  	
	}  
 	def pattern() 
 	{ 	for(i<-0 to 3) 
 		{ 	for(j<-0 to i) 
 	 		{ 	print("*") 
 	 		}  	
			println() 
 		} 
 		println("----------------------------")         
		var index3=1;
		var target=4  	
		for(i<-1 to 4) 
 		{ 	for(j<-1 to index3) 
	 		{	print(" ") 
 	 		} 
 	 		for(k<-1 to target) 
 	 		{	print("*") 
 	 		} 
 			index3+=1  	
			target-=1  	
			println() 
 		} 
 	} 
 	def populate() 
 	{	var temp=List.range(1,20,3)  	  
		println(temp) 
 	}  
 	def merge() 
 	{	var list1=List.range(1,20,3)  	  
		var list2=List.range(1,20,2)  	  
		var list3=List.concat(list1,list2)  	  
		println(list1)  	  
		println(list2)  	  
		println(list3) 
 	} 
 	def main(args:Array[String]):Unit=
	{  	matrix1()  	
		println("-----------------------------")  	
		matrix2()  	
		println("-----------------------------")  	
		pattern()  	
		println("-----------------------------")  	
		populate()  	
		println("-----------------------------")  	
		merge() 
 	} 
}
