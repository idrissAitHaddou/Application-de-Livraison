package com.example.livraisonsmypack.car;

import com.example.livraisonsmypack.user.Drivers;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Cars {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Id
    @Basic
    private Long id;
    @Column(name = "name")
    @Basic
    private String name;
    @Column(name = "type")
    @Basic
    private String type;
    @Column(name = "number")
    @Basic
    private String number;

    @OneToMany
    @JoinColumn(name = "id_driver", referencedColumnName = "id")
    private List<Drivers> drivers;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<Drivers> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<Drivers> drivers) {
        this.drivers = drivers;
    }
}
