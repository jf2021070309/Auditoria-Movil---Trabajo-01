package com.amazon.aps.iva.se0;
/* compiled from: CancellableContinuation.kt */
/* loaded from: classes4.dex */
public final class z1 extends f {
    public final com.amazon.aps.iva.xe0.h b;

    public z1(com.amazon.aps.iva.xe0.h hVar) {
        this.b = hVar;
    }

    @Override // com.amazon.aps.iva.se0.l
    public final void a(Throwable th) {
        this.b.n();
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final /* bridge */ /* synthetic */ com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        a(th);
        return com.amazon.aps.iva.kb0.q.a;
    }

    public final String toString() {
        return "RemoveOnCancel[" + this.b + ']';
    }
}
