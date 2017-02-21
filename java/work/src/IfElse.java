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
			System.out.println("i为负数");
			}
			/*第一句判断成功，下面的不执行*/
			else if(i++ > 0)
		{
			System.out.println("i为正数");
		}else{
			System.out.println("i为0");
		}
		System.out.println(i);
	}
}
