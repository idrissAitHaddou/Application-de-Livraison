package com.example.livraisonsmypack.command;

import com.example.livraisonsmypack.product.Products;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Products_command {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Basic
    private Long id;
    @Column(name = "id_command")
    @Basic
    private int id_command;
    @Column(name = "id_product")
    @Basic
    private int id_product;

    @OneToMany
    @JoinColumn(name = "id_product", referencedColumnName = "id")
    private List<Products> products;

    @OneToOne
    @JoinColumn(name = "id_command", referencedColumnName = "id", insertable = false, updatable = false)
    private Commands commands;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public int getId_command() {
        return id_command;
    }

    public void setId_command(int id_command) {
        this.id_command = id_command;
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }
}
