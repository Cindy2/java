//���ǣ���д��Override
//1.�ھ��и��ӹ�ϵ����������
//2.������������һ�������������������Ķ��壨����ֵ���͡��������Ͳ����б���ȫ��ͬ
class Student extends Person
{
	String address;
	void introduce(){
		System.out.println("My name is "+ name +",My age is "+ age);
		System.out.println("My address is " + address);
	}
}