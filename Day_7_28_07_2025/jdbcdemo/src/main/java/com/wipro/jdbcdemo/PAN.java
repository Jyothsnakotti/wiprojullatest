package com.wipro.jdbcdemo;

import javax.persistence.*;

@Entity
@Table(name = "PAN")
public class PAN {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="panholderName")
    private String panholderName;

    @Column(name="panNumber", unique=true)
    private String panNumber;

    public PAN() {}

    public PAN(String panholderName, String panNumber) {
        this.panholderName = panholderName;
        this.panNumber = panNumber;
    }

    // Getters and Setters
    public int getId() { return id; }
    public String getPanholderName() { return panholderName; }
    public void setPanholderName(String panholderName) { this.panholderName = panholderName; }

    public String getPanNumber() { return panNumber; }
    public void setPanNumber(String panNumber) { this.panNumber = panNumber; }
}