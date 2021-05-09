package samplePrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		SerializableClass sc = new SerializableClass();
		try {
			FileOutputStream fos = new FileOutputStream("serDemo.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(sc);
			oos.flush();
			oos.close();
			fos.close();
	} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fis = new FileInputStream("serDemo.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			SerializableClass sc1 = (SerializableClass) ois.readObject();
			System.out.println("i = "+sc1.i+" j = "+sc1.j);
			ois.close();
			fis.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
