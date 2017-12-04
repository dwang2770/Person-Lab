
public class Classroom {
	Person[] students;		//Array of students
	Person teacher;			//One teacher
	
	public Classroom(Person[] students, Person teacher)
	{
		this.students = students;
		this.teacher = teacher;
	}

	public Person[] getStudents() {
		return students;
	}

	//Initializes students
	public void setStudents(Person[] students) {
		this.students = students;
	}

	public Person getTeacher() {
		return teacher;
	}

	//Initializes teacher
	public void setTeacher(Person teacher) {
		this.teacher = teacher;
	}
	
	public String getSubject()
	{
		return ((Teacher)this.teacher).getSubject();
	}

	public double classAverage()		//GPA is measured from 0 to 4
	{
		double total = 0.0;
		for (Person p : this.students)
			if ( p instanceof Student)
			{
					total += ((Student)p).getGpa();
			}	
		return total / this.students.length;
	}
	
	public void printClass(Person[] students, Person teacher)
	{
		System.out.println(((Teacher)teacher).toString() + "Subject: " + getSubject() + " Students: " + getStudents());
	}
}
