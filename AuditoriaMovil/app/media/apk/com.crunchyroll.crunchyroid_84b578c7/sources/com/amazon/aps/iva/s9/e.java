package com.amazon.aps.iva.s9;

import androidx.work.impl.foreground.SystemForegroundService;
/* compiled from: SystemForegroundService.java */
/* loaded from: classes.dex */
public final class e implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ SystemForegroundService c;

    public e(SystemForegroundService systemForegroundService, int i) {
        this.c = systemForegroundService;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.f.cancel(this.b);
    }
}
