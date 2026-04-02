package com.amazon.aps.iva.n0;
/* compiled from: Ripple.android.kt */
/* loaded from: classes.dex */
public final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ b h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(0);
        this.h = bVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        b bVar = this.h;
        bVar.i.setValue(Boolean.valueOf(!((Boolean) bVar.i.getValue()).booleanValue()));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
