package bitwisey.com.Class_And_Objects
class vehicle{
	 val company_name="The X company" //val is immutable means unchangeable , we can only read it
	fun car()
	
	{
		var color:String="Red"//var is mutable //specifying the variable type as String
		println("This is a car, color is $color, company name is $company_name")
	}
	fun truck(): String  //A member function having a String return type
	{
		var color="Blue" //No variable type is specified but no worries, compiler will understand its a string type by looking at the assigned value
		var model_number=10
		return "This is a truck, color is "+color+", company name is "+company_name+", Model number $model_number"
	}
	private fun bus()
    {
	println("This is bus")
    }
}
fun main(args: Array<String>)
{
	
	val vehicleInfo=vehicle() //An object reference vehicleInfo is created
	println(vehicleInfo.company_name)//accessing data member using this object reference
	vehicleInfo.car()  //car() member function is called using this object reference 
	
	val putInfo=vehicleInfo.truck() //Since truck() has String as return type, we have to put the return value in a variable first
	println(putInfo)
	println("${vehicleInfo.truck()}")//Or we can also directly show the truck() member function like this without using any extra variable
	
	// vehicleInfo.bus() it cannot be accessed since bus is a private member function
	
   
}

