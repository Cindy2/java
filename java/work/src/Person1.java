class Person1
{
	/*静态可以直接调用，无需成员.*/
	static{
		System.out.println("静态");
	}
	 static int i;
	 static void talk(){
		System.out.println("my age is  "+i);
	 }
}