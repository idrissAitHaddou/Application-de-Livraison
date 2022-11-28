package com.example.livraisonsmypack.product;

import com.example.livraisonsmypack.coli.Colis;
import com.example.livraisonsmypack.command.Products_command;
import com.example.livraisonsmypack.user.Drivers;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Products {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    @Basic
    private Long id;
    @Column(name = "status")
    @Basic
    private boolean status;
    @Column(name = "name")
    @Basic
    private String name;
    @Column(name = "descritpion")
    @Basic
    private String descritpion;
    @Column(name = "price")
    @Basic
    private double price;
    @Column(name = "qauntity")
    @Basic
    private int qauntity;
    @Column(name = "point")
    @Basic
    private int point;
    @Column(name = "image")
    @Basic
    private String image;
    @OneToOne
    @JoinColumn(name = "id_quantity", referencedColumnName = "id")
    private Products_quantity productsQuantity;

    @OneToOne
    @JoinColumn(name = "id_coli", referencedColumnName = "id")
    private Colis colis;

    @OneToOne
    @JoinColumn(name = "id_product_command", referencedColumnName = "id")
    private Products_command productsCommand;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescritpion() {
        return descritpion;
    }

    public void setDescritpion(String descritpion) {
        this.descritpion = descritpion;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQauntity() {
        return qauntity;
    }

    public void setQauntity(int qauntity) {
        this.qauntity = qauntity;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    public Products_quantity getProductsQuantity() {
        return productsQuantity;
    }

    public void setProductsQuantity(Products_quantity productsQuantity) {
        this.productsQuantity = productsQuantity;
    }

    public Colis getColis() {
        return colis;
    }

    public void setColis(Colis colis) {
        this.colis = colis;
    }

    public Products_command getProductsCommand() {
        return productsCommand;
    }

    public void setProductsCommand(Products_command productsCommand) {
        this.productsCommand = productsCommand;
    }

}
