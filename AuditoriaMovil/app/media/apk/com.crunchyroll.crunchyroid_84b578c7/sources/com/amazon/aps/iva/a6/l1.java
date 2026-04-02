package com.amazon.aps.iva.a6;

import android.os.Looper;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.TimeoutException;
/* compiled from: PlayerMessage.java */
/* loaded from: classes.dex */
public final class l1 {
    public final b a;
    public final a b;
    public final com.amazon.aps.iva.t5.d c;
    public int d;
    public Object e;
    public final Looper f;
    public boolean g;
    public boolean h;
    public boolean i;

    /* compiled from: PlayerMessage.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* compiled from: PlayerMessage.java */
    /* loaded from: classes.dex */
    public interface b {
        void l(int i, Object obj) throws l;
    }

    public l1(q0 q0Var, b bVar, com.amazon.aps.iva.q5.r0 r0Var, int i, com.amazon.aps.iva.t5.d dVar, Looper looper) {
        this.b = q0Var;
        this.a = bVar;
        this.f = looper;
        this.c = dVar;
    }

    public final synchronized void a(long j) throws InterruptedException, TimeoutException {
        boolean z;
        boolean z2;
        com.amazon.aps.iva.cq.b.C(this.g);
        if (this.f.getThread() != Thread.currentThread()) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.C(z);
        long elapsedRealtime = this.c.elapsedRealtime() + j;
        while (true) {
            z2 = this.i;
            if (z2 || j <= 0) {
                break;
            }
            this.c.c();
            wait(j);
            j = elapsedRealtime - this.c.elapsedRealtime();
        }
        if (!z2) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void b(boolean z) {
        this.h = z | this.h;
        this.i = true;
        notifyAll();
    }

    @CanIgnoreReturnValue
    public final void c() {
        com.amazon.aps.iva.cq.b.C(!this.g);
        this.g = true;
        q0 q0Var = (q0) this.b;
        synchronized (q0Var) {
            if (!q0Var.A && q0Var.k.getThread().isAlive()) {
                q0Var.i.d(14, this).a();
                return;
            }
            com.amazon.aps.iva.t5.p.g();
            b(false);
        }
    }
}
