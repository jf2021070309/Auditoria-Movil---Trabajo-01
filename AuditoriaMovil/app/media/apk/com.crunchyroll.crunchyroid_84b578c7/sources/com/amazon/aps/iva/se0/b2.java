package com.amazon.aps.iva.se0;
/* compiled from: Executors.kt */
/* loaded from: classes4.dex */
public final class b2 implements Runnable {
    public final d0 b;
    public final m<com.amazon.aps.iva.kb0.q> c;

    public b2(d0 d0Var, n nVar) {
        this.b = d0Var;
        this.c = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.v(this.b, com.amazon.aps.iva.kb0.q.a);
    }
}
