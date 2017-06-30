package me.spotytube.sampleapp;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/**
 * Created by oussa on 30/06/2017.
 */

public class FragTime  extends DialogFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_my_dialog, container, false);
        getDialog().setTitle("Simple Dialog");
        return rootView;
    }


}

