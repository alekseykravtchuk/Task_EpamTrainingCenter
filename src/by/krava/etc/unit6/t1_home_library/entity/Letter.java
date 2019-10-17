package by.krava.etc.unit6.t1_home_library.entity;

import by.krava.etc.unit6.t1_home_library.util.Email;

public class Letter {
    private Email recipient;
    private Email sender;
    private Book book;
    private String message;

    public Letter(Email recipient, Email sender, Book book) {
        this.recipient = recipient;
        this.sender = sender;
        this.book = book;
        this.message = "";
    }

    public Email getRecipient() {
        return recipient;
    }

    public void setRecipient(Email recipient) {
        this.recipient = recipient;
    }

    public Email getSender() {
        return sender;
    }

    public void setSender(Email sender) {
        this.sender = sender;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean sendLetter() {
        return true;
    }

    @Override
    public String toString() {
        return "Letter{" +
                "recipient='" + recipient + '\'' +
                ", sender='" + sender + '\'' +
                ", book=" + book +
                ", message='" + message + '\'' +
                '}';
    }
}
