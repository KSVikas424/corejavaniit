package lamdaExpressions.defaultStatic;

public interface DefaultMethodDemoInInterface {
	public void m1();
	public void m2();
	default public void m3() {
		System.out.println("Default method of InterfaceDemo");
	}
}
