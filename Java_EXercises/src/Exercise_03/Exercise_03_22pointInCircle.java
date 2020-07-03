/*
(Geometry: point in a circle?) Write a program that prompts the user to enter a
point (x, y) and checks whether the point is within the circle centered at (0, 0)
with radius 10. For example, (4, 5) is inside the circle and (9, 9) is outside the
circle, as shown in Figure 3.7a.İpucu: Eğer bir nokta çemberin içinde ise bu noktanın merkeze olan uzaklığı, çemberin yarıçapından
küçük ya da eşit olmalıdır. İki nokta arasında bulunan uzaklığı hesaplamak için kullanılan formül
Programınızı tüm durumlar için test ediniz.) Aşağıdaki iki örneği inceleyiniz.
*/
package Exercise_03;

import java.util.Scanner;

public class Exercise_03_22pointInCircle {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter two points with two coordinates: ");
		double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();
		scan.close();
		
		double x2 = 0;		
		double y2 = 0;
		
		double distance = Math.pow(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1) , 2) , 0.5);
		
		double radius = 10;
		
		if (distance <= radius) {
			System.out.println("("+x1 + ", " + y1+ ") is in the circle"   );
		}else {
			System.out.println("("+x1 + ", " + y1+ ") is not in the circle"   );
		}
		
		
		
		
		
		
		
		
		
		

	}

}
