package com.qa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Arsenal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String pName;
    private String pPosition;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpPosition() {
        return pPosition;
    }

    public void setpPosition(String pPosition) {
        this.pPosition = pPosition;
    }


@Override
public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Arsenal arsenal = (Arsenal) o;
        return id.equals(arsenal.id) &&
                pName.equals(arsenal.pName) &&
                pPosition.equals(arsenal.pName);
}

@Override
public int hashCode() { return Objects.hash(id, pName, pPosition); }

}

