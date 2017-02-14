package usercomms.joemarini.example.com.usercommunications.Dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.util.Log;

public class SingleChoiceDialogFragment extends DialogFragment {
    private final String TAG = "AUC_COMPLEX";
    // List of choices to display in the dialog
    private final String[] colors = {"Red", "Blue", "Green", "Yellow"};

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        // NOTE: setMessage doesn't work here because the list takes up the content
        // area. Use the setTitle method to set a descriptive prompt
        builder.setTitle("What Is Your Favorite Color?");
        builder.setItems(colors, new DialogInterface.OnClickListener() { //Passando uma lista de opções e o que for selecionado no click listener é passado como [i]
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Log.i(TAG, String.format("Color Chosen: %s", colors[i]));
            }
        });

        // Single-choice dialogs don't need buttons because they
        // auto-dismiss when the user makes a choice

        return builder.create();
    };
}
