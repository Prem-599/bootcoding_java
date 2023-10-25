package com.bootcoding.java.oops.composition;

public class Book {
    String bookName;
    double price;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printData(){
       Author author=new Author();
       Publisher publisher=new Publisher();
       Book book=new Book();

        author.setAuthorName("Ravindranath Tagore");
        System.out.println(author.getAuthorName());
        author.setDate("12-2-2009");
        System.out.println(author.getDate());
        author.setAuthorSignature("R.tagore");
        System.out.println(author.getAuthorSignature());
        author.print();

        publisher.setPublishName("National Book trust");
        System.out.println(publisher.getPublishName());
        publisher.setPublishDate("23-2-2009");
        System.out.println(publisher.getPublishDate());
        publisher.Date();

        book.setBookName("Geetanjali");
        System.out.println(book.getBookName());
        book.setPrice(99.90);
        System.out.println(book.getPrice());

    }


}
