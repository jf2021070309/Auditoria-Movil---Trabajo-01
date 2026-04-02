package com.ellation.crunchyroll.presentation.download.notification;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.amazon.aps.iva.b10.d;
import com.amazon.aps.iva.sv.h;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: NotificationsDismissService.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ellation/crunchyroll/presentation/download/notification/NotificationsDismissService;", "Landroid/app/Service;", "<init>", "()V", "downloading_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class NotificationsDismissService extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        d dVar = new d(this);
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                startForeground(-1, dVar.l());
            } catch (ForegroundServiceStartNotAllowedException e) {
                com.amazon.aps.iva.mf0.a.a.k(e, "Failed to start foreground service!", new Object[0]);
            }
        } else {
            startForeground(-1, dVar.l());
        }
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        int i = h.a;
        h hVar = h.a.a;
        if (hVar != null) {
            hVar.c().W();
            stopSelf();
            return;
        }
        j.m("instance");
        throw null;
    }
}
