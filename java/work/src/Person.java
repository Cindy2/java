class Person
{
	/*String name;
	int ages;
	person(){
	}
	Person(String n,int a){
		name = n;
		ages = a;
		
	}*/
	/*this���ñ����ǹ��캯���ĵ�һ�����*/

	String name;
	int age;
	String address;
	Person(){
		System.out.println("no");
	}
	Person(String name,int age){
		this.name = name;
		this.age = age;
		System.out.println("two");
	}
	Person(String name,int age,String address){
		this();
		this.address = address;
		System.out.println("three");
	}
	
}