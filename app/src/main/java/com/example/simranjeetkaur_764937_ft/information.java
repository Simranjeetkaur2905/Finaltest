package com.example.simranjeetkaur_764937_ft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class information extends AppCompatActivity {

    EditText name,email,phone ;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        name = findViewById(R.id.Name);
        email = findViewById(R.id.Email);
        phone = findViewById(R.id.Phone);
        save = findViewById(R.id.Save);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               String nametext = name.getText().toString();
                String emailtext = email.getText().toString();

                String phonetext = phone.getText().toString();

                if(nametext.isEmpty() && emailtext.isEmpty() && phonetext.isEmpty())
                {
                    Toast.makeText(information.this,"you should fill all the fields",Toast.LENGTH_LONG).show();

                }

                else{


                    Intent intent = new Intent(information.this,verificationactivity.class);

                    intent.putExtra("name",nametext);
                    intent.putExtra("email",emailtext);

                    intent.putExtra("phone",phonetext);

//                    i.putExtra("choose car",spinnertext);
//                    i.putExtra("dailyrentvalue", dailytext1);
//                    i.putExtra("numberofdaysss",numberofdays1);
//                    i.putExtra("value without tax",value);
//                    i.putExtra("total amount",totalvalue);




                    startActivity(intent);





                }

            }
        });
    }
}
