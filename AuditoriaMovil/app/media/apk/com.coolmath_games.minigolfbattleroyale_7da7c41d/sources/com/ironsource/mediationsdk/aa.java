package com.ironsource.mediationsdk;

import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes2.dex */
public final class aa {
    ab a;
    private com.ironsource.mediationsdk.utils.b b;
    private Timer c = null;

    public aa(com.ironsource.mediationsdk.utils.b bVar, ab abVar) {
        this.b = bVar;
        this.a = abVar;
    }

    private void e() {
        Timer timer = this.c;
        if (timer != null) {
            timer.cancel();
            this.c = null;
        }
    }

    public final synchronized void a() {
        if (this.b.m) {
            e();
            Timer timer = new Timer();
            this.c = timer;
            timer.schedule(new TimerTask() { // from class: com.ironsource.mediationsdk.aa.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    aa.this.a.d();
                }
            }, this.b.k);
        }
    }

    public final synchronized void b() {
        if (!this.b.m) {
            e();
            Timer timer = new Timer();
            this.c = timer;
            timer.schedule(new TimerTask() { // from class: com.ironsource.mediationsdk.aa.2
                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    aa.this.a.d();
                }
            }, this.b.k);
        }
    }

    public final void c() {
        synchronized (this) {
            e();
        }
        this.a.d();
    }

    public final synchronized void d() {
        e();
        Timer timer = new Timer();
        this.c = timer;
        timer.schedule(new TimerTask() { // from class: com.ironsource.mediationsdk.aa.3
            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                aa.this.a.d();
            }
        }, this.b.j);
    }
}
