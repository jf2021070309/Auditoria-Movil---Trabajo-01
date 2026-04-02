package com.amazon.aps.iva.se0;
/* compiled from: CancellableContinuation.kt */
/* loaded from: classes4.dex */
public final class u0 extends k {
    public final t0 b;

    public u0(t0 t0Var) {
        this.b = t0Var;
    }

    @Override // com.amazon.aps.iva.se0.l
    public final void a(Throwable th) {
        this.b.dispose();
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final /* bridge */ /* synthetic */ com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        a(th);
        return com.amazon.aps.iva.kb0.q.a;
    }

    public final String toString() {
        return "DisposeOnCancel[" + this.b + ']';
    }
}
