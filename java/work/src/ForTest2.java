public class ForTest2
{
	public static void main(String args[]){
		
		for (int i=1;i<6 ;i++ )
		{
			/*最后一步：空格*/
			for (int j = 0 ;j<5-i ;j++ )
		{
				System.out.print(" ");
		}
			for (int k = 0;k<i ;k++ )
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
}