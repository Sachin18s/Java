package Exam;

//public abstract class Assessment {
//	abstract void MSE1();
//	abstract void MSE2();
//	public void CA3() {
//		System.out.println("the attendence have 3 marks");
//	}

	interface Assessment {
		abstract void MSE1();
		abstract void MSE2();
		default public void CA3() {
			System.out.println("the attendence have 3 marks");
		}

	
	
}
