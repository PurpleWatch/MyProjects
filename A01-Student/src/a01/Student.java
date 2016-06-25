package a01;

public class Student {
	private String firstName;
	private String lastName;
	private int sNumber;
	private String major;
	private double gpa;
	private static int count = 1234567;
	
	public Student() {
		count++;
		sNumber = count;
		
	}
	
	public Student(String fName, String lName, String maj, double gpa) {
		this();
		this.firstName = fName;
		this.lastName = lName;
		this.major = maj;
		this.gpa = gpa;
		System.out.println();
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

	public int getsNumber() {
		return sNumber;
	}

	public void setsNumber(int sNumber) {
		this.sNumber = sNumber;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "S" + sNumber + " " + firstName + " " + lastName + " (" + major + ") "
				+ "gpa: " + gpa;
	}
	
	
}
