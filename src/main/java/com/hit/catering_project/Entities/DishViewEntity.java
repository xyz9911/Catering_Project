package com.hit.catering_project.Entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "dish_view", schema = "catering_system", catalog = "")
public class DishViewEntity {
    private int did;
    private String dname;
    private BigDecimal dprice;
    private byte davailability;
    private String wname;
    private int wid;

    @Basic
    @Id
    @Column(name = "DID")
    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    @Basic
    @Column(name = "DNAME")
    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Basic
    @Column(name = "DPRICE")
    public BigDecimal getDprice() {
        return dprice;
    }

    public void setDprice(BigDecimal dprice) {
        this.dprice = dprice;
    }

    @Basic
    @Column(name = "DAVAILABILITY")
    public byte getDavailability() {
        return davailability;
    }

    public void setDavailability(byte davailability) {
        this.davailability = davailability;
    }

    @Basic
    @Column(name = "WNAME")
    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    @Basic
    @Column(name = "WID")
    public int getWid() {
        return wid;
    }

    public void setWid(int wid) {
        this.wid = wid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DishViewEntity that = (DishViewEntity) o;

        if (did != that.did) return false;
        if (davailability != that.davailability) return false;
        if (wid != that.wid) return false;
        if (dname != null ? !dname.equals(that.dname) : that.dname != null) return false;
        if (dprice != null ? !dprice.equals(that.dprice) : that.dprice != null) return false;
        if (wname != null ? !wname.equals(that.wname) : that.wname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = did;
        result = 31 * result + (dname != null ? dname.hashCode() : 0);
        result = 31 * result + (dprice != null ? dprice.hashCode() : 0);
        result = 31 * result + (int) davailability;
        result = 31 * result + (wname != null ? wname.hashCode() : 0);
        result = 31 * result + wid;
        return result;
    }
}
