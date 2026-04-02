package com.amazon.aps.iva.l0;
/* compiled from: AndroidSelectionHandles.android.kt */
/* loaded from: classes.dex */
public final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.a2.c0, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ boolean h;
    public final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j, boolean z) {
        super(1);
        this.h = z;
        this.i = j;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.a2.c0 c0Var) {
        com.amazon.aps.iva.j0.h0 h0Var;
        com.amazon.aps.iva.a2.c0 c0Var2 = c0Var;
        com.amazon.aps.iva.yb0.j.f(c0Var2, "$this$semantics");
        com.amazon.aps.iva.a2.b0<n> b0Var = o.c;
        if (this.h) {
            h0Var = com.amazon.aps.iva.j0.h0.SelectionStart;
        } else {
            h0Var = com.amazon.aps.iva.j0.h0.SelectionEnd;
        }
        c0Var2.b(b0Var, new n(h0Var, this.i));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
