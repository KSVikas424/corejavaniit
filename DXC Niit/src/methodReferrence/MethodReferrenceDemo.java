package methodReferrence;

public class MethodReferrenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = () -> {
			for(int i = 0;i < 10 ; i++)
				System.out.println("I'm in Child");
		};
		
		Thread t = new Thread(r);
		t.start();
		for(int i = 0;i < 10 ; i++)
			System.out.println("I'm in Main");
	}

}
