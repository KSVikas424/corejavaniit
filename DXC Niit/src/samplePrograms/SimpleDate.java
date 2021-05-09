package samplePrograms;

import java.util.Scanner;

class SimpleDate{
    private int day, month, year;
	public SimpleDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public void setDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public String toString() {
		return day+"/"+month+"/"+year;
	}
	static boolean validateDate(SimpleDate simpleDate) {
		int month = simpleDate.month;
		if(simpleDate.year >2000 && month>=1 && month<=12) {
			switch(simpleDate.day) {
			case 30:
			case 31:
			case 28:return true;
			}
		}
		return false;
	}
}

class Address{
	private String area, city;

	public Address(String area, String city) {
		super();
		this.area = area;
		this.city = city;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	public String toString() {
		return area+", "+city;
	}
}

class Customer{
	private int custId;
	private String name;
	private Address address;
	private SimpleDate registrationDate;
	public Customer(int custId, String name, Address address, SimpleDate registrationDate) {
		super();
		this.custId = custId;
		this.name = name;
		this.address = address;
		this.registrationDate = registrationDate;
	}
	public String toString() {
		return "Id : "+custId+", Name : "+name+"\nAddress : "+address+"\nRegistered on : "+registrationDate;
	}
}

class Source12{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int custId = scan.nextInt();
		String name = scan.next();
		
		String area = scan.next();
		String city = scan.next();
		Address address = new Address(area, city);
		
		int day = scan.nextInt();
		int month = scan.nextInt();
		int year = scan.nextInt();
		SimpleDate simpleDate = new SimpleDate(day, month, year);
		
		Customer customer = new Customer(custId, name, address, simpleDate);
		System.out.println(customer);
		scan.close();
	}
}