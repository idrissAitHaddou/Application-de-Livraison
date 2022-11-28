package com.example.livraisonsmypack.product;

import com.example.livraisonsmypack.user.Drivers;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Products_quantity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Basic
    private Long id;
    @Column(name = "quantity")
    @Basic
    private int quantity;

    @OneToOne
    @JoinColumn(name = "id_product", referencedColumnName = "id")
    private Products products;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

}
