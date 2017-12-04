import java.util.Random;

public class Runner {
	private static String[] firstNames = 
		{ "Andy", "John", "Daniel", "Johnny", "Joshua", "Nathan", "Simon", "Nick", "Mary", "Amy", "Annie", "Michelle", 
			"Uvuvwevwevwe Onyetenyevwe Ugwemuhwem Osas" 	//this is a meme name 
		};
	
	private static String[] familyNames = { "Chen", "Lin", "Lee", "Choi", "Smith", "Ishikawa", "Levin", "Mikhailov", "Park", "Watanabe",
			"Fischer", "Bernrd", "Osas" };
	
	private static String[] subject = {"History", "Economics", "Chemistry", "Physics", "Biology", "Calculus"};
	
	private static String[] title = {"Mr.", "Ms.", "Mrs.", "Mx.", "Dr."};
	
	private static String[] major = {"Chemistry", "Physics", "College Prep", "BioSci", "Industrial Design", "Math"};
	
	private static String[] gender = {"Male", "Female"}; // subjective to personal belief / opinions;
	
	private static Person[] students = new Person[35];
	
	private static Person teacher;
	
	public static Teacher randomTeacher()
	{
		int age = 35;
		double height = 1.8;
		Random r2 = new Random();
		return new Teacher (subject [r2.nextInt(subject.length)],title [r2.nextInt(title.length)], firstNames [r2.nextInt(firstNames.length)], 
				familyNames [r2.nextInt(familyNames.length)], age, height);
	}
	
	
	public static Student randomStudent()
	{
		double gpa = Math.random() * 4;
		int age = (int)Math.random() * 17;
		double height = Math.random() * 1.9;
	
		Random r1 = new Random();
		return new Student(gpa,  gender [r1.nextInt(gender.length)]
			    , major [r1.nextInt(major.length)], firstNames [r1.nextInt(firstNames.length)],familyNames [r1.nextInt(familyNames.length)],age, height);
	}
	
	public static void main(String[] args) 
	{	
		System.out.println("Students:");
		for (int x = 0; x < 34; x++)
		{
			students[x] = randomStudent();
			System.out.println(students[x].toString());
		}

		System.out.println("\n");
		System.out.println("Teacher and Subject:");
		System.out.println(randomTeacher());
		System.out.println("\n");
		System.out.println("Class Average:");
		System.out.println();
	}

}
