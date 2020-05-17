package com.hit.catering_project.Entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "new_dish_notice", schema = "catering_system", catalog = "")
public class NewDishNoticeEntity {
    private int nid;
    private String ncontent;
    private Timestamp ndate;

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
    @Column(name = "NDATE", nullable = false)
    public Timestamp getNdate() {
        return ndate;
    }

    public void setNdate(Timestamp ndate) {
        this.ndate = ndate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NewDishNoticeEntity that = (NewDishNoticeEntity) o;

        if (nid != that.nid) return false;
        if (ncontent != null ? !ncontent.equals(that.ncontent) : that.ncontent != null) return false;
        if (ndate != null ? !ndate.equals(that.ndate) : that.ndate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nid;
        result = 31 * result + (ncontent != null ? ncontent.hashCode() : 0);
        result = 31 * result + (ndate != null ? ndate.hashCode() : 0);
        return result;
    }
}
