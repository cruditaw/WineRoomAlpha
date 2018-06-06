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
        @Index(value = "actionId ASC", unique = true)
})
public class Action {

    @Id
    private Long actionId;
    @NotNull
    private Integer actionLibelle;

    public Action() {
    }

    @Generated(hash = 676221383)
    public Action(Long actionId, @NotNull Integer actionLibelle) {
        this.actionId = actionId;
        this.actionLibelle = actionLibelle;
    }

    public Long getActionId() {
        return actionId;
    }

    public void setActionId(Long actionId) {
        this.actionId = actionId;
    }

    public Integer getActionLibelle() {
        return actionLibelle;
    }

    public void setActionLibelle(Integer actionLibelle) {
        this.actionLibelle = actionLibelle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Action action = (Action) o;

        if (actionId != null ? !actionId.equals(action.actionId) : action.actionId != null)
            return false;
        return actionLibelle != null ? actionLibelle.equals(action.actionLibelle) : action.actionLibelle == null;
    }

    @Override
    public int hashCode() {
        int result = actionId != null ? actionId.hashCode() : 0;
        result = 31 * result + (actionLibelle != null ? actionLibelle.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Action{" +
                "actionId=" + actionId +
                ", actionLibelle=" + actionLibelle +
                '}';
    }
}
