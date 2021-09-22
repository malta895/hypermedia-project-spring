package com.malta895.hypermediaproject.entities;

import javax.persistence.*;
import java.util.List;

@Table(name = "publisher")
@Entity
public class Publisher {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @JoinColumn(name = "hq_location")
    @ManyToOne
    private Address hqLocation;

    @OneToMany(mappedBy = "publisher")
    private List<Book> books;

    private String name;

    public List<Book> getBooks() {
        return books;
    }

    public String getName() {
        return name;
    }

    public Address getHqLocation() {
        return hqLocation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}