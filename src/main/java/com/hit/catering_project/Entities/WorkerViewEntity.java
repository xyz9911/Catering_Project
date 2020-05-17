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

    @Id
    @Basic
    @Column(name = "WID", nullable = false)
    public int getWid() {
        return wid;
    }

    public void setWid(int wid) {
        this.wid = wid;
    }

    @Basic
    @Column(name = "WNAME", nullable = false, length = 255)
    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    @Basic
    @Column(name = "WCONTACT", nullable = false, length = 255)
    public String getWcontact() {
        return wcontact;
    }

    public void setWcontact(String wcontact) {
        this.wcontact = wcontact;
    }

    @Basic
    @Column(name = "WRATING", nullable = false)
    public byte getWrating() {
        return wrating;
    }

    public void setWrating(byte wrating) {
        this.wrating = wrating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WorkerViewEntity that = (WorkerViewEntity) o;

        if (wid != that.wid) return false;
        if (wrating != that.wrating) return false;
        if (wname != null ? !wname.equals(that.wname) : that.wname != null) return false;
        if (wcontact != null ? !wcontact.equals(that.wcontact) : that.wcontact != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = wid;
        result = 31 * result + (wname != null ? wname.hashCode() : 0);
        result = 31 * result + (wcontact != null ? wcontact.hashCode() : 0);
        result = 31 * result + (int) wrating;
        return result;
    }

    @Basic
    @Column(name = "WBALANCE", nullable = false, precision = 2)
    public BigDecimal getWbalance() {
        return wbalance;
    }

    public void setWbalance(BigDecimal wbalance) {
        this.wbalance = wbalance;
    }
}
