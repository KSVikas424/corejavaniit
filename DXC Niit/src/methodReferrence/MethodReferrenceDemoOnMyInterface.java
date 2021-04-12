package methodReferrence;

public class MethodReferrenceDemoOnMyInterface {

	public static void main(String[] args) {
		MyInterfaceForExample  m = MyClass::abstractMethod;
		
		m.add(23,34);
	
	}
	
}
