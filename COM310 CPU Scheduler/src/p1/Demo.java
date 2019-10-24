package p1;

public class Demo {

	public static void main(String[] args) {

		Process p1 = new Process(1, 24);
		Process p2 = new Process(2, 3);
		Process p3 = new Process(3, 3);
		
		FCFSProcessBag bag = new FCFSProcessBag();
		bag.addProcess(p1);
		bag.addProcess(p2);
		bag.addProcess(p3);
		
		System.out.println(bag.calculateWaitTime(1));
		System.out.println(bag.calculateWaitTime(2));
		System.out.println(bag.calculateWaitTime(3));
		System.out.println(bag.calculateTurnAroundTime(1));
		System.out.println(bag.calculateTurnAroundTime(2));
		System.out.println(bag.calculateTurnAroundTime(3));

		double a = bag.calculateAverageWaitTime();
		System.out.println(a);
	}

}
