package bitwisey.com.Constructor

class login(var username: String="XYZ7", var password: Int=333)
{
	var user: String
	var pass: Int
	init{
		if(username=="admin")
			{
				user="root"
				pass=555
			}
		else {
			user="Invalid"
			pass=password
		}
			println("Username is $user password is $pass")
	}


}

fun main(args: Array<String>)
{
	
	//Testing with init block
	
	val log1=login("admin",456)
    val log2=login("neela")
	val log3=login()
	

}