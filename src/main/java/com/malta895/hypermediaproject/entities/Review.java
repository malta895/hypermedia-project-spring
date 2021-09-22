package com.malta895.hypermediaproject.entities;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Table(name = "review", indexes = {
        @Index(name = "user_book_unique", columnList = "user, book", unique = true)
})
@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id", nullable = false)
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "`user`", nullable = false)
    private User user;

    @Column(name = "title")
    private String title;

    @Lob
    @Column(name = "text")
    private String text;

    @Column(name = "rating", nullable = false)
    private Integer rating;

    @ManyToOne(optional = false)
    @JoinColumn(name = "book", nullable = false)
    private Book book;

    @Column(name = "date_published", nullable = false)
    private OffsetDateTime datePublished;

    public OffsetDateTime getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(OffsetDateTime datePublished) {
        this.datePublished = datePublished;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}