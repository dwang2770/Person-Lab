import java.util.Random;

public abstract class Person {
	private String firstName; 
	private String familyName;
	private int age;	
	private double height;	//In meters
	
	public Person(String firstName, String familyName, int age, double height)
	{
		this.firstName = firstName;
		this.familyName = familyName;
		this.age = age;
		this.height = height;
	}

	public String getFirstName()
	{
		Random r1 = new Random();
		return firstNames[r1.nextInt(firstNames.length)];
	}

	public String getFamilyName()
	{
		Random r2 = new Random();
		return familyNames[r2.nextInt(familyNames.length)];
	}
	
	public abstract String toString();

}