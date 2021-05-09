package samplePrograms;
	
	import java.util.regex.Pattern;
	import java.util.Scanner;
	import java.util.regex.Matcher;
	
	class Source2 {
	    public static void main(String argss[]){
	        Scanner scan = new Scanner(System.in);
	        int choice = Integer.parseInt(scan.nextLine());
	        String color = scan.nextLine();
	        if(choice == 1 ){
	            if(ColourCodeValidator.validateHexCode(color) == 1)
	                System.out.println("Valid code");
	            else System.out.println("Invalid code");
	        }
	        else if (choice == 2 ){
	            if(ColourCodeValidator.validateDecimalCode(color) == 1)
	                System.out.println("Valid code");
	            else System.out.println("Invalid code");
	        }
	        else System.out.println("Invalid choice");
	    }
	}
	class ColourCodeValidator{
	    static int validateHexCode(String code){
	        Pattern p = Pattern.compile("#[A-F0-9]{6}");
	        Matcher m = p.matcher(code);
	        if(m.find()){
	            return 1;
	        }
	        return -1;
	    }
	    static int validateDecimalCode(String code){
	        Pattern p = Pattern.compile("[rgb(][0-255][,][0-255][,][0-255][)]");
	        Matcher m = p.matcher(code);
	        if(m.find()){
	            return 1;
	        }
			return -1;
	    }
	}