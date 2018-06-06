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
        @Index(value = "appUserId ASC", unique = true)
})
public class AppUser {

    @Id
    private Long appUserId;
    @NotNull
    private String appUserName;
    @NotNull
    private String appUserMail;
    @NotNull
    private String appUserPassword;

    private Integer appUserCaveId;

    public AppUser() {
    }

    @Generated(hash = 1052441854)
    public AppUser(Long appUserId, @NotNull String appUserName, @NotNull String appUserMail,
            @NotNull String appUserPassword, Integer appUserCaveId) {
        this.appUserId = appUserId;
        this.appUserName = appUserName;
        this.appUserMail = appUserMail;
        this.appUserPassword = appUserPassword;
        this.appUserCaveId = appUserCaveId;
    }

    public Long getAppUserId() {
        return appUserId;
    }

    public void setAppUserId(Long appUserId) {
        this.appUserId = appUserId;
    }

    public String getAppUserName() {
        return appUserName;
    }

    public void setAppUserName(String appUserName) {
        this.appUserName = appUserName;
    }

    public String getAppUserMail() {
        return appUserMail;
    }

    public void setAppUserMail(String appUserMail) {
        this.appUserMail = appUserMail;
    }

    public String getAppUserPassword() {
        return appUserPassword;
    }

    public void setAppUserPassword(String appUserPassword) {
        this.appUserPassword = appUserPassword;
    }

    public Integer getAppUserCaveId() {
        return appUserCaveId;
    }

    public void setAppUserCaveId(Integer appUserCaveId) {
        this.appUserCaveId = appUserCaveId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        AppUser appUser = (AppUser) o;

        if (appUserId != null ? !appUserId.equals(appUser.appUserId) : appUser.appUserId != null) {
            return false;
        }
        if (appUserName != null ? !appUserName.equals(appUser.appUserName) : appUser.appUserName
                != null) {
            return false;
        }
        if (appUserMail != null ? !appUserMail.equals(appUser.appUserMail) : appUser.appUserMail
                != null) {
            return false;
        }
        if (appUserPassword != null ? !appUserPassword.equals(appUser.appUserPassword) : appUser
                .appUserPassword != null) {
            return false;
        }
        return appUserCaveId != null ? appUserCaveId.equals(appUser.appUserCaveId) : appUser
                .appUserCaveId == null;
    }

    @Override
    public int hashCode() {
        int result = appUserId != null ? appUserId.hashCode() : 0;
        result = 31 * result + (appUserName != null ? appUserName.hashCode() : 0);
        result = 31 * result + (appUserMail != null ? appUserMail.hashCode() : 0);
        result = 31 * result + (appUserPassword != null ? appUserPassword.hashCode() : 0);
        result = 31 * result + (appUserCaveId != null ? appUserCaveId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "appUserId=" + appUserId +
                ", appUserName='" + appUserName + '\'' +
                ", appUserMail='" + appUserMail + '\'' +
                ", appUserPassword='" + appUserPassword + '\'' +
                ", appUserCaveId=" + appUserCaveId +
                '}';
    }
}
