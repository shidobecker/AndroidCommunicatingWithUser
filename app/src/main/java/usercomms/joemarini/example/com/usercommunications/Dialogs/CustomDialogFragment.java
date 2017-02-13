package usercomms.joemarini.example.com.usercommunications.Dialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import usercomms.joemarini.example.com.usercommunications.R;

public class CustomDialogFragment extends DialogFragment {
    private final String TAG = "AUC_CUSTOM";

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        // TODO: Create the custom layout using the LayoutInflater class


        // TODO: Build the dialog
        builder.setTitle("Please enter your name")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.i(TAG, "OK Clicked");
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.i(TAG, "Cancel clicked");
                    }
                });

        return builder.create();
    }
}
