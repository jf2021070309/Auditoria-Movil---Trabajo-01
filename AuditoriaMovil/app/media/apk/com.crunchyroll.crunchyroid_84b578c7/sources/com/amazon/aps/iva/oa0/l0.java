package com.amazon.aps.iva.oa0;
/* compiled from: SessionManager.java */
/* loaded from: classes4.dex */
public final class l0 implements Runnable {
    public final /* synthetic */ long b;
    public final /* synthetic */ m0 c;

    public l0(m0 m0Var, long j) {
        this.c = m0Var;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m0 m0Var = this.c;
        m0Var.g = true;
        m0Var.c(this.b);
        m0Var.a();
    }
}
