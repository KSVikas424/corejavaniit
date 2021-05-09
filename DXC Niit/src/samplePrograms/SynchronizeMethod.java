package samplePrograms;

public class SynchronizeMethod extends Thread{
	void printNos() {
		System.out.println("Print Nos method");
		synchronized(this) {
		for(int i=0;i<50;i++)
			System.out.println(i);
	}
	}
	public static void main(String[] args) {
		SynchronizeMethod sm = new SynchronizeMethod();
		Thread t1 = new Thread(sm);
		Thread t2 = new Thread(sm);
		t1.start();
		t2.start();
	}
	public void run() {
		printNos();
	}
	
}
