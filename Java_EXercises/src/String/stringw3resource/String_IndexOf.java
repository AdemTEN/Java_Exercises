package String.stringw3resource;

public class String_IndexOf {

	public static void main(String[] args) {

		String str = "w3resource";
		String partOfStr;
		String newStr = "";
		
		for (int i = 0; i < str.length(); i++) {
			
			partOfStr = str.substring(i, i + 1);
			
			if (str.indexOf(partOfStr, i + 1) == -1) {
			
				newStr = newStr + partOfStr;
			}

		}
		System.out.println(newStr);

	}
}
