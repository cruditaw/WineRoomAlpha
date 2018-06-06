package com.example.cdsm.projetl3.entities;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.ToOne;

import java.util.Date;
import org.greenrobot.greendao.DaoException;

/**
 * Created by cdsm on 6/6/18.
 */

@Entity(indexes = {
        @Index(value = "vinId ASC", unique = true)
})
public class Vin {

    @Id
    private Long vinId;
    @NotNull
    private String vinLibelle;
    private long vinAppellationId;
    @ToOne(joinProperty = "vinAppellationId")
    private AppellationVin vinAppellation;
    private long vinTypeId;
    @ToOne(joinProperty = "vinTypeId")
    private TypeVin vinType;
    private long vinVigneronId;
    @ToOne(joinProperty = "vinVigneronId")
    private Vigneron vinVigneron;
    private Double vinPrix;
    private Date vinAnnee;
    private Date vinAnneeMax;
    private String vinCommentaire;
    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;
    /** Used for active entity operations. */
    @Generated(hash = 1543015664)
    private transient VinDao myDao;
    @Generated(hash = 372724508)
    private transient Long vinAppellation__resolvedKey;
    @Generated(hash = 936595586)
    private transient Long vinType__resolvedKey;
    @Generated(hash = 1627525571)
    private transient Long vinVigneron__resolvedKey;

    public Vin() {
    }

    @Generated(hash = 1354114707)
    public Vin(Long vinId, @NotNull String vinLibelle, long vinAppellationId, long vinTypeId, long vinVigneronId,
            Double vinPrix, Date vinAnnee, Date vinAnneeMax, String vinCommentaire) {
        this.vinId = vinId;
        this.vinLibelle = vinLibelle;
        this.vinAppellationId = vinAppellationId;
        this.vinTypeId = vinTypeId;
        this.vinVigneronId = vinVigneronId;
        this.vinPrix = vinPrix;
        this.vinAnnee = vinAnnee;
        this.vinAnneeMax = vinAnneeMax;
        this.vinCommentaire = vinCommentaire;
    }

    public Long getVinId() {

        return vinId;
    }

    public void setVinId(Long vinId) {
        this.vinId = vinId;
    }

    public String getVinLibelle() {
        return vinLibelle;
    }

    public void setVinLibelle(String vinLibelle) {
        this.vinLibelle = vinLibelle;
    }

    public long getVinAppellationId() {
        return vinAppellationId;
    }

    public void setVinAppellationId(long vinAppellationId) {
        this.vinAppellationId = vinAppellationId;
    }

    public long getVinTypeId() {
        return vinTypeId;
    }

    public void setVinTypeId(long vinTypeId) {
        this.vinTypeId = vinTypeId;
    }

    public long getVinVigneronId() {
        return vinVigneronId;
    }

    public void setVinVigneronId(long vinVigneronId) {
        this.vinVigneronId = vinVigneronId;
    }

    public Double getVinPrix() {
        return vinPrix;
    }

    public void setVinPrix(Double vinPrix) {
        this.vinPrix = vinPrix;
    }

    public Date getVinAnnee() {
        return vinAnnee;
    }

    public void setVinAnnee(Date vinAnnee) {
        this.vinAnnee = vinAnnee;
    }

    public Date getVinAnneeMax() {
        return vinAnneeMax;
    }

    public void setVinAnneeMax(Date vinAnneeMax) {
        this.vinAnneeMax = vinAnneeMax;
    }

    public String getVinCommentaire() {
        return vinCommentaire;
    }

    public void setVinCommentaire(String vinCommentaire) {
        this.vinCommentaire = vinCommentaire;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vin vin = (Vin) o;

        if (vinId != null ? !vinId.equals(vin.vinId) : vin.vinId != null) return false;
        if (vinLibelle != null ? !vinLibelle.equals(vin.vinLibelle) : vin.vinLibelle != null)
            return false;
        if (vinAppellation != null ? !vinAppellation.equals(vin.vinAppellation) : vin.vinAppellation != null)
            return false;
        if (vinType != null ? !vinType.equals(vin.vinType) : vin.vinType != null) return false;
        if (vinVigneron != null ? !vinVigneron.equals(vin.vinVigneron) : vin.vinVigneron != null)
            return false;
        if (vinPrix != null ? !vinPrix.equals(vin.vinPrix) : vin.vinPrix != null) return false;
        if (vinAnnee != null ? !vinAnnee.equals(vin.vinAnnee) : vin.vinAnnee != null) return false;
        if (vinAnneeMax != null ? !vinAnneeMax.equals(vin.vinAnneeMax) : vin.vinAnneeMax != null)
            return false;
        return vinCommentaire != null ? vinCommentaire.equals(vin.vinCommentaire) : vin.vinCommentaire == null;
    }

