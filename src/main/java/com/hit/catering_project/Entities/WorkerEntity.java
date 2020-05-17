package com.hit.catering_project.Entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "worker", schema = "catering_system", catalog = "")
public class WorkerEntity {
    private int wid;
    private String wname;
    private String wpassword;
    private String wcontact;
    private byte wrating;
    private BigDecimal wbalance;
    private byte isdelete;

    @Id
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
    @Column(name = "WPASSWORD", nullable = false, length = 255)
    public String getWpassword() {
        return wpassword;
    }

    public void setWpassword(String wpassword) {
        this.wpassword = wpassword;
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

    @Basic
    @Column(name = "WBALANCE", nullable = false, precision = 2)
    public BigDecimal getWbalance() {
        return wbalance;
    }

    public void setWbalance(BigDecimal wbalance) {
        this.wbalance = wbalance;
    }

    @Basic
    @Column(name = "ISDELETE", nullable = false)
    public byte getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(byte isdelete) {
        this.isdelete = isdelete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WorkerEntity that = (WorkerEntity) o;

        if (wid != that.wid) return false;
        if (wrating != that.wrating) return false;
        if (isdelete != that.isdelete) return false;
        if (wname != null ? !wname.equals(that.wname) : that.wname != null) return false;
        if (wpassword != null ? !wpassword.equals(that.wpassword) : that.wpassword != null) return false;
        if (wcontact != null ? !wcontact.equals(that.wcontact) : that.wcontact != null) return false;
        if (wbalance != null ? !wbalance.equals(that.wbalance) : that.wbalance != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = wid;
        result = 31 * result + (wname != null ? wname.hashCode() : 0);
        result = 31 * result + (wpassword != null ? wpassword.hashCode() : 0);
        result = 31 * result + (wcontact != null ? wcontact.hashCode() : 0);
        result = 31 * result + (int) wrating;
        result = 31 * result + (wbalance != null ? wbalance.hashCode() : 0);
        result = 31 * result + (int) isdelete;
        return result;
    }
}
