package com.wipro.hibernatedemo;

import javax.persistence.*;

@Entity
@Table(name = "PAN")
public class PAN {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String panholderName;

    @Column(unique = true)
    private String panNumber;

    public PAN() {} // Default constructor required by Hibernate

    public PAN(String panholderName, String panNumber) {
        this.panholderName = panholderName;
        this.panNumber = panNumber;
    }

    // Getters and setters
    public int getId() { return id; }
    public String getPanholderName() { return panholderName; }
    public void setPanholderName(String panholderName) { this.panholderName = panholderName; }
    public String getPanNumber() { return panNumber; }
    public void setPanNumber(String panNumber) { this.panNumber = panNumber; }
}