package com.hit.catering_project.Entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "dish", schema = "catering_system", catalog = "")
public class DishEntity {
    private int did;
    private int wid;
    private String dname;
    private BigDecimal dprice;
    private byte davailability;
    private byte isdelete;
    private byte dhasproperty;
    private String ddesc;
    private String dimage;

    @Id
    @Column(name = "DID")
    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    @Basic
    @Column(name = "WID")
    public int getWid() {
        return wid;
    }

    public void setWid(int wid) {
        this.wid = wid;
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
    @Column(name = "ISDELETE")
    public byte getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(byte isdelete) {
        this.isdelete = isdelete;
    }

    @Basic
    @Column(name = "DHASPROPERTY")
    public byte getDhasproperty() {
        return dhasproperty;
    }

    public void setDhasproperty(byte dhasproperty) {
        this.dhasproperty = dhasproperty;
    }

    @Basic
    @Column(name = "DDESC")
    public String getDdesc() {
        return ddesc;
    }

    public void setDdesc(String ddesc) {
        this.ddesc = ddesc;
    }

    @Basic
    @Column(name = "DIMAGE")
    public String getDimage() {
        return dimage;
    }

    public void setDimage(String dimage) {
        this.dimage = dimage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DishEntity that = (DishEntity) o;

        if (did != that.did) return false;
        if (wid != that.wid) return false;
        if (davailability != that.davailability) return false;
        if (isdelete != that.isdelete) return false;
        if (dhasproperty != that.dhasproperty) return false;
        if (dname != null ? !dname.equals(that.dname) : that.dname != null) return false;
        if (dprice != null ? !dprice.equals(that.dprice) : that.dprice != null) return false;
        if (ddesc != null ? !ddesc.equals(that.ddesc) : that.ddesc != null) return false;
        if (dimage != null ? !dimage.equals(that.dimage) : that.dimage != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = did;
        result = 31 * result + wid;
        result = 31 * result + (dname != null ? dname.hashCode() : 0);
        result = 31 * result + (dprice != null ? dprice.hashCode() : 0);
        result = 31 * result + (int) davailability;
        result = 31 * result + (int) isdelete;
        result = 31 * result + (int) dhasproperty;
        result = 31 * result + (ddesc != null ? ddesc.hashCode() : 0);
        result = 31 * result + (dimage != null ? dimage.hashCode() : 0);
        return result;
    }
}
