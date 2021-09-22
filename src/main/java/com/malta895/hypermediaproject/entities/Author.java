package com.malta895.hypermediaproject.entities;

import com.sun.source.tree.LambdaExpressionTree;

import javax.persistence.*;
import java.util.List;

@Table(name = "author")
@Entity
public class Author {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    private String name;


    @Basic(fetch = FetchType.LAZY)
    @Lob
    private String biography;

    public String getName() {
        return name;
    }

    @ManyToMany
    @JoinTable(name = "author_book", joinColumns = {@JoinColumn(name = "author")},
            inverseJoinColumns = {@JoinColumn(name = "book")})
    private List<Book> books;

    public String getBiography() {
        return biography;
    }

    public void setId(Long id) {
        this.id = id;
    }
}