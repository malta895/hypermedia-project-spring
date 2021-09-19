package com.malta895.hypermediaproject.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CartItemKey implements Serializable {

    @Column(name = "book", nullable = false)
    Long bookId;

    @Column(name = "cart", nullable = false)
    Long cartId;

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Long getCartId() {
        return cartId;
    }

    public void setCartId(Long courseId) {
        this.cartId = courseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CartItemKey)) return false;
        CartItemKey that = (CartItemKey) o;
        return bookId.equals(that.bookId) && cartId.equals(that.cartId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, cartId);
    }
}