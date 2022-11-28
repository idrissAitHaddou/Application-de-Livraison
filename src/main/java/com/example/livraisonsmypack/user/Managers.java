package com.example.livraisonsmypack.user;

import com.example.livraisonsmypack.agency.Agencies;
import jakarta.persistence.*;

@Entity
public class Managers {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    @Basic
    private Long id;
    @Column(name = "firstname")
    @Basic
    private String firstname;
    @Column(name = "lastname")
    @Basic
    private String lastname;
    @Column(name = "email")
    @Basic
    private String email;
    @Column(name = "password")
    @Basic
    private String password;
    @Column(name = "phone_number")
    @Basic
    private String phone_number;
    @Column(name = "image")
    @Basic
    private String image;
    @OneToOne
    @JoinColumn(name = "id_agency", referencedColumnName = "id")
    private Agencies agencies;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Agencies getAgencies() {
        return agencies;
    }

    public void setAgencies(Agencies agencies) {
        this.agencies = agencies;
    }
}
