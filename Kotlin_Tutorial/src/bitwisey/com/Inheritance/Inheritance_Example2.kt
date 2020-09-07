package bitwisey.com.Inheritance

open class developers(salary: Int, employment_status: String) {
    init {
        println("Salary Offered: $salary thousand taka")
        println("Employment Status: $employment_status")
    }
		
	
}

class webDeveloper(salary: Int, employment_status: String, working_hour: Int): developers(salary, employment_status)
 {
init{
	println("Working Hour : $working_hour")
}
    fun developWeb() {
		
        println("Responsibility: Developing Websites")
    }
}

class softwareDeveloper(salary: Int, employment_status: String,working_hour: Int): developers(salary, employment_status) {
init{
	println("Working Hour : $working_hour")
}
    fun developSoftware() {
        println("Responsibility: Developing Softwares")
    }
}

class androidDeveloper(wage: Int, employment_status: String,working_hour: Int): developers(wage, employment_status) {
init{
	println("Working Hour : $working_hour")
}
    fun developAndroid() {
        println("Responsibility: Developing Android Applications")
    }
}

fun main(args: Array<String>) {
    val w = webDeveloper(25, "Part Time",4)
    w.developWeb()
    println()
	
    val s = softwareDeveloper(30, "Full Time",8)
    s.developSoftware()
    println()
	
    val a = androidDeveloper(35, "Full Time",8)
    a.developAndroid()
	
}
