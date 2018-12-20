package com.coderbd.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "shortest_path_result")
public class ShortestPathResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String source;
    private String destinations;
    private double shortestDistanceKm;
    private double totalFare;

    @Temporal(TemporalType.TIMESTAMP)
    private Date calculationDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestinations() {
        return destinations;
    }

    public void setDestinations(String destinations) {
        this.destinations = destinations;
    }

    public double getShortestDistanceKm() {
        return shortestDistanceKm;
    }

    public void setShortestDistanceKm(double shortestDistanceKm) {
        this.shortestDistanceKm = shortestDistanceKm;
    }

    public double getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(double totalFare) {
        this.totalFare = totalFare;
    }

    public Date getCalculationDate() {
        return calculationDate;
    }

    public void setCalculationDate(Date calculationDate) {
        this.calculationDate = calculationDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
