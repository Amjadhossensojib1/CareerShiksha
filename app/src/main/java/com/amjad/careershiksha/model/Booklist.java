package com.amjad.careershiksha.model;

public class Booklist {
    private String bookImage;
    private String bookName;
    private int pdfResId;

    public Booklist(String bookImage, String bookName, int pdfResId) {
        this.bookImage = bookImage;
        this.bookName  = bookName;
        this.pdfResId  = pdfResId;
    }

    public String getBookImage() {
        return bookImage;
    }
    public String getBookName()  {
        return bookName;
    }
    public int getPdfResId()  {
        return pdfResId;
    }
}