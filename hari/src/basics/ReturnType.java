package basics;

public class ReturnType {

	int collectedAmount = 1000;
	int mySon()
	{
		System.out.println("collected amount and give it to me rs.1000");
		return collectedAmount;
	}
	
	public static void main(String[] args) {
		
		ReturnType cash = new ReturnType();
		int amount = cash.mySon();
		System.out.println("i received amount:");
	}					

}

