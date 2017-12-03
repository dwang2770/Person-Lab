
public abstract class Person {
	private String firstName; 		//First Name of Person
	private String familyName;		//Family Name of Person
	private int age;				//Person's Age
	private double height;			//In meters
	
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

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public abstract String toString();

}