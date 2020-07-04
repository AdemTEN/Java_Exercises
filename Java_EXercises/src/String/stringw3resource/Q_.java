package String.stringw3resource;

public class Q_ {

	public static void main(String[] args) {

		System.out.println(duplicateStringRemoving("glmmaabccddrrhhaarbarccraaccbaalagg"));

	}

	public static String duplicateStringRemoving(String str) {
		String newStr = "";
	
		
		for (int i = 0; i < str.length() -1 ; i++) {

			if (str.substring(i, i + 1).equals(str.substring(i + 1, i + 2))) {
				i = i + 1;
				continue;
			} else {
				newStr = newStr + str.substring(i  , i + 1 );
			}
		}
		return newStr ;
	}

}
