package Encapsulation;

public class Account {
	private int accNo;
	private String name;
	
	public static void main(String[] args) {
		Account a = new Account();
		a.setaccNo(101);
		a.Setname("Hari");
		
		System.out.println("AccNo:"+ a.getaccNo());
		System.out.println("Name:"+ a.getname());
		
	}
	public int getaccNo()
	{
		return accNo;
		
	}
	public void setaccNo(int accNo)
	{
		this.accNo  = accNo;
		
	}
	public String getname() {
	return name;
	}
	public void Setname(String name){
		this.name=name;
	}
	
		
	}
	
