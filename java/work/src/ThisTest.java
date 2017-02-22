public class ThisTest
{
	public static void main(String arg[]){
		This p1 = new This();
		p1.name = "Cindy";

		This p2 = new This();
		p2.name = "Tom";

		p1.talk();
		p2.talk();
	}
}