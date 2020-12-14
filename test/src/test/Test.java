package test;

public class Test {
	
	final int number;
	
	Test() {
		number = 20;
	}

	public static void main(String[] args) {
		String name = "홍길동";
		System.out.println(name);
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
