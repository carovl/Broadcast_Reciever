package app.caro.broadcast_reciever;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;


public class IncomingCall extends BroadcastReceiver {

    public void onReceive(Context context, Intent intent) {

        NotificationManager mNotifyManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
        builder.setContentText("LLamada recibida")
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("Prueba broadcast reciver");
        mNotifyManager.notify(1, builder.build());

    }

    //http://androidexample.com/Incomming_Phone_Call_Broadcast_Receiver__-_Android_Example/index.php?view=article_discription&aid=61
}
