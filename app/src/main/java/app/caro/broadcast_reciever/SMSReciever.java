package app.caro.broadcast_reciever;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;


public class SMSReciever extends BroadcastReceiver {

    public void onReceive(Context context, Intent intent) {

        NotificationManager mNotifyManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
        builder.setContentText("Mensaje recibido")
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("Prueba broadcast reciever");
        mNotifyManager.notify(1, builder.build());

    }
}
