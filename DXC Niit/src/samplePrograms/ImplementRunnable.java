package samplePrograms;

public class ImplementRunnable implements Runnable{

	@Override
	public void run() {
		for(int i = 0 ;i<10 ;i++)
		System.out.println(Thread.currentThread().getName()+" "+i);
	}
	
	public static void main(String[] args) {
		ImplementRunnable ir = new ImplementRunnable();
		Runnable r =() -> {
			System.out.println("run method " + Thread.currentThread());
		};
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(ir);
		t1.start();
		t2.start();
	}
}
