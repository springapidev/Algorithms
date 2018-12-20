package com.coderbd.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Bmi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double height;
    private double weight;
    private double needToReduceWeight;
    private double needToIncreaseWeight;
    private double bmiScore;
    private String status;
    @Temporal(TemporalType.TIMESTAMP)
    private Date measureDate;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBmiScore() {
        return bmiScore;
    }

    public void setBmiScore(double bmiScore) {
        this.bmiScore = bmiScore;
    }

    public double getNeedToReduceWeight() {
        return needToReduceWeight;
    }

    public void setNeedToReduceWeight(double needToReduceWeight) {
        this.needToReduceWeight = needToReduceWeight;
    }

    public double getNeedToIncreaseWeight() {
        return needToIncreaseWeight;
    }

    public void setNeedToIncreaseWeight(double needToIncreaseWeight) {
        this.needToIncreaseWeight = needToIncreaseWeight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getMeasureDate() {
        return measureDate;
    }

    public void setMeasureDate(Date measureDate) {
        this.measureDate = measureDate;
    }
}
