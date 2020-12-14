package test;

public class Test {
	
	final int number;
	
	Test() {
		number = 20;
	}

	public static void main(String[] args) {
		System.out.println("Test");
		
		final int a;
		final int b;
		final int c;
		
		a = 30;
		b = 50;
		c = a+b;
				
		System.out.println(c);
		
	}
}
