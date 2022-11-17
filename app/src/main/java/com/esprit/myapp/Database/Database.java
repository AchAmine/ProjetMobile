package com.esprit.myapp.Database;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.esprit.myapp.DAO.ComplaintDAO;
import com.esprit.myapp.DAO.UserDAO;
import com.esprit.myapp.Entity.Complaint;
import com.esprit.myapp.Entity.User;

@androidx.room.Database(entities = {User.class, Complaint.class}, version = 2, exportSchema = false)
public abstract class Database extends RoomDatabase {

    private static Database instance;

    public abstract UserDAO userDAO();
    public abstract ComplaintDAO complaintDAO();

    public static synchronized Database getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                            Database.class, "my_db")
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }
}
