public class Student extends Person{
	private double gpa;			//Student GPA : Measured from 0 to 4
	private String gender;		//Student Gender
	private String major;		//Student Major
	
	public Student(double gpa, String gender, String major, String firstName, String familyName, int age, double height)
	{
		super(firstName, familyName, age, height);
		this.gpa = gpa;
		this.gender = gender;
		this.major = major;		
	}
	
	
	public double getGpa() {
		return gpa;
	}

	//Initializes gpa
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}


	public String getGender() {
		return gender;
	}

	//Initializes gender
	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getMajor() {
		return major;
	}

	//Initializes major
	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return getFirstName() + ", " + getFamilyName();		//Prints out the first and last name of the student
	}
}