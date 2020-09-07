open class developers(salary: Int, employment_status: String) {
    init {
        println("Salary Offered: $salary thousand taka")
        println("Employment Status: $employment_status")
    }
	val working_days=5
	fun office_location()
	{
		
		val name="Dhanmondi"
		val post_code=1209
	
		println("Office Location: $name,$post_code")
	}
	
}

class webDeveloper(salary: Int, employment_status: String): developers(salary, employment_status) {
    
    fun developWeb() {
		println("Working Days $working_days")
        println("Responsibility: Developing Websites")
		
    }
	
}

class softwareDeveloper(salary: Int, employment_status: String): developers(salary, employment_status) {

    fun developSoftware() {
		println("Working Days $working_days")
        println("Responsibility: Developing Softwares")

    }
}

class androidDeveloper(wage: Int, employment_status: String): developers(wage, employment_status) {

    fun developAndroid() {
		println("Working Days $working_days")
        println("Responsibility: Developing Android Applications")
		
    }
}

fun main(args: Array<String>) {
    val w = webDeveloper(25, "Part Time")
    w.developWeb()
	w.office_location()
    println()
	
    val s = softwareDeveloper(30, "Full Time")
    s.developSoftware()
    s.office_location()
    println()
	
    val a = androidDeveloper(35, "Full Time")
    a.developAndroid()
	a.office_location()
}
