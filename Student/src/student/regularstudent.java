package student;

public class regularstudent extends Student {
	int attend_per;
	String class_room;
	
	public regularstudent(int RollNumber, String Name, String Department, char Section,int attend_per,String class_room) {
		super(RollNumber, Name, Department, Section);
		this.attend_per= attend_per;
		this.class_room = class_room;
		
		
	}
	public regularstudent() {
		
	}
	public void submitAssignment() {
		System.out.println("The student has submitted the assignment in hard copy");
	}
	public void payfee() {
		System.out.println("The student has submitted the fee");
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("The student ");
	}

