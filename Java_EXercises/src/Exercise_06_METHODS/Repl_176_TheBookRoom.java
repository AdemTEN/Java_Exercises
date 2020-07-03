package Exercise_06_METHODS;

public class Repl_176_TheBookRoom {

	public static void main(String[] args) {

		System.out.println(simpleRoomBook(true, 2, 1, 2018));
		
	}

	public static boolean simpleRoomBook(boolean isAvailabe, int month, int day, int year) {
		boolean flag = true;
		if (isAvailabe == false) {
			flag = false;
		}else if (isAvailabe == true && year != 2018) {
			flag = false;
		}else if(isAvailabe == true && year == 2018 && month == 7 && (1<=day && day<= 8)) {
			flag = false;
		}
		return flag;
	}
}
