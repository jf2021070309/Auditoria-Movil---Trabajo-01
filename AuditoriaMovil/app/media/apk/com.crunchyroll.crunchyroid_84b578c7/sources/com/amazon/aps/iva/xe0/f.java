package com.amazon.aps.iva.xe0;

import com.amazon.aps.iva.se0.d0;
import com.amazon.aps.iva.se0.l0;
import com.amazon.aps.iva.se0.o0;
import com.amazon.aps.iva.se0.t0;
/* compiled from: LimitedDispatcher.kt */
/* loaded from: classes4.dex */
public final class f extends d0 implements Runnable, o0 {
    public final d0 c;
    public final int d;
    public final /* synthetic */ o0 e;
    public final i<Runnable> f;
    public final Object g;
    private volatile int runningWorkers;

    public f(com.amazon.aps.iva.ye0.l lVar, int i) {
        o0 o0Var;
        this.c = lVar;
        this.d = i;
        if (lVar instanceof o0) {
            o0Var = (o0) lVar;
        } else {
            o0Var = null;
        }
        this.e = o0Var == null ? l0.a : o0Var;
        this.f = new i<>();
        this.g = new Object();
    }

    @Override // com.amazon.aps.iva.se0.o0
    public final t0 h(long j, Runnable runnable, com.amazon.aps.iva.ob0.g gVar) {
        return this.e.h(j, runnable, gVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
        r0 = r3.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
        r3.runningWorkers--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
        if (r3.f.c() != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
        r3.runningWorkers++;
        r1 = com.amazon.aps.iva.kb0.q.a;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r3 = this;
        L0:
            r0 = 0
        L1:
            com.amazon.aps.iva.xe0.i<java.lang.Runnable> r1 = r3.f
            java.lang.Object r1 = r1.d()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            if (r1 == 0) goto L29
            r1.run()     // Catch: java.lang.Throwable -> Lf
            goto L15
        Lf:
            r1 = move-exception
            com.amazon.aps.iva.ob0.h r2 = com.amazon.aps.iva.ob0.h.b
            com.amazon.aps.iva.se0.i.c(r2, r1)
        L15:
            int r0 = r0 + 1
            r1 = 16
            if (r0 < r1) goto L1
            com.amazon.aps.iva.se0.d0 r1 = r3.c
            boolean r1 = r1.B()
            if (r1 == 0) goto L1
            com.amazon.aps.iva.se0.d0 r0 = r3.c
            r0.x(r3, r3)
            return
        L29:
            java.lang.Object r0 = r3.g
            monitor-enter(r0)
            int r1 = r3.runningWorkers     // Catch: java.lang.Throwable -> L46
            int r1 = r1 + (-1)
            r3.runningWorkers = r1     // Catch: java.lang.Throwable -> L46
            com.amazon.aps.iva.xe0.i<java.lang.Runnable> r1 = r3.f     // Catch: java.lang.Throwable -> L46
            int r1 = r1.c()     // Catch: java.lang.Throwable -> L46
            if (r1 != 0) goto L3c
            monitor-exit(r0)
            return
        L3c:
            int r1 = r3.runningWorkers     // Catch: java.lang.Throwable -> L46
            int r1 = r1 + 1
            r3.runningWorkers = r1     // Catch: java.lang.Throwable -> L46
            com.amazon.aps.iva.kb0.q r1 = com.amazon.aps.iva.kb0.q.a     // Catch: java.lang.Throwable -> L46
            monitor-exit(r0)
            goto L0
        L46:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.xe0.f.run():void");
    }

    @Override // com.amazon.aps.iva.se0.o0
    public final void v(long j, com.amazon.aps.iva.se0.n nVar) {
        this.e.v(j, nVar);
    }

    @Override // com.amazon.aps.iva.se0.d0
    public final void x(com.amazon.aps.iva.ob0.g gVar, Runnable runnable) {
        boolean z;
        this.f.a(runnable);
        boolean z2 = true;
        if (this.runningWorkers >= this.d) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            synchronized (this.g) {
                if (this.runningWorkers >= this.d) {
                    z2 = false;
                } else {
                    this.runningWorkers++;
                }
            }
            if (z2) {
                this.c.x(this, this);
            }
        }
    }

    @Override // com.amazon.aps.iva.se0.d0
    public final void y(com.amazon.aps.iva.ob0.g gVar, Runnable runnable) {
        boolean z;
        this.f.a(runnable);
        boolean z2 = true;
        if (this.runningWorkers >= this.d) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            synchronized (this.g) {
                if (this.runningWorkers >= this.d) {
                    z2 = false;
                } else {
                    this.runningWorkers++;
                }
            }
            if (z2) {
                this.c.y(this, this);
            }
        }
    }
}
