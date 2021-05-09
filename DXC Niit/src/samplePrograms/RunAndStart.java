package samplePrograms;

public class RunAndStart extends Thread{
	public static void main(String[] args) {
		RunAndStart ras = new RunAndStart();
		Thread t1 = new Thread(ras);
		Thread t2 = new Thread(ras);
		t1.start();
		t2.start();
	}
	public void run() {
		try {
			Thread.sleep(300);
			for(int i=0;i<50;i++) 
				System.out.println(i );
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}

