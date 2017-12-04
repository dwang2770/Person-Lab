
public class Teacher extends Person
{	
	private String subject;		//Subject the teacher teaches
	private String title;		//Prefix of teacher to address them by
	public Teacher(String subject, String title, String firstName, String familyName, int age, double height)
	
	{
		super(firstName, familyName, age, height);
		this.subject = subject;
		this.title = title;
	}
	
	public String getSubject() {
		return subject;
	}

	//Initializes subject
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTitle() {
		return title;
	}

	//Initializes title
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return getTitle() + " " + getFamilyName() + " - " + getSubject();
		//Prints out the title and family name of the teacher plus the subject they teach
	}
	
}