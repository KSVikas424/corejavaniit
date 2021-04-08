package lamdaExpressions.LambdaAnonymusClasses;

public class AnonymusClassesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person employee = new Person() {
			public void eat() {
				System.out.println("anonymous employee is eating");
			}
		};
		
		employee.eat();
		
		Thread t = new Thread() {
			public void run() {
				System.out.println("child thread");
			}
		};
		t.start();
		
		Runnable r = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Runnable method");
			}
			
		};
		Thread th = new Thread(r);
		th.start();
		
	}

}
