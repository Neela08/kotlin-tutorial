package bitwisey.com.Constructor
class multiply constructor(var i: Int,var j:Int)//primary constructor
{
 var mul=i*j
}

class Information(var name: String, var id: Int)//primary constructor
{
// empty class
}

fun main(args: Array<String>)
{
	//creating objects for classes with primary constructors
	
	val obj1=Information("Neela",123)
	println("Name is "+obj1.name)
	println("ID is "+obj1.id)
	val obj2=multiply(5,5)
	println("i= ${obj2.i} j=${obj2.j} multiplication result ${obj2.mul}")
}

