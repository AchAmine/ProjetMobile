package com.esprit.myapp.Entity;

import androidx.annotation.NonNull;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.Relation;

import java.io.Serializable;
import java.util.List;

@Entity
public class Complaint implements Serializable {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    private int idComplaint;

    private String object ;
    private String details ;

    private String tag ;
    private Integer idUser ;

    public Complaint(String object, String details, String tag, Integer idUser) {
        this.object = object;
        this.details = details;
        this.tag = tag;
        this.idUser = idUser;
    }

    public int getIdComplaint() {
        return idComplaint;
    }

    public void setIdComplaint(int idComplaint) {
        this.idComplaint = idComplaint;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    @Override
    public String toString() {
        return "Complaint{" +
                "idComplaint=" + idComplaint +
                ", object='" + object + '\'' +
                ", details='" + details + '\'' +
                ", tag='" + tag + '\'' +
                ", idUser=" + idUser +
                '}';
    }
}
