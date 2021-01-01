package Family;

public class CheckStatus extends Family_S implements InterA{
	public CheckStatus() {
		super("Ram", "Sita", "Male");
	}
	public void checkRelation(String fn, String mn, String g) {
		if((fn.equals("Ram"))&&(mn.equals("Sita")))
		{
			System.out.println("Belongs to the same Family \n");
			if(g.equals("Male"))
				System.out.println("Brother Brother");
			else if(g.equals("Female"))
				System.out.println("Sister Sister");
			else
				System.out.println("Brother Sister");
		}
		else
			System.out.println("Does not belong to the same Family \n");
	}
}