package com.example.longnd.myframent;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ControlFragmentB extends Fragment implements  View.OnClickListener {
    private TextView texB;
    private Button butB1;
    private  Acount acount= new Acount();
    private android.app.FragmentManager fragmentManager;
    private android.app.FragmentTransaction fragmentTransaction;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment_b, container,false);
        texB = (TextView) v.findViewById(R.id.textb);
        fragmentManager = getFragmentManager();
        fragmentTransaction= fragmentManager.beginTransaction();
        butB1 = (Button) v.findViewById(R.id.butB);
        butB1.setOnClickListener(this);


        return  v;
    }


    public  void  change(String name)
    {
        texB.setText(name);
        ControlFragmentC controlFragmentC= new ControlFragmentC();

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Bundle bundle = new Bundle();
        acount.setPass("nguyen");
        acount.setName("duc");
        bundle.putSerializable("acount", acount);
        if(id== R.id.butB)
        {
            // name fragemnt C
            ControlFragmentC conC= new ControlFragmentC();
            conC.setArguments(bundle);

                // add fragment C vao man hinh layout activity_activity2
                // them  android:id="@+id/act2" vao trong layout  activity_activity2
                fragmentTransaction.add(R.id.act2, conC);
                // thuc hien add fragment = code
                fragmentTransaction.commit();
        }
    }
}
