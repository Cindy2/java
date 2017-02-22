class A
{
	/*重载
	构造函数，没有返回值定义，默认的可以不用写*/
	A(){
		System.out.println("我是构造函数");
	}

	void funA(){
		System.out.println("没有参数");
	}
	void funA(int i){
		System.out.println("有参数");
	}
}
