package com.malta895.hypermediaproject.entities;

import javax.persistence.*;
import java.util.List;

@Table(name = "cart")
@Entity
public class Cart {
    @Id
    @Column(name = "cart_id", nullable = false)
    private Long id;

    @JoinColumn(name = "`user`")
    @ManyToOne
    private User user;

    @OneToMany(fetch = FetchType.EAGER, orphanRemoval = true, mappedBy = "cart")
    private List<CartItem> cartItems;

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }


    public User getUser() {
        return user;
    }

    @Column(nullable = false)
    private Boolean ordered = false;

    public Boolean getOrdered() {
        return ordered;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}