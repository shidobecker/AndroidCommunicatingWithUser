package usercomms.joemarini.example.com.usercommunications;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.view.View;

public class NotificationActivity extends AppCompatActivity
    implements View.OnClickListener{

    private static final int NOTIFY_ID = 1001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        findViewById(R.id.btnNotification).setOnClickListener(this);
    }

    private void createNotification() {
        // TODO: create the NotificationCompat Builder

        // TODO: Create the intent that will start the ResultActivity when the user
        // taps the notification or chooses an action button

        // Store the notification ID so we can cancel it later in the ResultActivity

        // TODO: Set the three required items all notifications must have


        // TODO: Set the notification to cancel when the user taps on it


        // TODO: Set the large icon to be our app's launcher icon


        // TODO: Set the small subtext message


        // TODO: Set the content intent to launch our result activity


        // TODO: Add an expanded layout to the notification


        // TODO: Add action buttons to the Notification if they are supported
        // Use the same PendingIntent as we use for the main notification action

        // TODO: Set the lock screen visibility of the notification


        // TODO: Build the finished notification and then display it to the user

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnNotification) {
            createNotification();
        }
    }
}
