package com.hit.catering_project.Entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "orders_view", schema = "catering_system", catalog = "")
public class OrdersViewEntity {
    private int oid;
    private Timestamp odate;
    private BigDecimal oprice;
    private String rname;
    private String sname;
    private String wname;
    private int sid;
    private int wid;
    private Integer rid;

    @Basic
    @Id
    @Column(name = "OID")
    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    @Basic
    @Column(name = "ODATE")
    public Timestamp getOdate() {
        return odate;
    }

    public void setOdate(Timestamp odate) {
        this.odate = odate;
    }

    @Basic
    @Column(name = "OPRICE")
    public BigDecimal getOprice() {
        return oprice;
    }

    public void setOprice(BigDecimal oprice) {
        this.oprice = oprice;
    }

    @Basic
    @Column(name = "RNAME")
    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    @Basic
    @Column(name = "SNAME")
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
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
    @Column(name = "SID")
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
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
    @Column(name = "RID")
    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrdersViewEntity that = (OrdersViewEntity) o;

        if (oid != that.oid) return false;
        if (sid != that.sid) return false;
        if (wid != that.wid) return false;
        if (odate != null ? !odate.equals(that.odate) : that.odate != null) return false;
        if (oprice != null ? !oprice.equals(that.oprice) : that.oprice != null) return false;
        if (rname != null ? !rname.equals(that.rname) : that.rname != null) return false;
        if (sname != null ? !sname.equals(that.sname) : that.sname != null) return false;
        if (wname != null ? !wname.equals(that.wname) : that.wname != null) return false;
        if (rid != null ? !rid.equals(that.rid) : that.rid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = oid;
        result = 31 * result + (odate != null ? odate.hashCode() : 0);
        result = 31 * result + (oprice != null ? oprice.hashCode() : 0);
        result = 31 * result + (rname != null ? rname.hashCode() : 0);
        result = 31 * result + (sname != null ? sname.hashCode() : 0);
        result = 31 * result + (wname != null ? wname.hashCode() : 0);
        result = 31 * result + sid;
        result = 31 * result + wid;
        result = 31 * result + (rid != null ? rid.hashCode() : 0);
        return result;
    }
}
