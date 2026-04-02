package com.amazon.aps.iva.i5;
/* compiled from: Transformations.kt */
/* loaded from: classes.dex */
public final class b0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ u<Object> h;
    public final /* synthetic */ com.amazon.aps.iva.yb0.z i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(u<Object> uVar, com.amazon.aps.iva.yb0.z zVar) {
        super(1);
        this.h = uVar;
        this.i = zVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Object obj) {
        u<Object> uVar = this.h;
        Object d = uVar.d();
        com.amazon.aps.iva.yb0.z zVar = this.i;
        if (zVar.b || ((d == null && obj != null) || (d != null && !com.amazon.aps.iva.yb0.j.a(d, obj)))) {
            zVar.b = false;
            uVar.k(obj);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
