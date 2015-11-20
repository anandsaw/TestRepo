package test;

public class TestClass {
	private int a;
	private int b;
	
	public TestClass(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int multiply() {
		return this.a * this.b;
	}
	
	public int subtract() {
		return this.a - this.b;
	}
	
	public int add() {
		return this.a + this.b;
	}

}
