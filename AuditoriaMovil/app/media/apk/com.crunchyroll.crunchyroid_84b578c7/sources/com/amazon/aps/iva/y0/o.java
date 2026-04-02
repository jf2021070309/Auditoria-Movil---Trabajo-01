package com.amazon.aps.iva.y0;
/* compiled from: Snapshot.kt */
/* loaded from: classes.dex */
public final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<k, Object> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<k, Object> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(com.amazon.aps.iva.xb0.l<? super k, Object> lVar) {
        super(1);
        this.h = lVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Object invoke(k kVar) {
        k kVar2 = kVar;
        com.amazon.aps.iva.yb0.j.f(kVar2, "invalid");
        h hVar = (h) this.h.invoke(kVar2);
        synchronized (m.c) {
            m.d = m.d.j(hVar.d());
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        }
        return hVar;
    }
}
