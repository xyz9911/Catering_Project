package com.hit.catering_project.Entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "order_upd_notice", schema = "catering_system", catalog = "")
public class OrderUpdNoticeEntity {
    private int nid;
    private String ncontent;
    private byte isread;
    private Timestamp ndate;
    private byte wisread;
    private int oid;

    @Id
    @Column(name = "NID", nullable = false)
    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    @Basic
    @Column(name = "NCONTENT", nullable = false, length = 255)
    public String getNcontent() {
        return ncontent;
    }

    public void setNcontent(String ncontent) {
        this.ncontent = ncontent;
    }

    @Basic
    @Column(name = "ISREAD", nullable = false)
    public byte getIsread() {
        return isread;
    }

    public void setIsread(byte isread) {
        this.isread = isread;
    }

    @Basic
    @Column(name = "NDATE", nullable = false)
    public Timestamp getNdate() {
        return ndate;
    }

    public void setNdate(Timestamp ndate) {
        this.ndate = ndate;
    }

    @Basic
    @Column(name = "WISREAD", nullable = false)
    public byte getWisread() {
        return wisread;
    }

    public void setWisread(byte wisread) {
        this.wisread = wisread;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderUpdNoticeEntity that = (OrderUpdNoticeEntity) o;

        if (nid != that.nid) return false;
        if (isread != that.isread) return false;
        if (wisread != that.wisread) return false;
        if (ncontent != null ? !ncontent.equals(that.ncontent) : that.ncontent != null) return false;
        if (ndate != null ? !ndate.equals(that.ndate) : that.ndate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nid;
        result = 31 * result + (ncontent != null ? ncontent.hashCode() : 0);
        result = 31 * result + (int) isread;
        result = 31 * result + (ndate != null ? ndate.hashCode() : 0);
        result = 31 * result + (int) wisread;
        return result;
    }

    @Basic
    @Column(name = "OID", nullable = false)
    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }
}
