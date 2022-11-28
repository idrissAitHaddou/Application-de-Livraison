package com.example.livraisonsmypack.command;

import com.example.livraisonsmypack.product.Products;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Commands {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Basic
    private Long id;
    @Column(name = "city")
    @Basic
    private String city;
    @Column(name = "adress")
    @Basic
    private String adress;
    @Column(name = "email")
    @Basic
    private String email;
    @Column(name = "phone_client")
    @Basic
    private String phone_client;
    @Column(name = "created_at")
    @Basic
    private String created_at;

    @OneToMany
    @JoinColumn(name = "id_product_command", referencedColumnName = "id")
    private List<Products_command> productsCommands;

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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_client() {
        return phone_client;
    }

    public void setPhone_client(String phone_client) {
        this.phone_client = phone_client;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public List<Products_command> getProductsCommands() {
        return productsCommands;
    }

    public void setProductsCommands(List<Products_command> productsCommands) {
        this.productsCommands = productsCommands;
    }
}
