package com.ipesa.punto_venta.warehouse.supplier.domain.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "proveedores")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre", length = 100, nullable = false)
    @NotEmpty
    private String name;

    @Column(name = "direccion", length = 200, nullable = false)
    @NotEmpty
    private String address;

    @Column(name = "telefono_1", length = 10, nullable = false)
    @NotEmpty
    private String phone1;

    @Column(name = "telefono_2", length = 10, nullable = true)
    @NotEmpty
    private String phone2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Supplier() {}

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

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    @Override
    public String toString() {
        return "Suppliers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone_1='" + phone1 + '\'' +
                ", phone_2='" + phone2 + '\'' +
                '}';
    }
}