    @Override
    public int hashCode() {
        int result = vinId != null ? vinId.hashCode() : 0;
        result = 31 * result + (vinLibelle != null ? vinLibelle.hashCode() : 0);
        result = 31 * result + (vinAppellation != null ? vinAppellation.hashCode() : 0);
        result = 31 * result + (vinType != null ? vinType.hashCode() : 0);
        result = 31 * result + (vinVigneron != null ? vinVigneron.hashCode() : 0);
        result = 31 * result + (vinAnnee != null ? vinAnnee.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Vin{" +
                "vinId=" + vinId +
                ", vinLibelle='" + vinLibelle + '\'' +
                ", vinAppellation=" + vinAppellation +
                ", vinType=" + vinType +
                ", vinVigneron=" + vinVigneron +
                ", vinPrix=" + vinPrix +
                ", vinAnnee=" + vinAnnee +
                ", vinAnneeMax=" + vinAnneeMax +
                '}';
    }

    /** To-one relationship, resolved on first access. */
    @Generated(hash = 919112073)
    public AppellationVin getVinAppellation() {
        long __key = this.vinAppellationId;
        if (vinAppellation__resolvedKey == null || !vinAppellation__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            AppellationVinDao targetDao = daoSession.getAppellationVinDao();
            AppellationVin vinAppellationNew = targetDao.load(__key);
            synchronized (this) {
                vinAppellation = vinAppellationNew;
                vinAppellation__resolvedKey = __key;
            }
        }
        return vinAppellation;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1904645677)
    public void setVinAppellation(@NotNull AppellationVin vinAppellation) {
        if (vinAppellation == null) {
            throw new DaoException(
                    "To-one property 'vinAppellationId' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.vinAppellation = vinAppellation;
            vinAppellationId = vinAppellation.getAppellationVinId();
            vinAppellation__resolvedKey = vinAppellationId;
        }
    }

    /** To-one relationship, resolved on first access. */
    @Generated(hash = 1582065357)
    public TypeVin getVinType() {
        long __key = this.vinTypeId;
        if (vinType__resolvedKey == null || !vinType__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            TypeVinDao targetDao = daoSession.getTypeVinDao();
            TypeVin vinTypeNew = targetDao.load(__key);
            synchronized (this) {
                vinType = vinTypeNew;
                vinType__resolvedKey = __key;
            }
        }
        return vinType;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1370377898)
    public void setVinType(@NotNull TypeVin vinType) {
        if (vinType == null) {
            throw new DaoException(
                    "To-one property 'vinTypeId' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.vinType = vinType;
            vinTypeId = vinType.getTypeVinId();
            vinType__resolvedKey = vinTypeId;
        }
    }

    /** To-one relationship, resolved on first access. */
    @Generated(hash = 639477929)
    public Vigneron getVinVigneron() {
        long __key = this.vinVigneronId;
        if (vinVigneron__resolvedKey == null || !vinVigneron__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            VigneronDao targetDao = daoSession.getVigneronDao();
            Vigneron vinVigneronNew = targetDao.load(__key);
            synchronized (this) {
                vinVigneron = vinVigneronNew;
                vinVigneron__resolvedKey = __key;
            }
        }
        return vinVigneron;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1662861982)
    public void setVinVigneron(@NotNull Vigneron vinVigneron) {
        if (vinVigneron == null) {
            throw new DaoException(
                    "To-one property 'vinVigneronId' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.vinVigneron = vinVigneron;
            vinVigneronId = vinVigneron.getVigneronId();
            vinVigneron__resolvedKey = vinVigneronId;
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
    @Generated(hash = 1640066944)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getVinDao() : null;
    }
}
