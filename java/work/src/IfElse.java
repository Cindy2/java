public class IfElse
{
	public static void main (String args[]){
		int i = 10;
		if (i<10)
		{
			System.out.println("i<10");}
	
		else{
			System.out.println(i=10);
		}

		int j = -1;
		if (j < 0){
			System.out.println("iΪ����");
			}
			/*��һ���жϳɹ�������Ĳ�ִ��*/
			else if(i++ > 0)
		{
			System.out.println("iΪ����");
		}else{
			System.out.println("iΪ0");
		}
		System.out.println(i);
	}
}
