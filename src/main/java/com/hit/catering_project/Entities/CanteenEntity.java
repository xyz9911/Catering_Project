package com.hit.catering_project.Entities;

import javax.persistence.*;

@Entity
@Table(name = "canteen", schema = "catering_system", catalog = "")
public class CanteenEntity {
    private int cid;
    private String cname;
    private String cimage;
    private String cdesc;

    @Id
    @Column(name = "CID")
    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @Basic
    @Column(name = "CNAME")
    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Basic
    @Column(name = "CIMAGE")
    public String getCimage() {
        return cimage;
    }

    public void setCimage(String cimage) {
        this.cimage = cimage;
    }

    @Basic
    @Column(name = "CDESC")
    public String getCdesc() {
        return cdesc;
    }

    public void setCdesc(String cdesc) {
        this.cdesc = cdesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CanteenEntity that = (CanteenEntity) o;

        if (cid != that.cid) return false;
        if (cname != null ? !cname.equals(that.cname) : that.cname != null) return false;
        if (cimage != null ? !cimage.equals(that.cimage) : that.cimage != null) return false;
        if (cdesc != null ? !cdesc.equals(that.cdesc) : that.cdesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cid;
        result = 31 * result + (cname != null ? cname.hashCode() : 0);
        result = 31 * result + (cimage != null ? cimage.hashCode() : 0);
        result = 31 * result + (cdesc != null ? cdesc.hashCode() : 0);
        return result;
    }
}
