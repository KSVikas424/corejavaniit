package lamdaExpressions;

public class ThreadTest {

	public static void main(String[] args) {
		
		Runnable r = () -> {
			for(int i=0;i<500;i++) {
				System.out.println("child Thread");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		for(int i=0;i<500;i++) {
			System.out.println("main Thread");
		}
	}

}
