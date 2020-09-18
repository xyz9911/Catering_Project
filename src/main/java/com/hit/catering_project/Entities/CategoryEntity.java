package com.hit.catering_project.Entities;

import javax.persistence.*;

@Entity
@Table(name = "category", schema = "catering_system", catalog = "")
public class CategoryEntity {
    private int cid;
    private int did;
    private String cname;

    @Id
    @Column(name = "CID")
    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @Basic
    @Column(name = "DID")
    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    @Basic
    @Column(name = "CNAME")
    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CategoryEntity that = (CategoryEntity) o;

        if (cid != that.cid) return false;
        if (did != that.did) return false;
        if (cname != null ? !cname.equals(that.cname) : that.cname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cid;
        result = 31 * result + did;
        result = 31 * result + (cname != null ? cname.hashCode() : 0);
        return result;
    }
}
