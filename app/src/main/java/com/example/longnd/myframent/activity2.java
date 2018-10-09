package com.example.longnd.myframent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class activity2 extends AppCompatActivity implements View.OnClickListener {

    private TextView text1, text2;
    private Button but2;
    private  Acount acount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_activity2);
        text1 = (TextView) findViewById(R.id.textAc1);
        text2 = (TextView) findViewById(R.id.textpass);
        Intent intent = getIntent() ;
        acount = (Acount) intent.getSerializableExtra("hello");
        String textname =  text1.getText().toString() +" " + acount.getName() ;
        String textpass1= text2.getText().toString()+" "+acount.getPass();
        but2 = (Button) findViewById(R.id.but1);
        but2.setOnClickListener(this);
        text1.setText(textname);
        text2.setText(textpass1);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if(id== R.id.but1) {
            ControlFragmentB fragB = (ControlFragmentB) getFragmentManager().findFragmentById(R.id.fragB);
            fragB.change(text1.getText().toString());
            // show message for app
            Toast.makeText(this.getApplication(),"Correct", Toast.LENGTH_SHORT).show();
        }
    }
}
