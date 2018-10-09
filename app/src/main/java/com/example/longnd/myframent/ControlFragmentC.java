package com.example.longnd.myframent;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ControlFragmentC extends Fragment {
    private TextView text1;
    private  Acount acount= new Acount();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragmentc, container,false);
        text1 = (TextView) v.findViewById(R.id.textC);
        Bundle bund = getArguments();
        if(bund!=null) {
            acount = (Acount) bund.getSerializable("acount");
            text1.setText(text1.getText().toString() + " " + acount.getName() +" "+ acount.getPass());
        }
        return  v;

    }
}
