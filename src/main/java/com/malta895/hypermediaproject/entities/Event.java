package com.malta895.hypermediaproject.entities;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Table(name = "event")
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_id", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "location")
    private Address location;

    @ManyToOne
    @JoinColumn(name = "book")
    private Book book;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "date_time", nullable = false)
    private OffsetDateTime dateTime;

    public OffsetDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(OffsetDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Address getLocation() {
        return location;
    }

    public void setLocation(Address location) {
        this.location = location;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}