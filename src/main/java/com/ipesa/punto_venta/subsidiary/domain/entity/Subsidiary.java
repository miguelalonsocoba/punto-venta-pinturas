package com.ipesa.punto_venta.subsidiary.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.sql.Date;

@Entity
@Table(name = "sucursales")
public class Subsidiary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre", length = 20, nullable = false)
    @NotEmpty
    private String name;

    @Column(name = "direccion", length = 80, nullable = false)
    @NotEmpty
    private String address;

    @Column(name = "telefono", length = 10, nullable = false)
    @NotEmpty
    @Size(min = 10, max = 10)
    private String phone;

    @Column(name = "fecha_creacion", nullable = false)
    private Date dateOfCreation;

    public Subsidiary() {}

    public Subsidiary(Integer id, String name, String address, String phone, Date dateOfCreation) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.dateOfCreation = dateOfCreation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    @Override
    public String toString() {
        return "Subsidiary{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", dateOfCreation=" + dateOfCreation +
                '}';
    }
}
