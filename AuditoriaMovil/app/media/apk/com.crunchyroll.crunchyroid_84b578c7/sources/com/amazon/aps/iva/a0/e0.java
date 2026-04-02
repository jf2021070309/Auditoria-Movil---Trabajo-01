package com.amazon.aps.iva.a0;

import com.amazon.aps.iva.v1.p2;
/* compiled from: Focusable.kt */
/* loaded from: classes.dex */
public final class e0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.v1.v1, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ boolean h;
    public final /* synthetic */ com.amazon.aps.iva.c0.l i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(boolean z, com.amazon.aps.iva.c0.l lVar) {
        super(1);
        this.h = z;
        this.i = lVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.v1.v1 v1Var) {
        com.amazon.aps.iva.v1.v1 v1Var2 = v1Var;
        com.amazon.aps.iva.yb0.j.f(v1Var2, "$this$inspectable");
        Boolean valueOf = Boolean.valueOf(this.h);
        p2 p2Var = v1Var2.a;
        p2Var.b(valueOf, "enabled");
        p2Var.b(this.i, "interactionSource");
        return com.amazon.aps.iva.kb0.q.a;
    }
}
