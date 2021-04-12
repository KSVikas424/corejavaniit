package methodReferrence.constructor;

public class PlayConstructorReferrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ISample iSample = Sample::new;
		Sample s1 = iSample.get("abdul");
	}

}
