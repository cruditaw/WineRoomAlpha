package com.example.cdsm.projetl3.entities;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.NotNull;

/**
 * Created by cdsm on 6/6/18.
 */

@Entity(indexes = {
        @Index(value = "appellationVinId ASC", unique = true)
})
public class AppellationVin {

    @Id
    private Long appellationVinId;
    @NotNull
    private String appellationVinLibelle;

    public AppellationVin() {
    }

    @Generated(hash = 858850367)
    public AppellationVin(Long appellationVinId, @NotNull String appellationVinLibelle) {
        this.appellationVinId = appellationVinId;
        this.appellationVinLibelle = appellationVinLibelle;
    }

    public String getAppellationVinLibelle() {
        return appellationVinLibelle;
    }

    public void setAppellationVinLibelle(String appellationVinLibelle) {
        this.appellationVinLibelle = appellationVinLibelle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AppellationVin that = (AppellationVin) o;

        if (appellationVinId != null ? !appellationVinId.equals(that.appellationVinId) : that.appellationVinId != null)
            return false;
        return appellationVinLibelle != null ? appellationVinLibelle.equals(that.appellationVinLibelle) : that.appellationVinLibelle == null;
    }

    @Override
    public int hashCode() {
        int result = appellationVinId != null ? appellationVinId.hashCode() : 0;
        result = 31 * result + (appellationVinLibelle != null ? appellationVinLibelle.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AppellationVin{" +
                "appellationvinId=" + appellationVinId +
                ", appellationVinLibelle='" + appellationVinLibelle + '\'' +
                '}';
    }

    public Long getAppellationVinId() {
        return this.appellationVinId;
    }

    public void setAppellationVinId(Long appellationVinId) {
        this.appellationVinId = appellationVinId;
    }
}
