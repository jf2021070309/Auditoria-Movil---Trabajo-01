package com.yasirkula.unity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.util.Log;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
/* loaded from: classes2.dex */
public class NativeShareBroadcastListener extends BroadcastReceiver {
    private static final String BROADCAST_RECEIVER_FILTER = "com.yasirkula.unity.NATIVESHARE_RESULTRECEIVER";
    private static NativeShareBroadcastListener broadcastReceiver;

    public static IntentSender Initialize(Context context) {
        if (broadcastReceiver == null) {
            broadcastReceiver = new NativeShareBroadcastListener();
            ((Activity) context).getApplication().registerReceiver(broadcastReceiver, new IntentFilter(BROADCAST_RECEIVER_FILTER));
        }
        return PendingIntent.getBroadcast(context, 0, new Intent(BROADCAST_RECEIVER_FILTER), 134217728).getIntentSender();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (broadcastReceiver != null) {
            context.getApplicationContext().unregisterReceiver(broadcastReceiver);
            broadcastReceiver = null;
        } else {
            Log.e(CrashlyticsReport.DEVELOPMENT_PLATFORM_UNITY, "ShareResultBroadcastReceiver was null!");
        }
        if (NativeShare.shareResultReceiver != null) {
            ComponentName componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
            if (componentName != null) {
                String flattenToString = componentName.flattenToString();
                Log.d(CrashlyticsReport.DEVELOPMENT_PLATFORM_UNITY, "Shared on app: " + flattenToString);
                NativeShare.shareResultReceiver.OnShareCompleted(1, flattenToString);
                return;
            }
            Log.d(CrashlyticsReport.DEVELOPMENT_PLATFORM_UNITY, "Shared on app: Unknown");
            NativeShare.shareResultReceiver.OnShareCompleted(1, "");
            return;
        }
        Log.e(CrashlyticsReport.DEVELOPMENT_PLATFORM_UNITY, "NativeShareResultReceiver was null!");
    }
}
