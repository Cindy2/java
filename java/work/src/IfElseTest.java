public class IfElseTest
{
	/*��ȭ��Ϸ*/
	public static void main(String args[]){
		char play1 = 'a';
		char play2 = 'b';
		if (play1 == 'a' && play2 =='a')
		{
			System.out.println("ƽ");
		}
		else if (play1 == 'a' && play2 =='b')
		{
			System.out.println("player1Ӯ�ˣ�");
		}
		else if (play1 == 'a' && play2 =='c')
		{
			System.out.println("player2Ӯ�ˣ�");
		}
		else if (play1 == 'b' && play2 =='a')
		{
			System.out.println("player2Ӯ�ˣ�");
		}
		else if (play1 == 'b' && play2 =='b')
		{
			System.out.println("ƽ");
		}
		else if (play1 == 'b' && play2 =='c')
		{
			System.out.println("player2Ӯ�ˣ�");
		}
		else if(play1 == 'c' && play2 =='a')
		{
			System.out.println("player1Ӯ�ˣ�");
		}
		else if(play1 == 'c' && play2 =='b')
		{
			System.out.println("player1Ӯ�ˣ�");
		}
		else if(play1 == 'c' && play2 =='c')
		{
			System.out.println("ƽ");
		}
	}
}