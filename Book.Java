public class Book {
 public int bookId;
 public String

public String author;
 public boolean available;
 public Book(int bookId, String title, String author) {
 this.bookId = bookId;
 this.title = title;
 this.author = author;
 this.available = true;
 
}
 public int getBookId() {
 return bookId;

}
 public boolean isAvailable() {
 return available;
 
}
 public void borrow() {

 available = false;
 }
 public String getDetails() {
 return bookId + " | " + title + " | " + author + " | Available: " + available;
 }
 public String identify() {
 return "I am the Book class. I store information about a library book.";

}

}
