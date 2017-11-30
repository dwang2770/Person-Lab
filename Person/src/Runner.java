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
	
	public static Student randomStudent()
	{
		double gpa = Math.random() * 4;
		int age = (int)Math.random() * 17;
		double height = Math.random() * 1.9;
	
		Random r2d2 = new Random();
		return new Student(gpa, firstNames [r2d2.nextInt(firstNames.length)],familyNames [r2d2.nextInt(familyNames.length)], gender [r2d2.nextInt(gender.length)]
				, major [r2d2.nextInt(major.length)], age, height);
	}
	public static Teacher randomTeacher()
	{
		int age = 35;
		double height = 1.8;
		Random c3po = new Random();
		return new Teacher (firstNames [c3po.nextInt(firstNames.length)],familyNames [c3po.nextInt(familyNames.length)], title [c3po.nextInt(title.length)], 
				subject [c3po.nextInt(subject.length)], age, height);
	}
	
	public static void main(String[] args) 
	{
		for (int i = 0; i < 34; i++)
		{
		Person [] students = { randomStudent() };
		}
		 
		Classroom.printClass( Person[] students, (Person) randomTeacher());
		double avg = Classroom.classAverage();
		System.out.println(x);
	}

}
