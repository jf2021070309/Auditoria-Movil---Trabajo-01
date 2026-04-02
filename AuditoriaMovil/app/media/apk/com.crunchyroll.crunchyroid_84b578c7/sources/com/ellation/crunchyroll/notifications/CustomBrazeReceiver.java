package com.ellation.crunchyroll.notifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.amazon.aps.iva.fz.c;
import com.amazon.aps.iva.fz.d;
import com.amazon.aps.iva.yb0.j;
import com.braze.push.BrazeNotificationUtils;
import kotlin.Metadata;
/* compiled from: CustomBrazeReceiver.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ellation/crunchyroll/notifications/CustomBrazeReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "notifications_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CustomBrazeReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (context != null && intent != null) {
            int i = c.a;
            int i2 = d.a;
            if (j.a(intent.getAction(), "com.braze.push.intent.NOTIFICATION_OPENED")) {
                BrazeNotificationUtils.routeUserWithNotificationOpenedIntent(context, intent);
            }
        }
    }
}
