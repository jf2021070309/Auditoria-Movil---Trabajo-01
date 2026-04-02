package com.ellation.crunchyroll.presentation.download.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.service.notification.StatusBarNotification;
import com.amazon.aps.iva.b10.i;
import com.amazon.aps.iva.c3.g0;
import com.amazon.aps.iva.c3.s;
import com.amazon.aps.iva.sv.e;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.presentation.download.notification.NotificationDismissReceiver;
import java.util.ArrayList;
/* compiled from: BaseNotification.kt */
/* loaded from: classes2.dex */
public abstract class a {
    public final Context a;
    public final i b;
    public final NotificationManager c;
    public final String d;

    public a(Context context) {
        com.amazon.aps.iva.zv.b bVar = e.e;
        if (bVar != null) {
            i k = bVar.k();
            j.f(context, "context");
            j.f(k, "intentBuilder");
            this.a = context;
            this.b = k;
            Object systemService = context.getSystemService("notification");
            j.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            this.c = (NotificationManager) systemService;
            String string = context.getString(R.string.channel_id_syncing);
            j.e(string, "context.getString(\n     ….channel_id_syncing\n    )");
            this.d = string;
            return;
        }
        j.m("dependencies");
        throw null;
    }

    public final void a(int i) {
        this.c.cancel(i);
    }

    public final boolean g(int i) {
        boolean z;
        StatusBarNotification[] activeNotifications = this.c.getActiveNotifications();
        j.e(activeNotifications, "systemNotificationManager.activeNotifications");
        for (StatusBarNotification statusBarNotification : activeNotifications) {
            if (statusBarNotification.getId() == i) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final Notification l() {
        String str = this.d;
        Context context = this.a;
        s sVar = new s(context, str);
        sVar.E.icon = R.drawable.ic_cr_notification;
        sVar.v = com.amazon.aps.iva.d3.a.getColor(context, R.color.primary);
        sVar.q = "notifications_group_id";
        sVar.f(16, true);
        sVar.r = true;
        sVar.f(8, true);
        Notification b = sVar.b();
        j.e(b, "Builder(context, notific…rue)\n            .build()");
        return b;
    }

    public final s m(PlayableAsset playableAsset, String str) {
        j.f(str, "notificationId");
        Context context = this.a;
        s sVar = new s(context, this.d);
        Notification notification = sVar.E;
        notification.icon = R.drawable.ic_cr_notification;
        sVar.q = "notifications_group_id";
        sVar.f(16, true);
        sVar.f(8, true);
        sVar.v = com.amazon.aps.iva.d3.a.getColor(context, R.color.primary);
        ArrayList arrayList = new ArrayList();
        i iVar = this.b;
        Intent b = iVar.b();
        b.putExtra("show_downloads_from_notification", true);
        b.addFlags(268468224);
        arrayList.add(b);
        if (playableAsset != null) {
            arrayList.add(iVar.a(playableAsset, str));
        }
        int hashCode = str.hashCode();
        if (!arrayList.isEmpty()) {
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            PendingIntent a = g0.a.a(context, hashCode, intentArr, 201326592, null);
            j.c(a);
            sVar.g = a;
            Context applicationContext = context.getApplicationContext();
            int hashCode2 = str.hashCode();
            int i = NotificationDismissReceiver.a;
            PendingIntent broadcast = PendingIntent.getBroadcast(applicationContext, hashCode2, NotificationDismissReceiver.a.a(context, str), 67108864);
            j.e(broadcast, "getBroadcast(\n          ….FLAG_IMMUTABLE\n        )");
            notification.deleteIntent = broadcast;
            return sVar;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
    }

    public final void n(int i, s sVar) {
        Notification b = sVar.b();
        NotificationManager notificationManager = this.c;
        notificationManager.notify(i, b);
        notificationManager.notify(-1, l());
    }
}
