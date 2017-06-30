



    package me.spotytube.sampleapp;

    import android.app.Dialog;
    import android.graphics.drawable.ColorDrawable;
    import android.os.Bundle;
    import android.support.v4.app.DialogFragment;
    import android.view.View;
    import android.view.Window;
    import android.widget.LinearLayout;
    import android.widget.TextView;

    /**
     * Created by oussa on 27/06/2017.
     */

    public class dialog_log extends DialogFragment
    {
        //private View pic;

        public dialog_log()
        {
        }

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState)
        {
            View view =  getActivity().getLayoutInflater().inflate(R.layout.fragment_my_dialog, null);

            Dialog builder = new Dialog(getActivity());
            builder.setContentView(view);
            return builder;
        }
    }
