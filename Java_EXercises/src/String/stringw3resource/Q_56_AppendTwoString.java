package String.stringw3resource;

public class Q_56_AppendTwoString {

	public static void main(String[] args) {

		System.out.println(dublicateChar("food", "door"));
		
	}
	public static String dublicateChar(String str1, String str2) {
		
		
		if(str1.substring(str1.length()-1).equals(str2.substring(0, 1))) {
			return  str1.concat(str2.substring(1));
		}else {
			return str1.concat(str2);
		}
		
		
		
		
		
		
	}

}
