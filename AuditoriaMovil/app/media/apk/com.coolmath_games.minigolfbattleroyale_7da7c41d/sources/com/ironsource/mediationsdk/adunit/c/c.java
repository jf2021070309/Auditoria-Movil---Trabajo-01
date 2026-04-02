package com.ironsource.mediationsdk.adunit.c;

import com.ironsource.mediationsdk.ab;
import com.ironsource.mediationsdk.adunit.c.b.a;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes2.dex */
public final class c {
    com.ironsource.mediationsdk.adunit.c.b.a a;
    ab b;
    private Timer c;

    public c(com.ironsource.mediationsdk.adunit.c.b.a aVar, ab abVar) {
        this.a = aVar;
        this.b = abVar;
    }

    private void c() {
        Timer timer = this.c;
        if (timer != null) {
            timer.cancel();
            this.c = null;
        }
    }

    public final void a() {
        if (this.a.a != a.EnumC0086a.MANUAL) {
            a(this.a.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(long j) {
        c();
        Timer timer = new Timer();
        this.c = timer;
        timer.schedule(new TimerTask() { // from class: com.ironsource.mediationsdk.adunit.c.c.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                c.this.b.d();
            }
        }, j);
    }

    public final void b() {
        if (this.a.a != a.EnumC0086a.MANUAL) {
            a(0L);
        }
    }
}
