class DogTest
{
	public static void main(String args[]){
		Dog d = new Dog();
		d.name = "Cidny";
		d.age = 1;
		d.color = "black";
		d.jump();
		System.out.println("The Dog Name is "+d.name);
	}
}