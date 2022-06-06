package RaceConditon;

public class TestRaceCondThread {
 
	public static void main(String[] args) {
	

	RaceCondThread t1 = new RaceCondThread("dhoni");
	RaceCondThread t2 = new RaceCondThread("Virat");
	
	t1.start();
	t2.start();
	}	
}
