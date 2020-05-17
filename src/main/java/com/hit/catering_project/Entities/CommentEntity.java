package com.hit.catering_project.Entities;

import javax.persistence.*;

@Entity
@Table(name = "comment", schema = "catering_system", catalog = "")
public class CommentEntity {
    private int oid;
    private byte conwindow;
    private byte conrider;

    @Id
    @Column(name = "OID", nullable = false)
    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    @Basic
    @Column(name = "CONWINDOW", nullable = false)
    public byte getConwindow() {
        return conwindow;
    }

    public void setConwindow(byte conwindow) {
        this.conwindow = conwindow;
    }

    @Basic
    @Column(name = "CONRIDER", nullable = false)
    public byte getConrider() {
        return conrider;
    }

    public void setConrider(byte conrider) {
        this.conrider = conrider;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommentEntity that = (CommentEntity) o;

        if (oid != that.oid) return false;
        if (conwindow != that.conwindow) return false;
        if (conrider != that.conrider) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = oid;
        result = 31 * result + (int) conwindow;
        result = 31 * result + (int) conrider;
        return result;
    }
}
