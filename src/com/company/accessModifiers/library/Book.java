package com.company.accessModifiers.library;

import java.util.Scanner;

public class Book {

    Scanner scan = new Scanner(System.in);
    private String author;
    private String title;
    private int pageCount;
    private String giftedBy;
    private String pressmark;
    private boolean needsRepair;

    public Book(String author, String title, int pageCount, String giftedBy, boolean needsRepair) {
        this.author = author;
        this.title = title;
        this.pageCount = pageCount;
        this.giftedBy = giftedBy;
        generatePressMark();
        this.needsRepair = needsRepair;
    }

    public Book() {

    }

    protected void setNeedsRepair(boolean needsRepair) {
        this.needsRepair = needsRepair;
    }

    void setGiftedBy(String giftedBy) {
        this.giftedBy = giftedBy;
    }

    public void setAuthor(String author) {
        this.author = author;
        generatePressMark();
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
        generatePressMark();
    }

    public void setTitle(String title) {
        this.title = title;
        generatePressMark();
    }

    public boolean setNeedsRepair() {
        return this.needsRepair;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getAuthor() {
        return author;
    }

    String getGiftedBy() {
        return giftedBy;
    }

    public String getPressMark() {
        return pressmark;
    }

    public String getTitle() {
        return title;
    }

    protected boolean getNeedsRepair() {
        return this.needsRepair;
    }

    public void generatePressMark() {
        this.pressmark = this.author + this.title + this.pageCount;
    }

    @Override
    public String toString() {
        String message = "Информация о книге: " + "\n" +
            "Автор: " + this.author + "\n" +
                "Наименование: " + this.title + "\n" +
                "Количество страниц: " + this.title + "\n" +
                "Кем подарен: " + this.title + "\n" +
                "Шифр: " + this.title + "\n" +
                "Нуждается ли в реставрации: ";
        if (getNeedsRepair()) message += "да";
        else message += "нет";
        return message;
    }
}
