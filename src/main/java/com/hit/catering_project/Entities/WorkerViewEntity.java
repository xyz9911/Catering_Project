package com.hit.catering_project.Entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "worker_view", schema = "catering_system", catalog = "")
public class WorkerViewEntity {
    private int wid;
    private String wname;
    private String wcontact;
    private byte wrating;
    private BigDecimal wbalance;
    private int cid;
    private String openinghours;

    @Basic
    @Id
    @Column(name = "WID")
    public int getWid() {
        return wid;
    }

    public void setWid(int wid) {
        this.wid = wid;
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
    @Column(name = "WCONTACT")
    public String getWcontact() {
        return wcontact;
    }

    public void setWcontact(String wcontact) {
        this.wcontact = wcontact;
    }

    @Basic
    @Column(name = "WRATING")
    public byte getWrating() {
        return wrating;
    }

    public void setWrating(byte wrating) {
        this.wrating = wrating;
    }

    @Basic
    @Column(name = "WBALANCE")
    public BigDecimal getWbalance() {
        return wbalance;
    }

    public void setWbalance(BigDecimal wbalance) {
        this.wbalance = wbalance;
    }

    @Basic
    @Column(name = "CID")
    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @Basic
    @Column(name = "OPENINGHOURS")
    public String getOpeninghours() {
        return openinghours;
    }

    public void setOpeninghours(String openinghours) {
        this.openinghours = openinghours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WorkerViewEntity that = (WorkerViewEntity) o;

        if (wid != that.wid) return false;
        if (wrating != that.wrating) return false;
        if (cid != that.cid) return false;
        if (wname != null ? !wname.equals(that.wname) : that.wname != null) return false;
        if (wcontact != null ? !wcontact.equals(that.wcontact) : that.wcontact != null) return false;
        if (wbalance != null ? !wbalance.equals(that.wbalance) : that.wbalance != null) return false;
        if (openinghours != null ? !openinghours.equals(that.openinghours) : that.openinghours != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = wid;
        result = 31 * result + (wname != null ? wname.hashCode() : 0);
        result = 31 * result + (wcontact != null ? wcontact.hashCode() : 0);
        result = 31 * result + (int) wrating;
        result = 31 * result + (wbalance != null ? wbalance.hashCode() : 0);
        result = 31 * result + cid;
        result = 31 * result + (openinghours != null ? openinghours.hashCode() : 0);
        return result;
    }
}
