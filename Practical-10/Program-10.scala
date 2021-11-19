object program11 
{ 	def input_display() 
 	{	var a=List(1,2,3,4,5)  	   
		var b=List.range(1,20)  	   
		var c=List.tabulate(5)(n => n * n)  	   
		println(a)   	   
		println(b)  	   
		println(c) 
 	} 
 	def check() 
 	{	var a=List.range(1,20,2)  	   
		println(a)  	   
		println(a.head)  	   
		println(a.tail)  	   
		if(a.isEmpty==false) 
 	   	{	println("List isn't empty") 
 	   	}  	   
		else 
 	   	{ 	println("List is empty") 
 	   	} 
 	} 
 	def concat_ways() 
 	{	var a=List("Benzema","Vinicius","Hazard")  	   
		var b=List(9,20,7)  	   
		println(a:::b)  	   
		println(a.:::(b)) 
           	var c=List.concat(a,b)            
		println(c) 
 	} 
 	def un_iform() 
 	{	var a=List.fill(5)(2)  	   
		var b=List.range(2,20,4)  	   
		println(a)  	   
		println(b)  	   
		println(a:::b) 
 	} 
 	def main(args:Array[String]):Unit=
	{  	println("-----------------------------")  	
		check() 
 		println("-----------------------------")  	
		concat_ways()  	
		println("-----------------------------")  	
		un_iform()  	
		println("-----------------------------") 
 	} 
} 
