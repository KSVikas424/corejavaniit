package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GraphSerializationDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Dog dog = new Dog();
		FileOutputStream fis = new FileOutputStream("GraphSerial.txt");
		ObjectOutputStream ois = new ObjectOutputStream(fis);
		 
		ois.writeObject(dog);
	}

}
