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
		int age = 35;			//Age is set to 35
		double height = 1.8; 	//Height is set to 1.8 meters
		
		Random r2 = new Random();
		return new Teacher (subject [r2.nextInt(subject.length)],title [r2.nextInt(title.length)], firstNames [r2.nextInt(firstNames.length)], 
				familyNames [r2.nextInt(familyNames.length)], age, height);
	}
	
	
	public static Student randomStudent()
	{
		double gpa = Math.random() * 4;			//Since Math.random() returns a value between 0.0 and 1.0, multiplying by 4 makes sure that the GPA is between 1 and 4 inclusive
		int age = (int)Math.random() * 17;
		double height = Math.random() * 1.9;
		
		Random r1 = new Random();
		return new Student(gpa,  gender [r1.nextInt(gender.length)]
			    , major [r1.nextInt(major.length)], firstNames [r1.nextInt(firstNames.length)],familyNames [r1.nextInt(familyNames.length)],age, height);
	}
	
	public static void main(String[] args) 
	{	
		/*
		 * A loop to add a student to an array as long as the number of students is less than 34
		 * First prints out all the students
		 * Then prints out teacher and subject
		 * Lastly, prints out class average on a scale of 0 to 4
		 */
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
		
		Classroom cl = new Classroom(students, teacher);
		
		System.out.println("Class Average:");
		System.out.println(cl.classAverage());
	}

}
