package com.example.simranjeetkaur_764937_ft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

Button register;
ListView listView;
    ArrayAdapter<String> aa;
    ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        register = findViewById(R.id.btn);


        listView = findViewById(R.id.listview1);
        arrayList = new ArrayList<>();

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,information.class);
                startActivity(intent);


                Intent i = getIntent();
                String nametxt = i.getExtras().getString("name");
                String emailtxt = i.getExtras().getString("email");
                String phonetxt = i.getExtras().getString("phone");

                arrayList.add(nametxt);
                arrayList.add(emailtxt);
                arrayList.add(phonetxt);

                listView.deferNotifyDataSetChanged();
                aa = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, arrayList);
                listView.setAdapter(aa);





            }
        });
    }
}
