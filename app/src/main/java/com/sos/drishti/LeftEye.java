package com.sos.drishti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LeftEye extends AppCompatActivity {
    private Button button_sbm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_left_eye);
        addListenerOnButton();
    }

    public void addListenerOnButton(){

        button_sbm= findViewById(R.id.button2);
        button_sbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.sos.drishti.RightEye");
                startActivity(intent);

            }
        });

    }
}
