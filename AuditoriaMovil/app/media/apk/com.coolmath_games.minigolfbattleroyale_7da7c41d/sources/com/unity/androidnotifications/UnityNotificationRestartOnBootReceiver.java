package com.unity.androidnotifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Calendar;
import java.util.Date;
/* loaded from: classes2.dex */
public class UnityNotificationRestartOnBootReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            for (Intent intent2 : UnityNotificationManager.loadNotificationIntents(context)) {
                long longExtra = intent2.getLongExtra("fireTime", 0L);
                Date time = Calendar.getInstance().getTime();
                Date date = new Date(longExtra);
                int intExtra = intent2.getIntExtra("id", -1);
                boolean z = intent2.getLongExtra("repeatInterval", 0L) > 0;
                if (date.after(time) || z) {
                    Intent buildNotificationIntent = UnityNotificationManager.buildNotificationIntent(context, intent2, UnityNotificationManager.getActivityPendingIntent(context, intExtra, UnityNotificationManager.buildOpenAppIntent(intent2, context, UnityNotificationUtilities.getOpenAppActivity(context, true)), 0));
                    UnityNotificationManager.scheduleNotificationIntentAlarm(context, buildNotificationIntent, UnityNotificationManager.getBroadcastPendingIntent(context, intExtra, buildNotificationIntent, 134217728));
                } else {
                    UnityNotificationManager.deleteExpiredNotificationIntent(context, Integer.toString(intExtra));
                }
            }
        }
    }
}
