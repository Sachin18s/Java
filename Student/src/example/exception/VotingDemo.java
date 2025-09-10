package example.exception;
class InvalidAgeException extends Exception{
	public InvalidAgeException(String msg) {
		super(msg);
	}
}


class Voting{
	public void checkEligibility(int age) throws InvalidAgeException { 
		if(age<18) {
			throw new InvalidAgeException("You are not eligible to vote");
		}
		else {
			System.out.println("You are eligible to vote");
		}
	}
}



public class VotingDemo {

	public static void main(String[] args) {
		Voting Vote = new Voting();
		int age = 16;
		try {
		Vote.checkEligibility(age);
		}
		catch(InvalidAgeException e) {
			System.out.println("Exception handled: "+ e.getMessage());
		}

	}

}
