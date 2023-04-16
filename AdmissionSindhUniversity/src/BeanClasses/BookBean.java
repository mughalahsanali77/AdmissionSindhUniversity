package BeanClasses;

import java.util.Date;

public class BookBean {

    private int dptId;
    private int bookId;
    private String bookName;
    private String author;
    private String editor;
    private String editionVolume;
    private String yearOfPublishing;
    private int quantity;
    private int isbn;
    private int accessNo;
    private String purchaseFrom;
    private int price;
    private int pages;
    private Date purchaseDate;
    private String bookCategory;
    private String language;
    private String remarks;

    public int getDptId() {
        return dptId;
    }

    public void setDptId(int dptId) {
        this.dptId = dptId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getEditionVolume() {
        return editionVolume;
    }

    public void setEditionVolume(String editionVolume) {
        this.editionVolume = editionVolume;
    }

    public String getYearOfPublish() {
        return yearOfPublishing;
    }

    public void setYearOfPublish(String yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getAccessNo() {
        return accessNo;
    }

    public void setAccessNo(int accessNo) {
        this.accessNo = accessNo;
    }

    public String getPurchaseFrom() {
        return purchaseFrom;
    }

    public void setPurchaseFrom(String purchaseFrom) {
        this.purchaseFrom = purchaseFrom;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return bookName;
    }

    
    
}
