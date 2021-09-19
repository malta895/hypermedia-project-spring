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

     @ManyToOne
    private Publisher publisher;

     @OneToMany(fetch = FetchType.EAGER, orphanRemoval = true, mappedBy = "book")
     private List<CartItem> cartItems;

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