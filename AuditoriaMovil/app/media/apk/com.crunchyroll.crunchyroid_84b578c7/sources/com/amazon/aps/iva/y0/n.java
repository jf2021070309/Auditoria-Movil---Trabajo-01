package com.amazon.aps.iva.y0;
/* compiled from: Snapshot.kt */
/* loaded from: classes.dex */
public final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> h;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> lVar2) {
        super(1);
        this.h = lVar;
        this.i = lVar2;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Object obj) {
        com.amazon.aps.iva.yb0.j.f(obj, "state");
        this.h.invoke(obj);
        this.i.invoke(obj);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
