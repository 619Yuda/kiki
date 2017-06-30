package me.spotytube.sampleapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;



/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {


    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View v = inflater.inflate(R.layout.fragment_second, container, false);




       /*Button button2  = (Button) v.findViewById(R.id.Location);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                //Here
                MyDialogFragment dialog =  new MyDialogFragment();;
                dialog.show(getFragmentManager(), "dialog_login");
            }
        });*/

        Button button  = (Button) v.findViewById(R.id.time);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                /*Here
                MyDialogFragment dialog =  new MyDialogFragment();;
                dialog.show(getFragmentManager(), "fragmentDialog");*/

                FragmentManager fm = getFragmentManager();
                FragTime dialogFragment = new FragTime();
                dialogFragment.show(fm, "Time");
            }
        });





        return v;

    }



}