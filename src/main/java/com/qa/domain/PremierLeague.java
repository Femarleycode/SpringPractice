package com.qa.domain;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class PremierLeague {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy = "premierLeague", fetch = FetchType.LAZY)
    private List<Arsenal> arsenal = new ArrayList<>();

    public PremierLeague() {
    }

    public PremierLeague(String name) { this.name = name; }

    public Long getId()  { return id; }

    public void setId(Long id) { this.id = id; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Arsenal> getArsenal() {
        return arsenal;
    }

    public void setArsenal(List<Arsenal> arsenal) {
        this.arsenal = arsenal;
    }
}