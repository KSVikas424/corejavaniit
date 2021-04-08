package lamdaExpressions.defaultStatic.inheritance;

public interface Right {
	public default void m1() {
		System.out.println("Right interface");
	}
}
