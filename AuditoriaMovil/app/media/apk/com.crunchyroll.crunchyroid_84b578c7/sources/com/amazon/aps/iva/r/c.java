package com.amazon.aps.iva.r;

import android.os.Looper;
/* compiled from: ArchTaskExecutor.java */
/* loaded from: classes.dex */
public final class c extends com.amazon.aps.iva.ab.a {
    public static volatile c b;
    public static final b c;
    public final d a = new d();

    static {
        new a();
        c = new b(0);
    }

    public static c s() {
        if (b != null) {
            return b;
        }
        synchronized (c.class) {
            if (b == null) {
                b = new c();
            }
        }
        return b;
    }

    public final boolean t() {
        this.a.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public final void u(Runnable runnable) {
        d dVar = this.a;
        if (dVar.c == null) {
            synchronized (dVar.a) {
                if (dVar.c == null) {
                    dVar.c = d.s(Looper.getMainLooper());
                }
            }
        }
        dVar.c.post(runnable);
    }
}
