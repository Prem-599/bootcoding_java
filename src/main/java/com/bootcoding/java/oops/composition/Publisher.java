package com.bootcoding.java.oops.composition;

public class Publisher {
    String publishName;
     String publishDate;

    public String getPublishName() {
        return publishName;
    }

    public void setPublishName(String publishName) {
        this.publishName = publishName;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public void Date(){
         System.out.println("print publisher date :- "+ publishName +"  " + publishDate);
     }
}
