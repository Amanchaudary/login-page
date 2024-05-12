package com.aman.aman.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class alien {

    // database ma alien name ko table banxa
    @Id
    private int aid;
    private int aname;
    public int getAid() {
        return aid;
    }
    public void setAid(int aid) {
        this.aid = aid;
    }
    public int getAname() {
        return aname;
    }
    public void setAname(int aname) {
        this.aname = aname;
    }
    @Override
    public String toString() {
        return "aman [aid=" + aid + ", aname=" + aname + "]";
    }
}
