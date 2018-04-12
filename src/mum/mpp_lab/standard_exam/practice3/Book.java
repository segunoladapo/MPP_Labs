package mum.mpp_lab.standard_exam.practice3;

public class Book extends LendingItem {
	private String isbn;
	private String title;
	private String authorFirstName;
	private String authorLastName;

	public Book(String isbn, String title, String fname, String lname){
	    this.isbn = isbn;
	    this.title = title;
	    this.authorFirstName = fname;
	    this.authorLastName = lname;
    }
}
