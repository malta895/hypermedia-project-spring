package com.malta895.hypermediaproject.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class CartItem {

    @EmbeddedId
    private CartItemKey id;

    @JoinColumn(name = "book")
    @MapsId("bookId")
    @ManyToOne
    private Book book;

    @JoinColumn(name = "cart")
    @MapsId("cartId")
    @ManyToOne
    private Cart cart;

    private Integer quantity;

    public CartItemKey getId() {
        return id;
    }

    public void setId(CartItemKey id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
