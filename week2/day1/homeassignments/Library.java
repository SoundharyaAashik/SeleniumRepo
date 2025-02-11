package week2.day1.homeassignments;

public class Library {

	public  String addBook(String bookTitle) {
		System.out.println("Book Title");		
		return bookTitle;
		
	}
	
	public  void issueBook() {
		System.out.println("Book issued successfully");
		
	}
	
	public static void main(String[] args) {
		
		Library libraryoptions = new Library();
		String bookTitle = libraryoptions.addBook("Book added successfully");
		System.out.println(bookTitle);
		libraryoptions.issueBook();
	}

}
