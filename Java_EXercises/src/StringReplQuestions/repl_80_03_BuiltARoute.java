package StringReplQuestions;

import java.util.Scanner;

public class repl_80_03_BuiltARoute {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    String start = scan.next();
		    String end = scan.next();
		    
		    
		    String route = "ABCD";
		    int current = route.indexOf(start);
		    int last = route.indexOf(end);
		    
		    if (current==last) {
		    	System.out.println(end + " found");
		    }
		    
		    while(current!=last) {
		    	if(route.charAt(current)=='A') System.out.print("right");
		    	if(route.charAt(current)=='B') System.out.print("down");
		    	if(route.charAt(current)=='C') System.out.print("left");
		    	if(route.charAt(current)=='D') System.out.print("up");
		    	current++;
		    	current = current %4;
		    	if(current==last) {
		    		System.out.println(": "+ end + " found");
		    		break;
		    	}
		    	System.out.print(" > ");
		    }

		}

	}


