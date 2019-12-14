package com.example.simranjeetkaur_764937_ft;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class verificationactivity extends AppCompatActivity {


    CheckBox checkBox;
ArrayList<Integer> verified = new ArrayList<Integer>();
    ArrayList<Integer> notverified = new ArrayList<Integer>();

    ArrayList<String> Storeddetail = new ArrayList<String>();

    int verifiedbox;
    int notverifiedbox;

    public void changeSourse1(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.checked_copy);
        imageView.setBackgroundResource(R.drawable.img1);
        imageView.animate().alpha(0.5f);
        verified.add(1);


    }

    public void changeSourse2(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.checked_copy);
        imageView.setBackgroundResource(R.drawable.img2);
        verified.add(2);

        imageView.animate().alpha(0.5f);
    }

    public void changeSourse3(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.checked_copy);
        imageView.setBackgroundResource(R.drawable.img3);
        verified.add(3);
        imageView.animate().alpha(0.5f);
    }

    public void changeSourse4(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.checked_copy);
        imageView.setBackgroundResource(R.drawable.img4);
        verified.add(4);
        imageView.animate().alpha(0.5f);
    }

    public void changeSourse5(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.checked_copy);
        imageView.setBackgroundResource(R.drawable.img5);
        notverified.add(1);
        imageView.animate().alpha(0.5f);
    }

    public void changeSourse6(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.checked_copy);
        imageView.setBackgroundResource(R.drawable.img6);
        notverified.add(2);
        imageView.animate().alpha(0.5f);
    }

    public void changeSourse7(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.checked_copy);
        imageView.setBackgroundResource(R.drawable.img7);
        notverified.add(3);
        imageView.animate().alpha(0.5f);
    }

    public void changeSourse8(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.checked_copy);
        imageView.setBackgroundResource(R.drawable.img8);
        notverified.add(4);
        imageView.animate().alpha(0.5f);
    }

    public void changeSourse9(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.checked_copy);
        imageView.setBackgroundResource(R.drawable.img9);
        notverified.add(1);
        imageView.animate().alpha(0.5f);
    }

    public void btn_setdialog(View view) {
    }


    Button button;
    TextView textView;
    Button refresh;
    int[] images;
    GridLayout gridLayout;

//    ArrayList<Integer> correctimages;
//    ArrayList<Integer> matching;
//    ArrayList<Integer> checkedimages;

    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView7;
    ImageView imageView8;
    ImageView imageView9;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verificationactivity);

        checkBox = findViewById(R.id.checkboxid1);
        button = findViewById(R.id.verifybutton);
        refresh = findViewById(R.id.refresh);
         textView = findViewById(R.id.textview);
        imageView1 = findViewById(R.id.image_view1);
        imageView2 = findViewById(R.id.image_view2);
        imageView3 = findViewById(R.id.image_view3);
        imageView4 = findViewById(R.id.image_view4);
        imageView5 = findViewById(R.id.image_view5);
        imageView6 = findViewById(R.id.image_view6);
        imageView7 = findViewById(R.id.image_view7);
        imageView8 = findViewById(R.id.image_view8);
        imageView9 = findViewById(R.id.image_view9);

     verifiedbox = verified.size();
     notverifiedbox = notverified.size();


//


//

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (!checkBox.isChecked()) {
                    Toast.makeText(verificationactivity.this, "check the checkbox", Toast.LENGTH_LONG).show();

                } else {
                    Toast.makeText(verificationactivity.this, "uncheck the checkbox", Toast.LENGTH_LONG).show();


                }
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (verified.size() <4 || !checkBox.isChecked() || !notverified.isEmpty()) {

                    new AlertDialog.Builder(verificationactivity.this).setTitle("Not verify").setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    }).show();


                    Toast.makeText(verificationactivity.this, "not verified" + verifiedbox + "and" + notverifiedbox, Toast.LENGTH_LONG).show();
                }

                else if (verified.size() == 4 && notverified.isEmpty() && checkBox.isChecked() ){
                    new AlertDialog.Builder(verificationactivity.this).setTitle("Verified").setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            Intent intent = getIntent();
                            String nametxt = intent.getExtras().getString("name");
                            String emailtxt = intent.getExtras().getString("email");
                            String phonetxt = intent.getExtras().getString("phone");
                            Storeddetail.add(nametxt);
                            Storeddetail.add(emailtxt);
                            Storeddetail.add(phonetxt);

                            Intent i = new Intent(verificationactivity.this, MainActivity.class);
                           
                            startActivity(i);

                        }


                        }).show();

                    Toast.makeText(verificationactivity.this, " verified" , Toast.LENGTH_LONG).show();

                }

//                openDialog();
//
//                Intent intent = new Intent(verificationactivity.this, MainActivity.class);
//                startActivity(intent);


            }
        });


        refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

        imageView1.setImageResource(R.drawable.img1);
        imageView2.setImageResource(R.drawable.img2);
        imageView3.setImageResource(R.drawable.img3);
        imageView4.setImageResource(R.drawable.img4);
        imageView5.setImageResource(R.drawable.img5);
        imageView6.setImageResource(R.drawable.img6);
        imageView7.setImageResource(R.drawable.img7);
        imageView8.setImageResource(R.drawable.img8);
        imageView9.setImageResource(R.drawable.img9);
            }
        });

    }

//    public void openDialog() {
//        dialogclass dialogclass = new dialogclass();
//        dialogclass.show(getSupportFragmentManager(), "example dialog");
//
//        android.app.AlertDialog.Builder builder = new AlertDialog.Builder(verificationactivity.this);
//        builder.setTitle("Verified")
//                .setMessage("")
//                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//
//                        Intent intent = new Intent(verificationactivity.this, MainActivity.class);
//                        startActivity(intent);
//
//                    }
//                });


    //}


//


//    public void btn_setdialog(View view){
//
//
//
//          final   AlertDialog.Builder builder = new AlertDialog.Builder(verificationactivity.this);
//
//            View mview = getLayoutInflater().inflate(R.layout.dialogbox, null);
//
//            final TextView textview = findViewById(R.id.txtinput);
//            Button okBUTTON = findViewById(R.id.dialogbtn);
//
//            builder.setView(mview);
//
//            final AlertDialog alertDialog = builder.create();
//            alertDialog.setCanceledOnTouchOutside(false);
//
//            okBUTTON.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    alertDialog.dismiss();
//                    Intent intent = new Intent(verificationactivity.this,MainActivity.class);
//                    startActivity(intent);
//                }
//            });


    //}



}


