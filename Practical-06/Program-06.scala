object Program06
{	def power(a: Int): Unit=
	{	println("Square of "+a+" is "+(a*a))
		println("Cube of "+a+" is "+(a*a*a))
		println("Fourth power of "+a+" is "+(a*a*a*a))
	}
	def prime(b: Int): Unit=
	{	var i=0
		var c=0
		for(i<-1 to b)
		{	if(b%i==0)
			{	c+=1
			}
		}
		if(c==2)
		{	println("Number of factors of "+b+" is "+c)
			println(b+" Is prime!!")
		}
		else
		{	println("Number of factors of "+b+" is "+c)
			println(b+" Isn't prime!!")
		}
	}
	def Student(studentmarks: Int): Unit=
	{	var temp=0
		if(studentmarks>65)
		{	temp=studentmarks+20
			println("Student passed the exam with distinction ")
		}
		println("Final marks are "+temp)
	}	
	def main(args: Array[String]): Unit=
	{	var studentmarks: Int=75
		println("Enter any number ")
		var a=scala.io.StdIn.readInt()
		println("Enter any number ")
		var b=scala.io.StdIn.readInt()
		power(a)
		println("******************************************")
		prime(b)
		println("******************************************")
		Student(studentmarks)
		println("******************************************")
	}
}
