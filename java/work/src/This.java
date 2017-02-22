class This
{
	/*参数与成员变量相同时，this不可以省略
	this指第一个成员变量的name非括号里的*/
	String name;

	void talk(String name;){
		System.out.println("My name is "  +  this.name);
	}
}