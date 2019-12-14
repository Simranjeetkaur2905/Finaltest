package com.example.simranjeetkaur_764937_ft;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class Viewdialog {

    public void showDialog(final Activity activity,String msg){
        final Dialog dialog = new Dialog((activity));
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialogbox);

        TextView text = (TextView) dialog.findViewById(R.id.txtinput);
        text.setText("Verified");

        Button dialogbutton = dialog.findViewById(R.id.dialogbtn);
        dialogbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
    }
}
