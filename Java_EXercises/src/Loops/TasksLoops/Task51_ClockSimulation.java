package Loops.TasksLoops;

public class Task51_ClockSimulation {

	public static void main(String[] args) {
		
		
		for (int hour=1;hour<=24 ;hour++) {
			for(int minute=00 ;minute<=59;minute++) {
				for(int second = 00 ;second<=59;second++) {
//					System.out.println(hour +":" + minute + ":" + second );
					System.out.printf("%02d:%02d:%02d\n",hour,minute,second);

				}
			}
		}

	}

}
