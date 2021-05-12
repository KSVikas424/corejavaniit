package samplePrograms;

public class Source4 {
	public static void main(String args[]) {
		
	}
}

interface CustomerService {
	public void createCustomer(Customer1 customer);
	public Customer1 updateCustomer(Customer1 customer) throws CustomerNotFoundException;
	public void deleteCustomer(int id) throws CustomerNotFoundException;	
	public Customer1 searchCustomer(int id) throws CustomerNotFoundException;
	public Customer1[] getCustomers();
}

class CustomerServiceImpl implements CustomerService {

	static Customer1[] customerArray = new Customer1[5];
	int index = 0;
	
	@Override
	public void createCustomer(Customer1 customer) {
		customerArray[index++] = customer;
	}
	@Override
	public Customer1 updateCustomer(Customer1 customer) throws CustomerNotFoundException {
		int flag = 0;
		for(int ctr=0; ctr<5; ctr++)
		{
			if(customer.equals(customerArray[ctr]))
			{
				flag = 1;
				break;
			}
		}
		if(flag == 0)
		{
			throw new CustomerNotFoundException();
		}
		return customer;
	}
	@Override
	public void deleteCustomer(int id) throws CustomerNotFoundException {
		int flag = 0;
		for(int ctr=0; ctr<5; ctr++)
		{
			if(id == customerArray[ctr].getUserId())
			{
				flag = 1;
				break;
			}
		}
		if(flag == 0)
		{
			throw new CustomerNotFoundException();
		}
	}
	@Override
	public Customer1 searchCustomer(int id) throws CustomerNotFoundException {
		int flag = 0, ctr;
		for(ctr=0; ctr<5; ctr++)
		{
			if(id == ((Customer1) customerArray[ctr]).getUserId())
			{
				flag = 1;
				break;
			}
		}
		if(flag == 0)
		{
			throw new CustomerNotFoundException();
		}
		return customerArray[ctr];
	}
	@Override
	public Customer1[] getCustomers() {
		return customerArray;
	}
}

class CustomerNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public CustomerNotFoundException() {
	}

	public CustomerNotFoundException(String message) {
		super(message);
	}

	public CustomerNotFoundException(Throwable cause) {
		super(cause);
	}

	public CustomerNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public CustomerNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}

class Customer1 {
	private long userId;
	private String emailId;
	private String password;
	private String firstName;
	private String lastName;
	private String city;
	private String gender;
	private long phoneNumber;
	private Address address;

	Customer1() {

	}
	
	public Customer1(long userId, String emailId, String password, String firstName, String lastName, String city,
			String gender, long phoneNumber, Address address) {
		this.userId = userId;
		this.emailId = emailId;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return String.format(
				"Customer [userId=%s, emailId=%s, password=%s, firstName=%s, lastName=%s, city=%s, gender=%s, phoneNumber=%s, address=%s]",
				userId, emailId, password, firstName, lastName, city, gender, phoneNumber, address);
	}

}

class Address1 {
	private String city;
	private String state;
	private int zip;
	private String country;

	Address1() {

	}

	public Address1(String city, String state, int zip, String country) {
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return String.format("Address [city=%s, state=%s, zip=%s, country=%s]", city, state, zip, country);
	}
	
}

