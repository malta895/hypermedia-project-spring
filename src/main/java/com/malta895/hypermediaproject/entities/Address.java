package com.malta895.hypermediaproject.entities;

import javax.persistence.*;
import java.util.List;

@Table(name = "address")
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "address_id", nullable = false)
    private Long id;

    private String firstName;

    private String lastName;
    @Column(nullable = false)
    private String streetLine1;

    private String streetLine2;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(nullable = false)
    private String zipCode;

    private String province;

    @Column(nullable = false)
    private String country;

    private Double latitude;

    private Double longitude;

    @OneToMany(mappedBy = "address")
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setStreetLine2(String streetLine2) {
        this.streetLine2 = streetLine2;
    }

    public String getStreetLine2() {
        return streetLine2;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public void setStreetLine1(String streetLine1) {
        this.streetLine1 = streetLine1;
    }

    public String getStreetLine1() {
        return streetLine1;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }


    public Long getId() {
        return id;
    }
}