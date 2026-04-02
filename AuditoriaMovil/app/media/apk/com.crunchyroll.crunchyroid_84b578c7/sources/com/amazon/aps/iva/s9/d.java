package com.amazon.aps.iva.s9;

import android.app.Notification;
import androidx.work.impl.foreground.SystemForegroundService;
/* compiled from: SystemForegroundService.java */
/* loaded from: classes.dex */
public final class d implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Notification c;
    public final /* synthetic */ SystemForegroundService d;

    public d(SystemForegroundService systemForegroundService, int i, Notification notification) {
        this.d = systemForegroundService;
        this.b = i;
        this.c = notification;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.f.notify(this.b, this.c);
    }
}
