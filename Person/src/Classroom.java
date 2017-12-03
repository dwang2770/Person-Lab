
public class Classroom {
	Person[] students;
	Person teacher;
	
	public Classroom(Person[] students, Person teacher)
	{
		this.students = students;
		this.teacher = teacher;
	}

	public Person[] getStudents() {
		return students;
	}

	public void setStudents(Person[] students) {
		this.students = students;
	}

	public Person getTeacher() {
		return teacher;
	}

	public void setTeacher(Person teacher) {
		this.teacher = teacher;
	}
	
	public String getSubject()
	{
		return ((Teacher)this.teacher).getSubject();
	}

	public double classAverage()
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
