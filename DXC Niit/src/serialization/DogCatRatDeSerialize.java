package serialization;

import java.io.*;

public class DogCatRatDeSerialize {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("animalserialize.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		 
		Object o = ois.readObject();
		 
		if(o instanceof Cat) {
			Cat c1 = (Cat)o;
			System.out.println(c1);
		}else if (o instanceof Rat) {
			Rat r1 = (Rat)o;
			System.out.println(r1);
		}else if (o instanceof DogObjectToSerialize) {
			DogObjectToSerialize d1 = (DogObjectToSerialize) o;
			System.out.println(d1);
		}
	}

}
