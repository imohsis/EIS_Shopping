package com.example.secure.domain;

public class Book {
    private long id;
    private String title;
    private String author;
    private String coverPhotoURL;
    private Long isbnNumber;
    private Double price;
    private String language;

    public Book() {
    }

    public Book(long id, String title, String author, String coverPhotoURL, Long isbnNumber, Double price, String language) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.coverPhotoURL = coverPhotoURL;
        this.isbnNumber = isbnNumber;
        this.price = price;
        this.language = language;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCoverPhotoURL() {
        return coverPhotoURL;
    }

    public void setCoverPhotoURL(String coverPhotoURL) {
        this.coverPhotoURL = coverPhotoURL;
    }

    public Long getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(Long isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", coverPhotoURL='" + coverPhotoURL + '\'' +
                ", isbnNumber=" + isbnNumber +
                ", price=" + price +
                ", language='" + language + '\'' +
                '}';
    }
}
