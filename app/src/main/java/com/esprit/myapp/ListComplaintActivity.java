package com.esprit.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.esprit.myapp.DAO.ComplaintDAO;
import com.esprit.myapp.Database.Database;

import java.util.ArrayList;
import java.util.List;

public class ListComplaintActivity extends AppCompatActivity {

    ListView ls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
      /*  super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_complaint);
        ls=findViewById(R.id.lst);*/
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_complaint);

        ls=findViewById(R.id.lst);
        // String[] values = new String[]{
        //  "sfax",
        //  "tounes"
        // };
        Database DataBase = Database.getInstance(getApplicationContext());

        ComplaintDAO complaint = DataBase.complaintDAO();

        List<String> l = new ArrayList<>();

        for (int i =0; i<complaint.getAll().size(); i++)
        {
            l.add(complaint.getAll().get(i).getObject());
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ListComplaintActivity.this , R.layout.item,R.id.Claim,l);
        ls.setAdapter(adapter);
    
    }
}