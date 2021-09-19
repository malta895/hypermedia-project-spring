package com.malta895.hypermediaproject.entities;

import javax.persistence.*;

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

    public String getBiography() {
        return biography;
    }

    public void setId(Long id) {
        this.id = id;
    }
}