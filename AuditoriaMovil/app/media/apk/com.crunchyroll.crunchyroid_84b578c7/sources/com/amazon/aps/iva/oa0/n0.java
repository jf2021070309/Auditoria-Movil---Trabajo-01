package com.amazon.aps.iva.oa0;
/* compiled from: SingularExceptionReporter.java */
/* loaded from: classes4.dex */
public final class n0 implements Runnable {
    public final /* synthetic */ Boolean b;
    public final /* synthetic */ p0 c;

    public n0(p0 p0Var, Boolean bool) {
        this.c = p0Var;
        this.b = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p0 p0Var = this.c;
        try {
            p0Var.d = new y(p0Var.c, this.b);
        } catch (Throwable unused) {
        }
    }
}
