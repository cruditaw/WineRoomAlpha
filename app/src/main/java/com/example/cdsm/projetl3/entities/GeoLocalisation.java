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
        @Index(value = "geoLocId ASC", unique = true)
})
public class GeoLocalisation {

    @Id
    private Long geoLocId;

    private String geoLocPays;
    private String geoLocVille;
    private String geoLocCode;
    @NotNull
    private String geoLocAdresse;

    public GeoLocalisation() {
    }


    @Generated(hash = 506939100)
    public GeoLocalisation(Long geoLocId, String geoLocPays, String geoLocVille, String geoLocCode,
            @NotNull String geoLocAdresse) {
        this.geoLocId = geoLocId;
        this.geoLocPays = geoLocPays;
        this.geoLocVille = geoLocVille;
        this.geoLocCode = geoLocCode;
        this.geoLocAdresse = geoLocAdresse;
    }


    public Long getGeoLocId() {
        return geoLocId;
    }

    public void setGeoLocId(Long geoLocId) {
        this.geoLocId = geoLocId;
    }

    public String getGeoLocPays() {
        return geoLocPays;
    }

    public void setGeoLocPays(String geoLocPays) {
        this.geoLocPays = geoLocPays;
    }

    public String getGeoLocVille() {
        return geoLocVille;
    }

    public void setGeoLocVille(String geoLocVille) {
        this.geoLocVille = geoLocVille;
    }

    public String getGeoLocCode() {
        return geoLocCode;
    }

    public void setGeoLocCode(String geoLocCode) {
        this.geoLocCode = geoLocCode;
    }

    public String getGeoLocAdresse() {
        return geoLocAdresse;
    }

    public void setGeoLocAdresse(String geoLocAdresse) {
        this.geoLocAdresse = geoLocAdresse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GeoLocalisation that = (GeoLocalisation) o;

        if (geoLocId != null ? !geoLocId.equals(that.geoLocId) : that.geoLocId != null)
            return false;
        if (geoLocPays != null ? !geoLocPays.equals(that.geoLocPays) : that.geoLocPays != null)
            return false;
        if (geoLocVille != null ? !geoLocVille.equals(that.geoLocVille) : that.geoLocVille != null)
            return false;
        if (geoLocCode != null ? !geoLocCode.equals(that.geoLocCode) : that.geoLocCode != null)
            return false;
        return geoLocAdresse != null ? geoLocAdresse.equals(that.geoLocAdresse) : that.geoLocAdresse == null;
    }

    @Override
    public int hashCode() {
        int result = geoLocId != null ? geoLocId.hashCode() : 0;
        result = 31 * result + (geoLocVille != null ? geoLocVille.hashCode() : 0);
        result = 31 * result + (geoLocCode != null ? geoLocCode.hashCode() : 0);
        result = 31 * result + (geoLocAdresse != null ? geoLocAdresse.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "GeoLocalisation{" +
                "geoLocId=" + geoLocId +
                ", geoLocPays='" + geoLocPays + '\'' +
                ", geoLocVille='" + geoLocVille + '\'' +
                ", geoLocCode='" + geoLocCode + '\'' +
                ", geoLocAdresse='" + geoLocAdresse + '\'' +
                '}';
    }
}
