
class Student extends Person
{
	String address;
	void introduce(){
		System.out.println("My name is "+ name +",My age is "+ age);
		System.out.println("My address is " + address);
	}
}