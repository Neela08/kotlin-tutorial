package bitwisey.com.Constructor
class movies(var name: String="The Dark Knight", var rating:Int=9 )//setting default values to constructor
{
	//empty class
}

fun main(args: Array<String>)
{
    //Testing with default values

	val mov1=movies("Pacific Rim",8) 
	println("Movie name ${mov1.name}, Rating ${mov1.rating}")
	
	val mov2=movies("Real Steel")
 	println("Movie name ${mov2.name}, Rating ${mov2.rating}")
	
	val mov3=movies()
	println("Movie name ${mov3.name}, Rating ${mov3.rating}")
}
