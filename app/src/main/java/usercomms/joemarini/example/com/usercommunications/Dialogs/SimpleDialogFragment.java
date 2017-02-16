package usercomms.joemarini.example.com.usercommunications.Dialogs;

import android.app.Activity;
import android.app.Dialog;
import android.support.v7.app.AlertDialog;
import android.support.v4.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;

public class SimpleDialogFragment extends DialogFragment {
    private final String TAG = "AUC_SIMPLE";

    // TODO: Implement an interface for hosts to get callbacks
    public interface  SimpleDialogListener{
        public void onPositiveResult(DialogFragment fragment);
        public void onNegativeResult(DialogFragment fragment);
        public void onNeutralResult(DialogFragment fragment);
    }

    private SimpleDialogListener myHost;


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        //Create an AlertDialog.Builder instance
        AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());

        //Set builder properties
        alert.setTitle("Peas Preferences");
        alert.setMessage("Do you like sugar snap peas?");
        alert.setPositiveButton("Sure", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Log.i(TAG, "SURE CLICKED");
                myHost.onPositiveResult(SimpleDialogFragment.this); //Chamando os metodos da interface
            }
        });
        alert.setNegativeButton("Noooo", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Log.i(TAG, "NO CLICKED");
                myHost.onNegativeResult(SimpleDialogFragment.this);

            }
        });

        alert.setNeutralButton("DON'T KNOW", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Log.i(TAG, "NOT SURE");
                myHost.onNeutralResult(SimpleDialogFragment.this);

            }
        });



        //  return the created dialog
        return alert.create();
    }

    // TODO: Listen for cancel message by overriding onCancel

    @Override
    public void onCancel(DialogInterface dialog) {
        super.onCancel(dialog);
        Log.i(TAG, "Dialog Canceled");
    }


    // TODO: Override onAttach to get Activity instance

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        myHost = (SimpleDialogListener)activity; //Instanciando o atributo interface a partir da activity - as activities que chamarem esse SimpleDialogFragment devem implementar essa interface
    }
}
