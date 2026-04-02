package com.amazon.aps.iva.u9;

import androidx.work.impl.WorkDatabase;
import com.amazon.aps.iva.k9.t;
/* compiled from: StopWorkRunnable.java */
/* loaded from: classes.dex */
public final class l implements Runnable {
    public final com.amazon.aps.iva.l9.k b;
    public final String c;
    public final boolean d;

    static {
        com.amazon.aps.iva.k9.m.e("StopWorkRunnable");
    }

    public l(com.amazon.aps.iva.l9.k kVar, String str, boolean z) {
        this.b = kVar;
        this.c = str;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean containsKey;
        boolean i;
        com.amazon.aps.iva.l9.k kVar = this.b;
        WorkDatabase workDatabase = kVar.c;
        com.amazon.aps.iva.l9.d dVar = kVar.f;
        com.amazon.aps.iva.t9.q n = workDatabase.n();
        workDatabase.c();
        try {
            String str = this.c;
            synchronized (dVar.l) {
                containsKey = dVar.g.containsKey(str);
            }
            if (this.d) {
                i = this.b.f.h(this.c);
            } else {
                if (!containsKey) {
                    com.amazon.aps.iva.t9.r rVar = (com.amazon.aps.iva.t9.r) n;
                    if (rVar.f(this.c) == t.RUNNING) {
                        rVar.n(t.ENQUEUED, this.c);
                    }
                }
                i = this.b.f.i(this.c);
            }
            com.amazon.aps.iva.k9.m c = com.amazon.aps.iva.k9.m.c();
            String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.c, Boolean.valueOf(i));
            c.a(new Throwable[0]);
            workDatabase.h();
        } finally {
            workDatabase.f();
        }
    }
}
