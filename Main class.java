Main Class
public class Main {
public static void main(String[] args) {
Library library = new Library("City Library");
Member member = new Member(1, "Alex");
library.addBook(new Book(101, "Java Basics", "Deitel"));
library.addBook(new Book(102, "Clean Code", "Robert Martin"));
library.borrowBook(101, member);
System.out.println(library.generateReport());
}
}
