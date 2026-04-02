package com.amazon.aps.iva.a0;
/* compiled from: Clickable.kt */
/* loaded from: classes.dex */
public final class u extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Boolean> {
    public final /* synthetic */ v h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar) {
        super(0);
        this.h = vVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Boolean invoke() {
        com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar = this.h.t;
        if (aVar != null) {
            aVar.invoke();
        }
        return Boolean.TRUE;
    }
}
