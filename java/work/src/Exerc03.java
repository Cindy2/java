public class Exerc03
{
	public static void main(String args[]){
		byte b = 0;
		int i =0;
		long l =1L;
		short s =0;
		float f =0.1F;
		double d =0;
		/*运算结果为最大的为准*/
		double j = 0.5 * 10 - 4 + 1;
		/*强制转换结果可能会有的偏差-56*/
		byte k =(byte) (b + 200);
		System.out.println(k);
	}
}