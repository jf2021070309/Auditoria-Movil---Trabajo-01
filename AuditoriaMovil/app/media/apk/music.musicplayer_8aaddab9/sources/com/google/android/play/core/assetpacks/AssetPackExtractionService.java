package com.google.android.play.core.assetpacks;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import e.d.b.d.a;
import e.d.b.e.a.a.l0;
import e.d.b.e.a.a.q2;
import e.d.b.e.a.a.v2;
import e.d.b.e.a.a.x;
import e.d.b.e.a.a.z;
import e.d.b.e.a.c.e;
import java.util.Objects;
/* loaded from: classes2.dex */
public class AssetPackExtractionService extends Service {
    public final e a = new e("AssetPackExtractionService");

    /* renamed from: b  reason: collision with root package name */
    public Context f4723b;

    /* renamed from: c  reason: collision with root package name */
    public q2 f4724c;

    /* renamed from: d  reason: collision with root package name */
    public z f4725d;

    /* renamed from: e  reason: collision with root package name */
    public x f4726e;

    /* renamed from: f  reason: collision with root package name */
    public NotificationManager f4727f;

    public final synchronized void a() {
        this.a.a(4, "Stopping service.", new Object[0]);
        this.f4724c.a(false);
        stopForeground(true);
        stopSelf();
    }

    public final synchronized void b(Bundle bundle) {
        String string = bundle.getString("notification_title");
        String string2 = bundle.getString("notification_subtext");
        long j2 = bundle.getLong("notification_timeout");
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("notification_on_click_intent");
        int i2 = Build.VERSION.SDK_INT;
        Notification.Builder timeoutAfter = i2 >= 26 ? new Notification.Builder(this.f4723b, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(j2) : new Notification.Builder(this.f4723b).setPriority(-2);
        if (pendingIntent != null) {
            timeoutAfter.setContentIntent(pendingIntent);
        }
        timeoutAfter.setSmallIcon(17301633).setOngoing(false).setContentTitle(string).setSubText(string2);
        if (i2 >= 21) {
            timeoutAfter.setColor(bundle.getInt("notification_color")).setVisibility(-1);
        }
        Notification build = timeoutAfter.build();
        this.a.a(4, "Starting foreground service.", new Object[0]);
        this.f4724c.a(true);
        if (i2 >= 26) {
            this.f4727f.createNotificationChannel(new NotificationChannel("playcore-assetpacks-service-notification-channel", bundle.getString("notification_channel_name"), 2));
        }
        startForeground(-1883842196, build);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f4726e;
    }

    @Override // android.app.Service
    public final void onCreate() {
        l0 l0Var;
        super.onCreate();
        this.a.a(3, "onCreate", new Object[0]);
        Context applicationContext = getApplicationContext();
        synchronized (a.class) {
            if (a.a == null) {
                Context applicationContext2 = applicationContext.getApplicationContext();
                if (applicationContext2 != null) {
                    applicationContext = applicationContext2;
                }
                a.a = new l0(new v2(applicationContext));
            }
            l0Var = a.a;
        }
        Context context = l0Var.a.a;
        Objects.requireNonNull(context, "Cannot return null from a non-@Nullable @Provides method");
        this.f4723b = context;
        this.f4724c = l0Var.y.a();
        this.f4725d = l0Var.f6834d.a();
        this.f4726e = new x(this.f4723b, this, this.f4725d);
        this.f4727f = (NotificationManager) this.f4723b.getSystemService("notification");
    }
}
