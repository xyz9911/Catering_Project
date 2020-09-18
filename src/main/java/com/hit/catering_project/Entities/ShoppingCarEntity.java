package com.hit.catering_project.Entities;

import javax.persistence.*;

@Entity
@Table(name = "shopping_car", schema = "catering_system", catalog = "")
public class ShoppingCarEntity {
    private int carid;
    private int sid;
    private int did;
    private int snum;

    @Id
    @Column(name = "CARID")
    public int getCarid() {
        return carid;
    }

    public void setCarid(int carid) {
        this.carid = carid;
    }

    @Basic
    @Column(name = "SID")
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    @Basic
    @Column(name = "DID")
    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    @Basic
    @Column(name = "SNUM")
    public int getSnum() {
        return snum;
    }

    public void setSnum(int snum) {
        this.snum = snum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShoppingCarEntity that = (ShoppingCarEntity) o;

        if (carid != that.carid) return false;
        if (sid != that.sid) return false;
        if (did != that.did) return false;
        if (snum != that.snum) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = carid;
        result = 31 * result + sid;
        result = 31 * result + did;
        result = 31 * result + snum;
        return result;
    }
}
