public class Test1
{
	public static void main (String args[]){
		/*int a = 3/2;*/
		double a = 3/2;
		int i = 5;
		int j = i++ +5;
		/*int k = i + 5;
		int l =i+1;*/
		
		System.out.println(j);
		System.out.println(i);
		int m = ++i +5;

		int b =5;
		int c =6;
		boolean d =b<c;
		System.out.println(d);


		boolean e = true;
		boolean f = false;
		boolean g = e&f;
		boolean h = e&&f;
		System.out.println(g);
		System.out.println(h);

		int k = 5;
		boolean l = k>6 & k++>7;
		System.out.println(l);
		System.out.println(k);
		int y = 5;
		boolean z = y>6 && y++>7;
		System.out.println(z);
		/*y=5  &&一旦左边为假便不运算，抄近道*/
		System.out.println(y);





	}
}