package serialization;

import java.io.*;

public class SerializeInheritanceDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		Rabbit rabbit = new Rabbit();
		rabbit.i = 999;
		rabbit.j = 888;
		rabbit.k = 777;
		
		System.out.println("Begining of Serialization");
		FileOutputStream fos = new FileOutputStream("inheritance.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(rabbit);
		System.out.println("End of Serialization");
		
		System.out.println("Begining of De-Serialization");
		FileInputStream fis = new FileInputStream("inheritance.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Rabbit rabbit2 = (Rabbit) ois.readObject();
		System.out.println("i: "+rabbit2.i+ " j: "+rabbit2.j+" k: "+rabbit2.k);
		System.out.println("End of Serialization");
		
		
	}

}
