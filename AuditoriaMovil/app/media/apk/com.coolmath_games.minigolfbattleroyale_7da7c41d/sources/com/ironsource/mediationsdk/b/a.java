package com.ironsource.mediationsdk.b;

import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes2.dex */
public abstract class a<T> {
    protected T a;
    private Timer b;
    private long c;

    public a(long j) {
        this.c = j;
    }

    protected abstract void a();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(T t) {
        if ((this.c <= 0) || t == null) {
            return;
        }
        this.a = t;
        b();
        Timer timer = new Timer();
        this.b = timer;
        timer.schedule(new TimerTask() { // from class: com.ironsource.mediationsdk.b.a.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                a.this.a();
            }
        }, this.c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b() {
        Timer timer = this.b;
        if (timer != null) {
            timer.cancel();
            this.b = null;
        }
    }

    public final void c() {
        this.a = null;
    }
}
