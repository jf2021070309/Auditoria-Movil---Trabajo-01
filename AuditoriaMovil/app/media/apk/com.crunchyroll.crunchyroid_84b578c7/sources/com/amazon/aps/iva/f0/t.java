package com.amazon.aps.iva.f0;

import com.amazon.aps.iva.o0.p3;
/* compiled from: LazyLayout.kt */
/* loaded from: classes.dex */
public final class t extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<p> {
    public final /* synthetic */ p3<com.amazon.aps.iva.xb0.a<p>> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(p3<? extends com.amazon.aps.iva.xb0.a<? extends p>> p3Var) {
        super(0);
        this.h = p3Var;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final p invoke() {
        return this.h.getValue().invoke();
    }
}
