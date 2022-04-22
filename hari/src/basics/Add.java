package basics;

public class Add {
	int a=30,b=20,c=a+b;
	
	void add()
	{
		System.out.println(c);
	}

	public static void main(String[] args) {
		Add plus = new Add();
		plus.add();

	}

}
