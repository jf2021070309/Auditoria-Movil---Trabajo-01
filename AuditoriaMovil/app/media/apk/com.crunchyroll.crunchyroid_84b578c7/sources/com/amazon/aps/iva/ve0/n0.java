package com.amazon.aps.iva.ve0;
/* compiled from: SharedFlow.kt */
/* loaded from: classes4.dex */
public final class n0 extends com.amazon.aps.iva.we0.c<l0<?>> {
    public long a = -1;
    public com.amazon.aps.iva.se0.n b;

    @Override // com.amazon.aps.iva.we0.c
    public final boolean a(com.amazon.aps.iva.we0.b bVar) {
        l0 l0Var = (l0) bVar;
        if (this.a >= 0) {
            return false;
        }
        long j = l0Var.j;
        if (j < l0Var.k) {
            l0Var.k = j;
        }
        this.a = j;
        return true;
    }

    @Override // com.amazon.aps.iva.we0.c
    public final com.amazon.aps.iva.ob0.d[] b(com.amazon.aps.iva.we0.b bVar) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((l0) bVar).v(j);
    }
}
