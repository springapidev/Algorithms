package com.coderbd.quiz19.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "level")
public class Level {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    @ManyToOne
    @JoinColumn(name = "cat_id")
    private Category category;

    @OneToMany(mappedBy = "level", cascade = CascadeType.ALL)
    private Set<Question> quiestions;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Set<Question> getQuiestions() {
        return quiestions;
    }

    public void setQuiestions(Set<Question> quiestions) {
        this.quiestions = quiestions;
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

    @Override
    public String toString() {
        return "Level{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
