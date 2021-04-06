package generics;

public class Test<T extends Number & Runnable> {
	
	T a,b;

	public Test(T a, T b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public void arithematicOperations() {
		System.out.println();
	}
}
