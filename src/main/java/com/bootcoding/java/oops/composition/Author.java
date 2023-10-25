package com.bootcoding.java.oops.composition;

public class Author {
    String authorName;
    String Date;
    String authorSignature;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getAuthorSignature() {
        return authorSignature;
    }

    public void setAuthorSignature(String authorSignature) {
        this.authorSignature = authorSignature;
    }

    public void print(){
        System.out.println("Print details of author "+ authorName+ Date +"  "+ authorSignature);
    }

}
