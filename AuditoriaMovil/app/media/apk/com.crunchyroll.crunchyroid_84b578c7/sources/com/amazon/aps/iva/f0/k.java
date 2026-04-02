package com.amazon.aps.iva.f0;

import com.amazon.aps.iva.f0.m;
/* compiled from: LazyLayoutItemContentFactory.kt */
/* loaded from: classes.dex */
public final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.o0.v0, com.amazon.aps.iva.o0.u0> {
    public final /* synthetic */ m.a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m.a aVar) {
        super(1);
        this.h = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.o0.u0 invoke(com.amazon.aps.iva.o0.v0 v0Var) {
        com.amazon.aps.iva.yb0.j.f(v0Var, "$this$DisposableEffect");
        return new j(this.h);
    }
}
