package String.stringw3resource;

public class Q_48_removeChar {

	public static void main(String[] args) {
		
		System.out.println(removeB("AbaaabadfgbfsgsBsgBgg"));
		
	}
	
	public static String removeB(String str) {
		
		String newStr = "";
		for(int i = 0; i<str.length();i++) {
			if(str.substring(i, i+1).equalsIgnoreCase("b") ) {
				continue;
			}else {
				newStr = newStr + str.subSequence(i, i+1);
			}
		}
		
		return newStr;
		
		
		
		
	}

}
