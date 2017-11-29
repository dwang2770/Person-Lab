
public class Teacher extends Person
{
	private String[] subject = {"History", "Economics", "Chemistry", "Physics", "Biology", "Calculus"};
	private String[] title = {"Mr.", "Ms.", "Mrs.", "Mx.", "Dr."};
	
	public Teacher(String subject, String title, String firstName, String familyName, int age, double height)
	{
		super(firstName, familyName, age, height);
		this.subject = subject;
		this.title = title;
	}
	
	
}