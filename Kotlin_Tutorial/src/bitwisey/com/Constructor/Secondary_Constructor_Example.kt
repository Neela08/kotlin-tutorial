package bitwisey.com.Constructor

class course{
	constructor(language : String , duration: Int)
	{
		
		println("language: $language, course duration $duration months")
	}
	constructor(language : String , duration: Int, price: Int, enrollment_request: Int)
	{
		val seat_limit=60
		println("language: $language, course duration $duration months, course price $price taka")
		if(enrollment_request<seat_limit){
			println("Seat left "+(seat_limit-enrollment_request))
		}
		else
			{
				println("Double Check Enrollment")
			}
		
	}
}

fun main(args: Array<String>)
{
	//creating objects for secondary constructors
	
	val co1=course("JAVA",4)
	val co2=course("KOTLIN",4,5000,20)
	val co3=course("ANDROID",4,7000,75)
}