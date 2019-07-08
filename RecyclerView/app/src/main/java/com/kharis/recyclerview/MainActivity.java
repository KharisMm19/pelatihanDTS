package com.kharis.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.kharis.recyclerview.adapters.ContactAdapter;
import com.kharis.recyclerview.models.Contact;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ContactAdapter.OnContactClickListener{
    RecyclerView rvContact;
    List<Contact> contactList = new ArrayList<>();
    ContactAdapter contactAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvContact = findViewById(R.id.rvContact);
        contactAdapter = new ContactAdapter(contactList);
        contactAdapter.setListener(this);

        contactList.add(new Contact("Iron Man",
                "102018308",
                "https://cdn4.iconfinder.com/data/icons/famous-characters-add-on-vol-1-flat/48/Famous_Character_-_Add_On_1-14-512.png"));

        contactList.add(new Contact("Bat Man",
                "102018309",
                "https://cdn4.iconfinder.com/data/icons/famous-characters-add-on-vol-1-flat/48/Famous_Character_-_Add_On_1-22-512.png"));

        contactList.add(new Contact("Groot",
                "102018307",
                "https://cdn4.iconfinder.com/data/icons/famous-characters-add-on-vol-1-flat/48/Famous_Character_-_Add_On_1-21-512.png"));

        contactList.add(new Contact("Sonic",
                "102018301",
                "https://cdn4.iconfinder.com/data/icons/famous-characters-add-on-vol-1-flat/48/Famous_Character_-_Add_On_1-26-512.png"));


        rvContact.setAdapter(contactAdapter);
        rvContact.setLayoutManager(new LinearLayoutManager(this));
    }


    @Override
    public void onClick(View view, int position) {
        Contact contact = contactList.get(position);
        Toast.makeText(this, contact.getNama(), Toast.LENGTH_SHORT).show();
    }
}
