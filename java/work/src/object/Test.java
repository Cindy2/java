//一个引用能够调用哪些成员（变量和函数），取决于这个引用的类型
class Test 
{
	public static void main(String[] args) 
	{
		/*Student s = new Student();
		s.name = "Cindy";
		s.age = 12;
		s.address = "zhongshan";
		s.introduce();
		
		Person p = new Person();
		p.name = "Candy";
		p.age = 13;
		p.introduce();*/
		Student s = new Student();
		Person p = s;

		p.name = "Candy";
		p.age = 13;
		//p.address = "zhongshan";

	}
}
