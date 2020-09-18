package com.hit.catering_project.Show;

import com.hit.catering_project.Entities.DishEntity;

import java.math.BigDecimal;
import java.util.List;

public class DishInfo {
    private int did;
    private String dname;
    private BigDecimal dprice;
    private byte davailability;
    private byte isdelete;
    private int wid;
    private byte dhasproperty;
    private String ddesc;
    private String dimage;
    private int dnum;
    private List<CategoryValue> categoryvalues;

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public BigDecimal getDprice() {
        return dprice;
    }

    public void setDprice(BigDecimal dprice) {
        this.dprice = dprice;
    }

    public byte getDavailability() {
        return davailability;
    }

    public void setDavailability(byte davailability) {
        this.davailability = davailability;
    }

    public byte getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(byte isdelete) {
        this.isdelete = isdelete;
    }

    public int getWid() {
        return wid;
    }

    public void setWid(int wid) {
        this.wid = wid;
    }

    public byte getDhasproperty() {
        return dhasproperty;
    }

    public void setDhasproperty(byte dhasproperty) {
        this.dhasproperty = dhasproperty;
    }

    public String getDdesc() {
        return ddesc;
    }

    public void setDdesc(String ddesc) {
        this.ddesc = ddesc;
    }

    public String getDimage() {
        return dimage;
    }

    public void setDimage(String dimage) {
        this.dimage = dimage;
    }

    public List<CategoryValue> getCategoryvalues() {
        return categoryvalues;
    }

    public void setCategoryvalues(List<CategoryValue> categoryvalues) {
        this.categoryvalues = categoryvalues;
    }

    public int getDnum() {
        return dnum;
    }

    public void setDnum(int dnum) {
        this.dnum = dnum;
    }

    public DishInfo(DishEntity dishEntity) {
        setDid(dishEntity.getDid());
        setWid(dishEntity.getWid());
        setDname(dishEntity.getDname());
        setDprice(dishEntity.getDprice());
        setDavailability(dishEntity.getDavailability());
        setIsdelete(dishEntity.getIsdelete());
        setDhasproperty(dishEntity.getDhasproperty());
        setDdesc(dishEntity.getDdesc());
        setDimage(dishEntity.getDimage());
    }
}
