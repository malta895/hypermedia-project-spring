 package com.malta895.hypermediaproject.entities;

import javax.persistence.*;
import java.util.List;

 @Table(name = "book")
@Entity
public class Book {

    @Id
    @Column(name = "book_id", nullable = false)
    private Long id;

    private String isbn;

    private String title;

    private Double price;

    private String priceCurrency;

    @ManyToMany
    @JoinTable(name = "similar_book", joinColumns = {@JoinColumn(name = "book1")},
            inverseJoinColumns = {@JoinColumn(name = "book2")})
    private List<Book> relatedBooks;

    @ManyToMany
    private List<Author> authors;

    @ManyToMany
    @JoinTable(name = "book_genre", joinColumns = {@JoinColumn(name = "book")},
            inverseJoinColumns = {@JoinColumn(name = "genre")})
    private List<Genre> genres;

     @ManyToMany
     @JoinTable(name = "book_theme", joinColumns = {@JoinColumn(name = "book")},
             inverseJoinColumns = {@JoinColumn(name = "theme")})
     private List<Theme> themes;

    @ManyToOne
    private Publisher publisher;

    @OneToMany(fetch = FetchType.EAGER, orphanRemoval = true, mappedBy = "book")
    private List<CartItem> cartItems;

    @OneToMany(orphanRemoval = true, mappedBy = "book")
    private List<Review> reviews;

     public void setIsbn(String isbn) {
         this.isbn = isbn;
     }

     public void setTitle(String title) {
         this.title = title;
     }

     public void setPrice(Double price) {
         this.price = price;
     }

     public void setPriceCurrency(String priceCurrency) {
         this.priceCurrency = priceCurrency;
     }

     public void setRelatedBooks(List<Book> relatedBooks) {
         this.relatedBooks = relatedBooks;
     }

     public List<Author> getAuthors() {
         return authors;
     }

     public void setAuthors(List<Author> authors) {
         this.authors = authors;
     }

     public List<Genre> getGenres() {
         return genres;
     }

     public void setGenres(List<Genre> genres) {
         this.genres = genres;
     }

     public List<Theme> getThemes() {
         return themes;
     }

     public void setThemes(List<Theme> themes) {
         this.themes = themes;
     }

     public void setPublisher(Publisher publisher) {
         this.publisher = publisher;
     }

     public List<CartItem> getCartItems() {
         return cartItems;
     }

     public void setCartItems(List<CartItem> cartItems) {
         this.cartItems = cartItems;
     }

     public List<Review> getReviews() {
         return reviews;
     }

     public void setReviews(List<Review> reviews) {
         this.reviews = reviews;
     }

     public List<Book> getRelatedBooks() {
         return relatedBooks;
     }

     public Publisher getPublisher() {
         return publisher;
     }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

    public String getPriceCurrency() {
        return priceCurrency;
    }

}