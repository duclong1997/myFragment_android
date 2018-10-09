package com.example.longnd.myframent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{
   private EditText edit1, edit2t;
   private Button but1;
   private  Acount acount = new Acount();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1 = (EditText) findViewById(R.id.edit1);
        edit2t =(EditText) findViewById(R.id.edit2);
        but1= (Button) findViewById(R.id.click1);
        but1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        int id= v.getId();
        String textname = edit1.getText().toString();
        String textpass= edit2t.getText().toString();
        if(id== R.id.click1){
            acount.setName(textname);
            acount.setPass(textpass);
            Intent intent= new Intent(getApplicationContext(), activity2.class);
            intent.putExtra("hello", acount );
            startActivity(intent);
        }
    }
}
