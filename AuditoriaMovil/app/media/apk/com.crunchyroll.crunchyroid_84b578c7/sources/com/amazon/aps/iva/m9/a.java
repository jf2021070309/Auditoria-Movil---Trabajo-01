package com.amazon.aps.iva.m9;

import com.amazon.aps.iva.k9.m;
import com.amazon.aps.iva.t9.p;
/* compiled from: DelayedWorkTracker.java */
/* loaded from: classes.dex */
public final class a implements Runnable {
    public final /* synthetic */ p b;
    public final /* synthetic */ b c;

    public a(b bVar, p pVar) {
        this.c = bVar;
        this.b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m c = m.c();
        int i = b.d;
        p pVar = this.b;
        String.format("Scheduling work %s", pVar.a);
        c.a(new Throwable[0]);
        this.c.a.e(pVar);
    }
}
