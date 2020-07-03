package StringManipulations;

public class equals {

	public static void main(String[] args) {

		String s1 = "javapoint";
		String s2 = "javapoint";
		String s3 = "Javapoint";
		
		System.out.println(s1.equals(s2));
		if(s1.equals(s2)) {
			System.out.println("both are equal");
		}else {
			System.out.println("both are not equal");
		}
		
		System.out.println(s1.equals(s3));
		int index = s1.indexOf('a', 2);
		System.out.println(index);
		
		
	}

}
