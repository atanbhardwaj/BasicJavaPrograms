
public abstract class LogicPark {
	private int adult;
	private int children;
	LogicPark(int adult, int children){
		this.adult = adult;
		this.children = children;
	}
	void totalcost() {
		int sum = (500*adult)+(300*children);
		System.out.println("The Total price of Tickets is: "+sum);
	}
	public abstract void playgame();
}
