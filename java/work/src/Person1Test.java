class Person1Test
{
	public static void main(String args[]){
		/*Person1 person  = new Person1();
		person.i = 10;*/

		Person1 person1  = new Person1();
		Person1 person2  = new Person1();

		Person1.i = 10;
		System.out.println("person1的i的值为"+ person1.i);
		System.out.println("person1的i的值为"+ person2.i);
		//Person1.i = 20;
		person2.i = 20;
		System.out.println("person1的i的值为"+ person1.i);
		System.out.println("person1的i的值为"+ person2.i);

		Person1.i = 11;
		Person1.talk();
	}
}