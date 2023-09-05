package models;

import java.util.LinkedList;

public class Book extends Base{
    public String title;
    public String author;
    public String isbn;
    public LinkedList<User> users = new LinkedList<User>();
    public Integer quantity = 0;


    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public LinkedList<User> getUsers() {
        return this.users;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void addQuantity(Integer quantity) {
        this.quantity += quantity;
    }

    public void removeQuantity(Integer quantity) {
        this.quantity -= quantity;
    }

    public void setUsers(LinkedList<User> users) {
        this.users = users;
    }

    public void enqueueUser(User user) {
        this.users.add(user);
    }

    public User dequeueUser() {
        return this.users.removeFirst();
    }

    public LinkedList<User> getWaitingList() {
        return (LinkedList<User>) this.users.subList(quantity, this.users.size());
    }

    public LinkedList<User> getBorrowedList() {
        return (LinkedList<User>) this.users.subList(0, quantity);
    }

    public String toString() {
        return "Title: " + this.title + "\nAuthor: " + this.author + "\nISBN: " + this.isbn + "\nQuantity: " + this.quantity;
    }
}
