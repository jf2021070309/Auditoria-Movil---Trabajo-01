package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
/* renamed from: com.ironsource.mediationsdk.w  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0129w {
    InterfaceC0109c a;
    private Runnable b = new Runnable() { // from class: com.ironsource.mediationsdk.w.1
        @Override // java.lang.Runnable
        public final void run() {
            IronLog.INTERNAL.info("loaded ads are expired");
            if (C0129w.this.a != null) {
                C0129w.this.a.c_();
            }
        }
    };
    private int c;
    private com.ironsource.lifecycle.f d;

    public C0129w(int i, InterfaceC0109c interfaceC0109c) {
        this.c = 0;
        this.a = interfaceC0109c;
        this.c = i;
    }

    private boolean b() {
        return this.c > 0;
    }

    public final void a() {
        if (!b() || this.d == null) {
            return;
        }
        IronLog.INTERNAL.info("canceling expiration timer");
        this.d.c();
        this.d = null;
    }

    public final void a(long j) {
        if (b()) {
            long millis = TimeUnit.MINUTES.toMillis(this.c) - Math.max(j, 0L);
            if (millis <= 0) {
                IronLog.INTERNAL.info("no delay - onAdExpired called");
                this.a.c_();
                return;
            }
            a();
            this.d = new com.ironsource.lifecycle.f(millis, this.b, true);
            Calendar calendar = Calendar.getInstance();
            calendar.add(14, (int) millis);
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.info("loaded ads will expire on: " + calendar.getTime() + " in " + String.format("%.2f", Double.valueOf((millis / 1000.0d) / 60.0d)) + " minutes");
        }
    }
}
