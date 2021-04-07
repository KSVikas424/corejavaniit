package serialization.Externalization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import serialization.Rabbit;

public class ExternalizationDemo implements Externalizable {

	String s ;
	int i =10, j;
	float k=30;
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeObject("hello");
		out.writeInt(8);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		this.s = (String) in.readObject();
		this.i = (int)in.read();
	}

	public static void main(String args[]) throws Exception {
		
		ExternalizationDemo ed = new ExternalizationDemo();
		System.out.println("Begining of Serialization");
		FileOutputStream fos = new FileOutputStream("ExternalizationDemoFile.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(ed);
		System.out.println("End of Serialization");
		
		System.out.println("Begining of De-Serialization");
		FileInputStream fis = new FileInputStream("ExternalizationDemoFile.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ExternalizationDemo ed1 = (ExternalizationDemo) ois.readObject();
		System.out.println("i: "+ed1.i+ " j: "+ed1.j+" s: "+ed1.s+" k: "+ed1.k);
		System.out.println("End of Serialization");
		
	}
}
