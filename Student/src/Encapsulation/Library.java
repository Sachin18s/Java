package Encapsulation;

public class Library {
	private int Roll;
	private int borrowed_books;
	final private int MAX_BORROW=5;



public void borrowedbooks() {
	if(borrowed_books<5) {
	borrowed_books++;
	System.out.println("The book is borrowed and total borroed books are "+borrowed_books);
}
else {
	System.out.println("Can not borrow the book more than 5");
}
}

public void returnbook() {
	if(borrowed_books>0) {
		borrowed_books--;
		System.out.println("The book has been retuned and total borrowed books are "+borrowed_books );
	}
	else {
		System.out.println("No book is available to return");
	}
}

public int getborrowedbooks(){
	return borrowed_books;
}





}