package com.esprit.myapp.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.esprit.myapp.Entity.Complaint;
import com.esprit.myapp.Entity.User;

import java.util.List;

@Dao
public interface ComplaintDAO {

    @Query("SELECT * FROM Complaint")
    List<Complaint> getAll();
    @Insert
    void insert(Complaint complaint);

    @Update
    void update(Complaint complaint);

    @Delete
    void delete(Complaint complaint);
}
