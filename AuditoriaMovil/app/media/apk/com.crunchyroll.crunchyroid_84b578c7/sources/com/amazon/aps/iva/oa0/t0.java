package com.amazon.aps.iva.oa0;
/* compiled from: SingularInstance.java */
/* loaded from: classes4.dex */
public final class t0 implements Runnable {
    public final /* synthetic */ u0 b;

    public t0(u0 u0Var) {
        this.b = u0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m0 m0Var = this.b.e;
        int i = f1.b;
        m0Var.b(System.currentTimeMillis());
    }
}
