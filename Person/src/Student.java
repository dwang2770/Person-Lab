public class Student extends Person{
	private double gpa;
	private String gender;
	private String major;
	
	public Student(double gpa, String gender, String major, String firstName, String familyName, int age, double height)
	{
		super(firstName, familyName, age, height)
		this.gpa = gpa;
		this.gender = gender;
		this.major = major;
	}
	
	public double getGpa()
	{
		double[] gpas = new double[1];  
		for (Double gpa : gpas)
		gpas[i] = (double)(Math.random()*4);
		return gpas;
	}
	
	public String getMajor()
	{
		
	}
	
	public String toString()
	{
		return (familyNames + " ," + firstNames)
	}
}