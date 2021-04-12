package methodReferrence.constructor;

public class PlayStudentInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IStudentInterface is = IStudent::new;
		is.get("vikas", 21, 78);
	}
	

}
