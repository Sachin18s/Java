package student;

public class Teststudent {
	public static void main(String[] arg) {
		Student student1 = new Student(153,"Rohit", "AI", 'C'); // parameterize contructor
		Student student2 = new Student(); // default constructor
    	//Student student3 = new Student(student1); //copy constructor
//		student1.Department="AI";
//		student1.Name="Rohit";
//		student1.Roll_Number=153;
//		student1.section='C';
//		student1.No_of_hours=8;
		//student1.Name="priya";//cannot excess the private variable.
		student1.Department="AI-ML";
		student1.displayInfo();
//		student1.studying(5);
		student2.displayInfo();
		Student.College_Name="IIT";
//		student1.College_Name="NIT";
		student1.displayInfo();
		student2.displayInfo();
		
		
		
		
	}
}

