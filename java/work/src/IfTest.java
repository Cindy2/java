public class IfTest
{
	public static void main(String args[]){
	int score =60;
	if (score > 85 && score <= 100){
		System.out.println("5 stars");
	}
	else if(score>75 && score<=85){
		System.out.println("4 stars");
	}
	else if(score>=60 && score<=75){
		System.out.println("3 stars");
	}
	else if (score<60 && score>=0){
		System.out.println("1 star");
	}
	else if(score>100||score<0){
		System.out.println("out");
	}
	}
}