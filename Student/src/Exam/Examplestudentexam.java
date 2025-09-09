package Exam;
import student.Student;

abstract class java extends Assessment

public class Examplestudentexam extends Student{
	public static void main (String args[]) {
       Student s1 = new Student(5, "priya", "AIML", 'C');
       Examplestudentexam obj =new Examplestudentexam();
       obj.Department="CS";
       obj.Section="E"//default specifier is not accessable in subclass.
       obj.displayInfo();
	}
}
