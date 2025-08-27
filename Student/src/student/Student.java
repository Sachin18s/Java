package student;

 class Student {
	public int Roll_Number;
	private String Name;
	protected String Department;
	char Section;
	int No_of_hours;
	static String College_Name="KIET"; //class variable
	
	public Student(int Roll_Number, String Name, String Department, char Section) {
		this.Roll_Number=Roll_Number;
		this.Name=Name;
		this.Department=Department;
		this.Section=Section;
	}
	
	
	
	public Student() {
		this.Roll_Number=3;
		this.Name="Unknown";
		this.Department="AI";
		this.Section='C';
	}
	
	
	public Student(Student student1) {
		this.Roll_Number=153;
		this.Name="Rohit";
		this.Department="AI";
		this.Section='C';
	}



	public void studying(int No_of_hours) {
		System.out.println("The Student is studying for " + No_of_hours);
	}
	public void playing() {
		System.out.println("Student is Playing");
	}
	public void displayInfo() {
		System.out.println("The name of the student is " + Name + "The college name is "+College_Name);
		System.out.println("The department is "+Department + " the section is "+Section);
	}
	public static void main(String[] arg) {
		Student student1 = new Student(153,"Rohit", "AI", 'C'); // parameterize constructor
		Student student2 = new Student(); // default constructor
		Student student3 = new Student(student1); //copy constructor
//		student1.Department="AI";
//		student1.Name="Rohit";
//		student1.Roll_Number=153;
//		student1.section='C';
//		student1.No_of_hours=8;
		student1.displayInfo();
//		student1.studying(5);
		student2.displayInfo();
		//Student.College_Name="IIT";
//		student1.College_Name="NIT";
		student3.displayInfo();
		student2.displayInfo();
		
	}
}