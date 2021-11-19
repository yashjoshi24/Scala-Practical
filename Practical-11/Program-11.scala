import util.control._ 
object program11 
{ 	def min_max() 
 	{	var a=Set(1,1,2,2,3,3,3,4,5,6,7,8)  	  
		println("Set is "+a)  	  
		println("Maximum element in the set is "+a.max)  	  
		println("Minimum element in the set is "+a.min) 
 	} 
 	def lists_tomap() 
 	{	var list1=List("Militao","Alaba","Nacho")  	 
		var list2=List(3,4,6)  	 
		var map1=list1.zip(list2).toMap  	 
		println("Lists when mapped result in "+map1) 
 	 	println("Converted map to list using keys is "+map1.keySet.toList)  	 
		println("Converted map to list using values is "+map1.values.toList)  
  	} 
 	def iterate() 
 	{	var number=List.range(1,10)  	  
		var i=number.iterator  	  
		println("Values in the list using iterator is ")  	  
		while(i.hasNext) 
 	  	{	print(i.next+" ") 
 	  	} 
 	} 
 	def range() 
 	{	var num=List.range(301,400)  	  
		var count=0  	  
		var obj=new Breaks  	  
		println("The first 20 even numbers are ")  	  
		obj.breakable 
 	  	{	for(i<-num) 
 	   		{	if(i%2==0) 
 	     			{	print(i+" ") 
 	      				count+=1 
 	     			} 
            			if(count==20) 
 	    			{	obj.break 
 	    			} 
 	   		} 
          	} 
 	} 
 	def main(args:Array[String]):Unit=
	{	min_max() 
 	 	println("----------------------------")  	 
		lists_tomap() 
 	 	println("----------------------------")  	 
		iterate() 
 	 	println("----------------------------")  	 
		range() 
 	} 
}
