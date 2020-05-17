package com.hit.catering_project.Entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class NoticeStuRelationEntityPK implements Serializable {
    private int nid;
    private int sid;

    @Column(name = "NID", nullable = false)
    @Id
    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    @Column(name = "SID", nullable = false)
    @Id
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NoticeStuRelationEntityPK that = (NoticeStuRelationEntityPK) o;

        if (nid != that.nid) return false;
        if (sid != that.sid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nid;
        result = 31 * result + sid;
        return result;
    }
}
