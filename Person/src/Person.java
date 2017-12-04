
public abstract class Person {
	private String firstName; 		//First Name of Person
	private String familyName;		//Family Name of Person
	private int age;				//Person's Age in Years
	private double height;			//Peron's height in Meters
	
	public Person(String firstName, String familyName, int age, double height)
	{
		this.firstName = firstName;
		this.familyName = familyName;
		this.age = age;
		this.height = height;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	//Initializes firstName
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFamilyName() {
		return familyName;
	}
	
	//Initializes familyName
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public int getAge() {
		return age;
	}
	
	//Initializes getAge
	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}
	
	//Initializes getHeight
	public void setHeight(double height) {
		this.height = height;
	}

	public abstract String toString();

}