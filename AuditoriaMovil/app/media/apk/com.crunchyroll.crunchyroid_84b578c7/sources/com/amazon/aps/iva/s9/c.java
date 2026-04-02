package com.amazon.aps.iva.s9;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
/* compiled from: SystemForegroundService.java */
/* loaded from: classes.dex */
public final class c implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Notification c;
    public final /* synthetic */ int d;
    public final /* synthetic */ SystemForegroundService e;

    public c(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        this.e = systemForegroundService;
        this.b = i;
        this.c = notification;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = Build.VERSION.SDK_INT;
        Notification notification = this.c;
        int i2 = this.b;
        SystemForegroundService systemForegroundService = this.e;
        if (i >= 29) {
            systemForegroundService.startForeground(i2, notification, this.d);
        } else {
            systemForegroundService.startForeground(i2, notification);
        }
    }
}
