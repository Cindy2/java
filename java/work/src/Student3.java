class Student3 extends Person3
{
	int grade;
/*在子类的构造函数当中，必须调用父类的构造函数super()*/
	Student3(){
		super();
		System.out.println("Student3 的无参数的构造函数");
	}
	/*Student3(int grade){
		//调用Student3()
		this();
	}*/
	Student3(String name,int age,int grade){
		//this.name = name;
		//this.age = age;
		super(name,age);
		this.grade = grade;
		System.out.println("Person3的有参数的构造函数");
	}
}