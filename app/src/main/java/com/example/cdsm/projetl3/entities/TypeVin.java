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
        @Index(value = "typeVinId ASC", unique = true)
})
public class TypeVin {

        @Id
        private Long typeVinId;
        @NotNull
        private String typeVinLibelle;

        public TypeVin() {
        }

        @Generated(hash = 1276801879)
        public TypeVin(Long typeVinId, @NotNull String typeVinLibelle) {
            this.typeVinId = typeVinId;
            this.typeVinLibelle = typeVinLibelle;
        }

        public Long getTypeVinId() {
            return typeVinId;
        }

        public void setTypeVinId(Long typeVinId) {
            this.typeVinId = typeVinId;
        }

        public String getTypeVinLibelle() {
            return typeVinLibelle;
        }

        public void setTypeVinLibelle(String typeVinLibelle) {
            this.typeVinLibelle = typeVinLibelle;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            TypeVin typeVin = (TypeVin) o;

            if (typeVinId != null ? !typeVinId.equals(typeVin.typeVinId) : typeVin.typeVinId != null)
                return false;
            return typeVinLibelle != null ? typeVinLibelle.equals(typeVin.typeVinLibelle) : typeVin.typeVinLibelle == null;
        }

        @Override
        public int hashCode() {
            int result = typeVinId != null ? typeVinId.hashCode() : 0;
            result = 31 * result + (typeVinLibelle != null ? typeVinLibelle.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return "TypeVin{" +
                    "typeVinId=" + typeVinId +
                    ", typeVinLibelle='" + typeVinLibelle + '\'' +
                    '}';
        }
}
