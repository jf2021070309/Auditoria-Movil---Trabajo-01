package com.ironsource.lifecycle;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes2.dex */
public final class f implements c {
    Runnable a;
    private String b = "INTERNAL";
    private Timer c;
    private boolean d;
    private Long e;
    private long f;

    public f(long j, Runnable runnable, boolean z) {
        this.f = j;
        this.a = runnable;
        this.d = false;
        this.e = null;
        if (0 == 0) {
            this.d = true;
            d.a().a(this);
            this.e = Long.valueOf(System.currentTimeMillis() + this.f);
            if (d.a().b()) {
                return;
            }
            d();
        }
    }

    private void d() {
        if (this.c == null) {
            Timer timer = new Timer();
            this.c = timer;
            timer.schedule(new TimerTask() { // from class: com.ironsource.lifecycle.f.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    f.this.a.run();
                }
            }, this.f);
            Calendar.getInstance().setTimeInMillis(this.e.longValue());
        }
    }

    private void e() {
        Timer timer = this.c;
        if (timer != null) {
            timer.cancel();
            this.c = null;
        }
    }

    @Override // com.ironsource.lifecycle.c
    public final void a() {
        Long l;
        if (this.c == null && (l = this.e) != null) {
            long longValue = l.longValue() - System.currentTimeMillis();
            this.f = longValue;
            if (longValue > 0) {
                d();
                return;
            }
            c();
            this.a.run();
        }
    }

    @Override // com.ironsource.lifecycle.c
    public final void b() {
        if (this.c != null) {
            e();
        }
    }

    public final void c() {
        e();
        this.d = false;
        this.e = null;
        d a = d.a();
        if (a.h.contains(this)) {
            a.h.remove(this);
        }
    }
}
