package com.example.livraisonsmypack.coli;

import com.example.livraisonsmypack.product.Products;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Colis {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    @Basic
    private Long id;
    @Column(name = "city")
    @Basic
    private String city;
    @Column(name = "status")
    @Basic
    private boolean status;
    @Column(name = "reference")
    @Basic
    private String reference;
    @Column(name = "price_total")
    @Basic
    private double price_total;
    @Column(name = "phone_client")
    @Basic
    private String phone_client;
    @Column(name = "adress_client")
    @Basic
    private String adress_client;
    @Column(name = "max_date")
    @Basic
    private String max_date;

    @OneToMany
    @JoinColumn(name = "id_product", referencedColumnName = "id")
    private List<Products> products;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public double getPrice_total() {
        return price_total;
    }

    public void setPrice_total(double price_total) {
        this.price_total = price_total;
    }

    public String getPhone_client() {
        return phone_client;
    }

    public void setPhone_client(String phone_client) {
        this.phone_client = phone_client;
    }

    public String getAdress_client() {
        return adress_client;
    }

    public void setAdress_client(String adress_client) {
        this.adress_client = adress_client;
    }

    public String getMax_date() {
        return max_date;
    }

    public void setMax_date(String max_date) {
        this.max_date = max_date;
    }
}
