package com.example.livraisonsmypack.agency;

import com.example.livraisonsmypack.user.Drivers;
import com.example.livraisonsmypack.user.Managers;
import jakarta.annotation.Generated;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Agencies {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    @Basic
    private Long id;
    @Column(name = "city")
    @Basic
    private String city;
    @Column(name = "location_map")
    @Basic
    private String location_map;
    @Column(name = "adress")
    @Basic
    private String adress;

    @OneToMany
    @JoinColumn(name = "id_manager", referencedColumnName = "id")
    private List<Managers> managers;

    @OneToMany
    @JoinColumn(name = "id_driver", referencedColumnName = "id")
    private List<Drivers> drivers;

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

    public String getLocation_map() {
        return location_map;
    }

    public void setLocation_map(String location_map) {
        this.location_map = location_map;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
