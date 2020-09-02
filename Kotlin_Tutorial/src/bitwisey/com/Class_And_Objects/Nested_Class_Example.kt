package bitwisey.com.Class_And_Objects
class OuterClass{
	class NestedClass{
		fun method_of_nested_class()
		{
			println("This is a member function of the nested class")
		}
	}
	
}
fun main(args: Array<String>)
{
    val obj=OuterClass.NestedClass()//creating the object of nested class
	obj.method_of_nested_class()//Since Nested class is a member of Outer class, we can use . notation to access Nested class and its members.	
}

