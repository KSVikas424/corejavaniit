package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DogObjectToSerialize dog = new DogObjectToSerialize();
		
		FileOutputStream fos;
		ObjectOutputStream oos;
		try {
			fos = new FileOutputStream("dxc.txt");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(dog);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  // De-Serialization
		
		
	}

}
