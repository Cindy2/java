class Student3 extends Person3
{
	int grade;
/*������Ĺ��캯�����У�������ø���Ĺ��캯��super()*/
	Student3(){
		super();
		System.out.println("Student3 ���޲����Ĺ��캯��");
	}
	/*Student3(int grade){
		//����Student3()
		this();
	}*/
	Student3(String name,int age,int grade){
		//this.name = name;
		//this.age = age;
		super(name,age);
		this.grade = grade;
		System.out.println("Person3���в����Ĺ��캯��");
	}
}