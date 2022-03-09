package zookeeper;

public class Bat extends mamal {
	public int batenergy=300;
	public int fly() {
		batenergy =batenergy - 50 ;
		System.out.println("Bat energy "+batenergy);
		System.out.println("the Bat is in the dark sky");
		return batenergy;
		
	}
	public void eatHumans() {
		batenergy += 25;
		System.out.println("Bat energy "+batenergy);
		System.out.println("the Bat has eaten a human!");

	}
	public void attackTown() {
		batenergy -= 100;
		System.out.println("Bat energy "+batenergy);
		System.out.println("The town is on fire");

	}
	
	
}
