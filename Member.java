/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author drinc
 */
public class Member {

    public int memberId;
    public String name;

    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.borrow();
        }
    }

    public String identify() {
        return "I am the Member class. I represent a library user who borrows books.";
    }
}