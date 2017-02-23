class Person3
{
	/*成员变量，可以作为继承对象*/
	String name;
	int age;
	Person3(){
		System.out.println("Person3的无参数的构造函数");
	}
	Person3(String name,int age){
		this.name = name;
		this.age = age;
		System.out.println("Person3的有参数的构造函数");
	}
	/*成员函数，可以作为继承对象*/
	void eat(){
		System.out.println("Eating");
	}
}