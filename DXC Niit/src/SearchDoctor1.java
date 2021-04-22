

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Collections;
import java.util.HashSet;

//IMPORT STATEMENTS HERE

public class SearchDoctor1 {
	
	//DON'T MODIFY THIS
	private static String doctorsData;
	
	//DON'T MODIFY THIS
	static {
		StringBuilder doctors = new StringBuilder();
		doctors.append("Amy-Pediatrics-16;");
		doctors.append("John-Dermatology-10;");
		doctors.append("David-Dermatology-15;");
		doctors.append("Bob-Pediatrics-6;");
		doctors.append("Cathy-Dermatology-5;");
		doctors.append("Mavis-Pediatrics-11;");
		doctors.append("Robin-Pediatrics-7;");
		doctors.append("Minty-Dermatology-9;");
		doctors.append("Jim-Cardiology-25;");
		doctorsData = doctors.toString();
	}
	
    public static void main(String[] args) {
		String[] str = doctorsData.split(";");
		List<Doctor> doc = new ArrayList<Doctor>();
		for(int i=0;i<str.length;i++){
		    String[] splitStr = str[i].split("-");
		    	Doctor doctor = new Doctor(splitStr[0], splitStr[1], Integer.parseInt(splitStr[2]));
		    	doc.add(doctor);
		 }
		DoctorService ds = new DoctorService(doc);
		ds.sortRepository();
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		switch(input) {
		case 1:	int exper = scan.nextInt();
				List<Doctor> exp = ds.getExperiencedDoctors(exper);
				for(Doctor d : exp)
					System.out.println(d);
			break;
		case 2:	String special = scan.next();
				Set<Doctor> expe = ds.getSpecialityDoctor(special);
				for(Doctor d : expe)
					System.out.println(d);
			break;
		default: System.out.println("Invalid Choice");
		}
		
	}
}

class Doctor implements Comparable {

	
	private String name;
	private String speciality;
	private int experience;
	
	@Override
	public String toString() {
		return name + " " + speciality + " " + experience;
	}
	
	public Doctor(String name, String speciality, int experience) {
		super();
		this.name = name;
		this.speciality = speciality;
		this.experience = experience;
	}
	
	public String getSpeciality() {
		return speciality;
	}

	public int getExperience() {
		return experience;
	}
	
	@Override
	public int compareTo(Object o) {
		Doctor obj = (Doctor)o;
		if(this.experience > obj.experience)	
			return -1;
		else if(this.experience < obj.experience)	
		return 1;
		else
		return this.speciality.compareTo(obj.speciality);
	}
}

class DoctorService {

  //DONT MODIFY THIS	
	private List<Doctor> doctorsRepository;
	
	//DONT MODIFY THIS
	public DoctorService(List<Doctor> doctorsRepository) {
		this.doctorsRepository = doctorsRepository;
	}
	
	public DoctorService() {}
	
	public void sortRepository() {
		Collections.sort(doctorsRepository);
	}
	List<Doctor> getExperiencedDoctors(int exper){
		List<Doctor> doc = new ArrayList<Doctor>();
		for(int i=0;i<doctorsRepository.size();i++) {
			Doctor d1 = doctorsRepository.get(i);
			if(d1.getExperience() >= exper) doc.add(doctorsRepository.get(i));			
		}
		return doc;
	}
    
	Set<Doctor> getSpecialityDoctor(String special){
		Set<Doctor> doc = new HashSet<Doctor>();
		for(int i=0;i<doctorsRepository.size();i++) {
			Doctor d1 = doctorsRepository.get(i);
			if(d1.getSpeciality().equalsIgnoreCase(special)) doc.add(doctorsRepository.get(i));			
		}
		return doc;
	}
}



