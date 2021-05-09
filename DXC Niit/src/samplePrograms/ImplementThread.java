package samplePrograms;

public class ImplementThread extends Thread{
	public void run() {
		System.out.println("run method: "+this.currentThread().getName());
	}
	public static void main(String[] args) {
		ImplementThread t = new ImplementThread();
		t.start();
	}
}
