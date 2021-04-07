package serialization;

import java.io.Serializable;

public class Rabbit extends Animal implements Serializable {

	int i = 10; 
	int j = 20;
	int k = 30;
	
	Rabbit(){
		System.out.println("Rabbit Class Constructor \n i: "+ this.i+"\n j: "+this.j+ "\n k: "+this.k);
	}
}
