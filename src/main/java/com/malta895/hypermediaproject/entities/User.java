package com.malta895.hypermediaproject.entities;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Date;


@Table(name = "`user`")
@Entity
@EntityListeners(AuditingEntityListener.class)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id", nullable = false)
    private Long id;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "surname")
    private String surname;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "birth_date", nullable = false)
    private Date birthDate;


    @JoinColumn(name = "address")
    @ManyToOne
    private Address address;

    public Date getBirthDate() {
        return birthDate;
    }


    public Address getAddress() {
        return address;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void setSurname(String lastName) {
        this.surname = lastName;
    }

    public String getSurname() {
        return surname;
    }


    public Long getId() {
        return id;
    }

}
