package com.hit.catering_project.Entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "orders", schema = "catering_system", catalog = "")
public class OrdersEntity {
    private int oid;
    private int sid;
    private int wid;
    private Integer rid;
    private Timestamp odate;
    private BigDecimal oprice;
    private byte istaken;
    private byte iscanceled;

    @Id
    @Column(name = "OID")
    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
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
    @Column(name = "ISTAKEN")
    public byte getIstaken() {
        return istaken;
    }

    public void setIstaken(byte istaken) {
        this.istaken = istaken;
    }

    @Basic
    @Column(name = "ISCANCELED")
    public byte getIscanceled() {
        return iscanceled;
    }

    public void setIscanceled(byte iscanceled) {
        this.iscanceled = iscanceled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrdersEntity that = (OrdersEntity) o;

        if (oid != that.oid) return false;
        if (sid != that.sid) return false;
        if (wid != that.wid) return false;
        if (istaken != that.istaken) return false;
        if (iscanceled != that.iscanceled) return false;
        if (rid != null ? !rid.equals(that.rid) : that.rid != null) return false;
        if (odate != null ? !odate.equals(that.odate) : that.odate != null) return false;
        if (oprice != null ? !oprice.equals(that.oprice) : that.oprice != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = oid;
        result = 31 * result + sid;
        result = 31 * result + wid;
        result = 31 * result + (rid != null ? rid.hashCode() : 0);
        result = 31 * result + (odate != null ? odate.hashCode() : 0);
        result = 31 * result + (oprice != null ? oprice.hashCode() : 0);
        result = 31 * result + (int) istaken;
        result = 31 * result + (int) iscanceled;
        return result;
    }
}
