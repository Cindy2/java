/**
	*打印出所有100-200之间的素数
	2/n，
	*/
public class ForTest1
{
	public static void main(String args[] ){
		
		for (int i = 100 ; i<200; i++ )
		{
			boolean b = false;
			for (int j=2;j < i - 1 ;j++ )
			{
				int k = i % j;
				if (k == 0)
				{
					b = true;
				}
			}
			if (!b)
			{
				System.out.println(i);
			}
			
		}
	}
}