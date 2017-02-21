public class IfElseTest
{
	/*猜拳游戏*/
	public static void main(String args[]){
		char play1 = 'a';
		char play2 = 'b';
		if (play1 == 'a' && play2 =='a')
		{
			System.out.println("平");
		}
		else if (play1 == 'a' && play2 =='b')
		{
			System.out.println("player1赢了！");
		}
		else if (play1 == 'a' && play2 =='c')
		{
			System.out.println("player2赢了！");
		}
		else if (play1 == 'b' && play2 =='a')
		{
			System.out.println("player2赢了！");
		}
		else if (play1 == 'b' && play2 =='b')
		{
			System.out.println("平");
		}
		else if (play1 == 'b' && play2 =='c')
		{
			System.out.println("player2赢了！");
		}
		else if(play1 == 'c' && play2 =='a')
		{
			System.out.println("player1赢了！");
		}
		else if(play1 == 'c' && play2 =='b')
		{
			System.out.println("player1赢了！");
		}
		else if(play1 == 'c' && play2 =='c')
		{
			System.out.println("平");
		}
	}
}