package methodReferrence;

public class PlayMethodReferrence {

	public static void main(String[] args) {
		
		Runnable r = PlayMethodReferrence::m1;
		Thread t = new Thread(r);
		t.start();
		for (int i = 0 ; i< 10; i++)
			System.out.println("I'm in Main Thread");

	}

	public static void m1() {
		for (int i = 0 ; i< 10; i++)
			System.out.println("I'm in Child Thread");

	}
}
