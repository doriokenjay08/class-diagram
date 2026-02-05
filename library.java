import java.util.ArrayList;
public class Library {
 public String libraryName;
 public ArrayList<Book> books;
 public Library(String libraryName) {
 this.libraryName = libraryName;
 this.books = new ArrayList<>(); // composition
 }

public void addBook(Book book) {
 books.add(book);
 }
 public void borrowBook(int bookId, Member member) {
 for (Book b : books) {
 if (b.getBookId() == bookId) {
 member.borrowBook(b); // aggregation
 return;
     }
   }
 }

public String generateReport() {
 String output = identify() + "\n";
 for (Book b : books) {
 output += b.getDetails() + "\n";
 }
 return output;
 }
 public String identify() {
 return "I am the Library class. I manage books and the borrowing process.";
 }
}



