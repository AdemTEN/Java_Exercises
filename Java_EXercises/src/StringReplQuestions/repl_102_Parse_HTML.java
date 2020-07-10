package StringReplQuestions;

/*Write a program, that will read html variable and output attribute value of id
 attribute (tag) into the console. Input will be provided in a single line as outlined below.
  If html variable doesn't contain <html> attribute, print out into the console message: 
  "Invalid input!". 

Example: 
input: <!DOCTYPE html><html><head><title>Java</title></head><body><p id="myid"></p></body></html>
output: myid
 */
import java.util.Scanner;

public class repl_102_Parse_HTML {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		    String html = scan.nextLine();
		    int x;
		    int y;
		    String id;
		    if(!html.contains("<html>")){
		      System.out.println("Invalid input!");
		    }else{
		      x = html.indexOf("id=");
		      y = html.indexOf("\"", x+4);
		      id = html.substring(x+4, y);
		      System.out.println(id);
		    }

	}

}
