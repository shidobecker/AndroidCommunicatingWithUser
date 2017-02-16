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
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(this);

        // TODO: Create the intent that will start the ResultActivity when the user
        Intent i = new Intent(this, NotificationActivity.class);
        i.putExtra("notifyID", NOTIFY_ID);
        i.setAction("Action 1");
        PendingIntent pendingIntent = PendingIntent.getActivity(this, NOTIFY_ID, i, PendingIntent.FLAG_CANCEL_CURRENT);


        // taps the notification or chooses an action button

        // Store the notification ID so we can cancel it later in the ResultActivity

        // TODO: Set the three required items all notifications must have
        notificationBuilder.setSmallIcon(R.drawable.ic_stat_sample_notification);
       // notificationBuilder.setContentTitle("Sample Notification");
        //notificationBuilder.setContentText("Notification Sample Text");

        // TODO: Set the notification to cancel when the user taps on it
        notificationBuilder.setAutoCancel(true);


        // TODO: Set the large icon to be our app's launcher icon
        notificationBuilder.setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));

        // TODO: Set the small subtext message
        notificationBuilder.setSubText("Subtext of Notification");

        // TODO: Set the content intent to launch our result activity
        notificationBuilder.setContentIntent(pendingIntent);

        // TODO: Add an expanded layout to the notification
        NotificationCompat.BigTextStyle bigTextStyle = new NotificationCompat.BigTextStyle();
        bigTextStyle.setBigContentTitle("BIG TEXT STYLE SUMMARY TEXT");
        bigTextStyle.bigText(getResources().getString(R.string.LongMsg));
        notificationBuilder.setStyle(bigTextStyle);

        // TODO: Add action buttons to the Notification if they are supported
        // Use the same PendingIntent as we use for the main notification action
            notificationBuilder.addAction(R.mipmap.ic_launcher, "Action 1", pendingIntent);
        notificationBuilder.addAction(R.mipmap.ic_launcher, "Action 2", pendingIntent);

        // TODO: Set the lock screen visibility of the notification
        notificationBuilder.setVisibility(Notification.VISIBILITY_PUBLIC);

        // TODO: Build the finished notification and then display it to the user
        Notification notification = notificationBuilder.build();
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify(NOTIFY_ID, notification);


    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnNotification) {
            createNotification();
        }
    }
}
