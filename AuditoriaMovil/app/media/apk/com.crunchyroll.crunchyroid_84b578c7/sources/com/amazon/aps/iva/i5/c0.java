package com.amazon.aps.iva.i5;
/* compiled from: Transformations.kt */
/* loaded from: classes.dex */
public final class c0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ u<Object> h;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<Object, Object> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(u<Object> uVar, com.amazon.aps.iva.xb0.l<Object, Object> lVar) {
        super(1);
        this.h = uVar;
        this.i = lVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Object obj) {
        this.h.k(this.i.invoke(obj));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
