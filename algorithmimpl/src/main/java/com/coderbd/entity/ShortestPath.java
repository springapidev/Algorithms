package com.coderbd.entity;

import javax.persistence.*;

@Entity
@Table(name = "shortest_path")
public class ShortestPath {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String source;
    private String destination;
    private double distanceKm;
    private double fareAmount;

    @ManyToOne
    @JoinColumn(name = "parent_id", referencedColumnName = "id")
    private ShortestPath shortestPath;

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

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    public void setDistanceKm(double distanceKm) {
        this.distanceKm = distanceKm;
    }

    public ShortestPath getShortestPath() {
        return shortestPath;
    }

    public void setShortestPath(ShortestPath shortestPath) {
        this.shortestPath = shortestPath;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getFareAmount() {
        return fareAmount;
    }

    public void setFareAmount(double fareAmount) {
        this.fareAmount = fareAmount;
    }
}
