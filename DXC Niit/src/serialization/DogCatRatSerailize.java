package serialization;

import java.io.*;

public class DogCatRatSerailize {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		DogObjectToSerialize dog = new DogObjectToSerialize();
		Cat cat = new Cat();
		Rat rat = new Rat();
		 
		FileOutputStream fos = new FileOutputStream("animalserialize.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(dog);
		oos.writeObject(cat);
		oos.writeObject(rat);
		 
		oos.flush();
		oos.close();
	}

}
