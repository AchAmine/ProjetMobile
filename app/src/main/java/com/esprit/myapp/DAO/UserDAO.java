package com.esprit.myapp.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.esprit.myapp.Entity.User;

import java.util.List;

@Dao
public interface UserDAO {

    @Query("SELECT * FROM User where email= :mail and password= :password")
    User getUser(String mail, String password);
  //  @Query("SELECT * FROM User")
    // User getAll();

    @Query("SELECT * FROM User")
    List<User> getAll();
    @Insert
    void insert(User user);

    @Update
    void update(User user);

    @Delete
    void delete(User user);
}
