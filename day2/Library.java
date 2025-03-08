package week1.day2;

public class Library {
  String addBook (String bookTitle) {
	 return bookTitle ;
 }
 String issueBook() {
	 return "Book issued successfully";
 }
 public static void main(String[] args) {
	 Library lib=new Library();
	System.out.println("Book added successfully");
	System.out.println(lib.addBook("Introduction to Java"));
	System.out.println(lib.issueBook());
 }
}
