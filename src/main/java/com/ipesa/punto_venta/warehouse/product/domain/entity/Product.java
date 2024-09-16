package com.ipesa.punto_venta.warehouse.product.domain.entity;

import com.ipesa.punto_venta.warehouse.brand.domain.entities.Brand;
import com.ipesa.punto_venta.warehouse.supplier.domain.entities.Supplier;
import com.ipesa.punto_venta.warehouse.type_product.domain.entities.ProductType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.aspectj.apache.bcel.classfile.Module;

import java.util.Date;

@Entity
@Table(name = "productos")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre", length = 100, nullable = false)
    @NotEmpty
    private String name;

    @Column(name = "existencias", nullable = false)
    @NotNull
    private Integer stocks;

    @Column(name = "cantidad_minima", nullable = false)
    @NotNull
    private Integer minimumAmount;

    @Column(name = "fecha_creacion", nullable = false)
    private Date dateOfCreation;

    @Column(name = "costo_unitario", nullable = false)
    @NotNull
    private Double unitCost;

    @Column(name = "precio_unitario", nullable = false)
    @NotNull
    private Double unitPrice;

    @OneToOne
    @JoinColumn(name = "id_proveedor")
    private Supplier supplier;

    @OneToOne
    @JoinColumn(name = "id_marca")
    private Brand brand;

    @OneToOne
    @JoinColumn(name = "id_tipo_producto")
    private ProductType productType;

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

    public Integer getStocks() {
        return stocks;
    }

    public void setStocks(Integer stocks) {
        this.stocks = stocks;
    }

    public Integer getMinimumAmount() {
        return minimumAmount;
    }

    public void setMinimumAmount(Integer minimumAmount) {
        this.minimumAmount = minimumAmount;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public Double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(Double unitCost) {
        this.unitCost = unitCost;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stocks=" + stocks +
                ", minimumAmount=" + minimumAmount +
                ", dateOfCreation=" + dateOfCreation +
                ", unitCost=" + unitCost +
                ", unitPrice=" + unitPrice +
                ", supplier=" + supplier +
                ", brand=" + brand +
                ", productType=" + productType +
                '}';
    }
}
