package com.example.productapp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String productName;
    private String productMake;
    private double productPrice;

    public Product() {}

    public Product(Integer id, String productName, String productMake, double productPrice) {
        this.id = id;
        this.productName = productName;
        this.productMake = productMake;
        this.productPrice = productPrice;
    }

    // Getters and setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }
    public String getProductMake() { return productMake; }
    public void setProductMake(String productMake) { this.productMake = productMake; }
    public double getProductPrice() { return productPrice; }
    public void setProductPrice(double productPrice) { this.productPrice = productPrice; }
}
