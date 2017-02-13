package usercomms.joemarini.example.com.usercommunications;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
    implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnLaunchToast).setOnClickListener(this);
        findViewById(R.id.btnLaunchSnackbar).setOnClickListener(this);
        findViewById(R.id.btnLaunchDialog).setOnClickListener(this);
        findViewById(R.id.btnLaunchNotification).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnLaunchToast:
                startActivity(new Intent(this, ToastActivity.class));
                break;
            case R.id.btnLaunchSnackbar:
                startActivity(new Intent(this, SnackbarActivity.class));
                break;
            case R.id.btnLaunchDialog:
                startActivity(new Intent(this, DialogActivity.class));
                break;
            case R.id.btnLaunchNotification:
                startActivity(new Intent(this, NotificationActivity.class));
                break;
        }
    }
}
