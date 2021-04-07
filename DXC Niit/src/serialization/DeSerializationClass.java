package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializationClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis;
		try {
			fis = new FileInputStream("dxc.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			DogObjectToSerialize dog2 = (DogObjectToSerialize)ois.readObject();
			System.out.println(dog2.i + "  " + dog2.j);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
