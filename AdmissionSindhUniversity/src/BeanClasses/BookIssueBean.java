package BeanClasses;

import java.util.Date;

public class BookIssueBean extends StudentBean{

    private int count;
    private int studentId;
    private int bookId;
    private int bookIssueId;
    private Date dateOfIssue;
    private Date dateOfReturn;
    private int fine;
    private String remarks;
    private String bookName;
    private String author;

    public String getBookName() {
        return bookName;
    }

     public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
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
    
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getBookIssueId() {
        return bookIssueId;
    }

    public void setBookIssueId(int bookIssueId) {
        this.bookIssueId = bookIssueId;
    }

    public Date getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(Date dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public Date getDateOfReturn() {
        return dateOfReturn;
    }

    public void setDateOfReturn(Date dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return Decoder.getDateFormat(dateOfIssue);
    }
    
    
}
