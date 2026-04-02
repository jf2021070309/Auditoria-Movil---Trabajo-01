package com.amazon.aps.iva.j0;
/* compiled from: LongPressTextDragObserver.kt */
/* loaded from: classes.dex */
public final class z0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ g1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(g1 g1Var) {
        super(0);
        this.h = g1Var;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        this.h.onCancel();
        return com.amazon.aps.iva.kb0.q.a;
    }
}
