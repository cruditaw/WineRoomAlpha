package com.example.cdsm.projetl3.entities;

import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.ToOne;

/**
 * Created by cdsm on 6/6/18.
 */

@Entity(indexes = {
        @Index(value = "vigneronId ASC", unique = true)
})
public class Vigneron {

    @Id
    private Long vigneronId;
    private String vigneronLibelle;
    private String vigneronDomaine;
    private long vigneronGeoLocId;
    @ToOne(joinProperty = "vigneronGeoLocId")
    private GeoLocalisation vigneronGeoLoc;
    private String vigneronFixe;
    private String vigneronMobile;
    private String vigneronMail;
    private String vigneronFax;
    private String vigneronComment;
    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;
    /** Used for active entity operations. */
    @Generated(hash = 226531329)
    private transient VigneronDao myDao;
    @Generated(hash = 1648572541)
    private transient Long vigneronGeoLoc__resolvedKey;


    public Vigneron() {
    }

    @Generated(hash = 1487986672)
    public Vigneron(Long vigneronId, String vigneronLibelle, String vigneronDomaine, long vigneronGeoLocId, String vigneronFixe,
            String vigneronMobile, String vigneronMail, String vigneronFax, String vigneronComment) {
        this.vigneronId = vigneronId;
        this.vigneronLibelle = vigneronLibelle;
        this.vigneronDomaine = vigneronDomaine;
        this.vigneronGeoLocId = vigneronGeoLocId;
        this.vigneronFixe = vigneronFixe;
        this.vigneronMobile = vigneronMobile;
        this.vigneronMail = vigneronMail;
        this.vigneronFax = vigneronFax;
        this.vigneronComment = vigneronComment;
    }

    public Long getVigneronId() {
        return vigneronId;
    }

    public void setVigneronId(Long vigneronId) {
        this.vigneronId = vigneronId;
    }

    public String getVigneronLibelle() {
        return vigneronLibelle;
    }

    public void setVigneronLibelle(String vigneronLibelle) {
        this.vigneronLibelle = vigneronLibelle;
    }

    public String getVigneronDomaine() {
        return vigneronDomaine;
    }

    public void setVigneronDomaine(String vigneronDomaine) {
        this.vigneronDomaine = vigneronDomaine;
    }

    public String getVigneronFixe() {
        return vigneronFixe;
    }

    public void setVigneronFixe(String vigneronFixe) {
        this.vigneronFixe = vigneronFixe;
    }

    public String getVigneronMobile() {
        return vigneronMobile;
    }

    public void setVigneronMobile(String vigneronMobile) {
        this.vigneronMobile = vigneronMobile;
    }

    public String getVigneronMail() {
        return vigneronMail;
    }

    public void setVigneronMail(String vigneronMail) {
        this.vigneronMail = vigneronMail;
    }

    public String getVigneronFax() {
        return vigneronFax;
    }

    public void setVigneronFax(String vigneronFax) {
        this.vigneronFax = vigneronFax;
    }

    public String getVigneronComment() {
        return vigneronComment;
    }

    public void setVigneronComment(String vigneronComment) {
        this.vigneronComment = vigneronComment;
    }

    public long getVigneronGeoLocId() {
        return vigneronGeoLocId;
    }

    public void setVigneronGeoLocId(long vigneronGeoLocId) {
        this.vigneronGeoLocId = vigneronGeoLocId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vigneron vigneron = (Vigneron) o;

        if (vigneronId != null ? !vigneronId.equals(vigneron.vigneronId) : vigneron.vigneronId != null)
            return false;
        if (vigneronLibelle != null ? !vigneronLibelle.equals(vigneron.vigneronLibelle) : vigneron.vigneronLibelle != null)
            return false;
        if (vigneronDomaine != null ? !vigneronDomaine.equals(vigneron.vigneronDomaine) : vigneron.vigneronDomaine != null)
            return false;
        if (vigneronGeoLoc != null ? !vigneronGeoLoc.equals(vigneron.vigneronGeoLoc) : vigneron.vigneronGeoLoc != null)
            return false;
        if (vigneronFixe != null ? !vigneronFixe.equals(vigneron.vigneronFixe) : vigneron.vigneronFixe != null)
            return false;
        if (vigneronMobile != null ? !vigneronMobile.equals(vigneron.vigneronMobile) : vigneron.vigneronMobile != null)
            return false;
        if (vigneronMail != null ? !vigneronMail.equals(vigneron.vigneronMail) : vigneron.vigneronMail != null)
            return false;
        if (vigneronFax != null ? !vigneronFax.equals(vigneron.vigneronFax) : vigneron.vigneronFax != null)
            return false;
        return vigneronComment != null ? vigneronComment.equals(vigneron.vigneronComment) : vigneron.vigneronComment == null;
    }

    @Override
    public int hashCode() {
        int result = vigneronId != null ? vigneronId.hashCode() : 0;
        result = 31 * result + (vigneronLibelle != null ? vigneronLibelle.hashCode() : 0);
        result = 31 * result + (vigneronDomaine != null ? vigneronDomaine.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Vigneron{" +
                "vigneronId=" + vigneronId +
                ", vigneronLibelle='" + vigneronLibelle + '\'' +
                ", vigneronDomaine='" + vigneronDomaine + '\'' +
                ", vigneronGeoLocId=" + vigneronGeoLocId +
                ", vigneronGeoLoc=" + vigneronGeoLoc +
                ", vigneronFixe='" + vigneronFixe + '\'' +
                ", vigneronMobile='" + vigneronMobile + '\'' +
                ", vigneronMail='" + vigneronMail + '\'' +
                ", vigneronFax='" + vigneronFax + '\'' +
                ", vigneronComment='" + vigneronComment + '\'' +
                '}';
    }

    /** To-one relationship, resolved on first access. */
    @Generated(hash = 822405211)
    public GeoLocalisation getVigneronGeoLoc() {
        long __key = this.vigneronGeoLocId;
        if (vigneronGeoLoc__resolvedKey == null || !vigneronGeoLoc__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            GeoLocalisationDao targetDao = daoSession.getGeoLocalisationDao();
            GeoLocalisation vigneronGeoLocNew = targetDao.load(__key);
            synchronized (this) {
                vigneronGeoLoc = vigneronGeoLocNew;
                vigneronGeoLoc__resolvedKey = __key;
            }
        }
        return vigneronGeoLoc;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 324018518)
    public void setVigneronGeoLoc(@NotNull GeoLocalisation vigneronGeoLoc) {
        if (vigneronGeoLoc == null) {
            throw new DaoException("To-one property 'vigneronGeoLocId' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.vigneronGeoLoc = vigneronGeoLoc;
            vigneronGeoLocId = vigneronGeoLoc.getGeoLocId();
            vigneronGeoLoc__resolvedKey = vigneronGeoLocId;
        }
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 128553479)
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.delete(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 1942392019)
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.refresh(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 713229351)
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.update(this);
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1120897840)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getVigneronDao() : null;
    }

}
