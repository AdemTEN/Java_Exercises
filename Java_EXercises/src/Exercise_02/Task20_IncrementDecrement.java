package Exercise_02;

public class Task20_IncrementDecrement {

	public static void main(String[] args) {

		int a = 1;
		int result = -a-- + a++ / -a-- * --a;
		//a in memory : 1 --> 0 -->1 --> 0 --> -1
		
		//result : -1 + 0 / -1 * -1
		System.out.println(result);
		System.out.println(a);// a nin son hali ayni stirda olmadigi icin  degisiklik yazilir
		
		int b = 2;
		boolean res = ++b == 2 || --b == 2 && --b == 2;
		System.out.println(res);
		
		
		
		
		
		
	}

}
