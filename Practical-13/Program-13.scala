import scala.util.matching.Regex 
object program13 
{	def check() 
 	{	println("Enter any month of the year ")  	  
		var month=scala.io.StdIn.readLine()  	  
		var test=month match 
 	  	{	case "October"=>println("It is Winter")  	   
			case "october"=>println("It is Winter")  	   
			case "November"=>println("It is Winter")  	   
			case "november"=>println("It is Winter")  	   
			case "December"=>println("It is Winter")  	   
			case "december"=>println("It is Winter")  	   
			case "January"=>println("It is Winter")  	   
			case "january"=>println("It is Winter")  	   
			case "February"=>println("It is Winter")  	   
			case "february"=>println("It is Winter")  	   
			case month1=>s"It is $month1,and Winter will come again!" 
 	 	} 
 		println(test) 
 	} 
 	def pattern() 
 	{	var pat1="(C|c)an".r  	 
		var pat2="can".r  	 
		var sentence="Can can could might be should shall can CAnn"  	 
		var a=((pat1 findAllIn sentence).mkString(","))  	 
		var list=a.split(",").toList  	 
		println("Total occurences are "+list.size)  	 
		println("After replacing can with could the sentence becomes ")  	 
		println((pat2 replaceAllIn(sentence,"could"))) 
 	} 
  	def main(args:Array[String]):Unit=
	{	check() 
 		println("-----------------------------")  	
		pattern() 
 	} 
} 
