package com.hit.catering_project.Entities;

import javax.persistence.*;

@Entity
@Table(name = "notice_stu_relation", schema = "catering_system", catalog = "")
@IdClass(NoticeStuRelationEntityPK.class)
public class NoticeStuRelationEntity {
    private int nid;
    private int sid;
    private byte isread;

    @Id
    @Column(name = "NID", nullable = false)
    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    @Id
    @Column(name = "SID", nullable = false)
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    @Basic
    @Column(name = "ISREAD", nullable = false)
    public byte getIsread() {
        return isread;
    }

    public void setIsread(byte isread) {
        this.isread = isread;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NoticeStuRelationEntity that = (NoticeStuRelationEntity) o;

        if (nid != that.nid) return false;
        if (sid != that.sid) return false;
        if (isread != that.isread) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nid;
        result = 31 * result + sid;
        result = 31 * result + (int) isread;
        return result;
    }
}
