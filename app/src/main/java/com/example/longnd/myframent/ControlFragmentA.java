package com.example.longnd.myframent;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.longnd.myframent.R.id.textAc1;

public class ControlFragmentA extends Fragment implements  View.OnClickListener {
    private EditText editA1;
    private TextView texA1,tet1, textB;
    private  Button butA1, butB;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_a,container,false);
         texA1 =(TextView) v.findViewById(R.id.textA);
            editA1 = (EditText) v.findViewById(R.id.editA);
         butA1 = (Button) v.findViewById(R.id.butA);
         butB = (Button) v.findViewById(R.id.butfragB);
         butA1.setOnClickListener(this);
         butB.setOnClickListener(this);
        return v;

    }

    @Override
    public void onClick(View v) {
        int id= v.getId();
        if(id== R.id.butA)
        {
            tet1= (TextView) getActivity().findViewById(R.id.textAc1);
            String texA= editA1.getText().toString();
            tet1.setText(tet1.getText() +" "+ texA);
        }
        if(id== R.id.butfragB)
        {
            textB= (TextView) getActivity().findViewById(R.id.textb);
            tet1= (TextView) getActivity().findViewById(R.id.textpass);
            textB.setText("hello" +tet1.getText().toString() );
        }

    }
}
