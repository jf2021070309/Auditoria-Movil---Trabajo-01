package com.amazon.aps.iva.r4;

import com.amazon.aps.iva.p4.n;
/* compiled from: Utils.kt */
/* loaded from: classes.dex */
public final class v0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.y4.k, n.c, com.amazon.aps.iva.y4.k> {
    public static final v0 h = new v0();

    public v0() {
        super(2);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.amazon.aps.iva.y4.k, com.amazon.aps.iva.p4.n$c, java.lang.Object] */
    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.y4.k invoke(com.amazon.aps.iva.y4.k kVar, n.c cVar) {
        n.c cVar2 = cVar;
        com.amazon.aps.iva.yb0.j.f(cVar2, "cur");
        if (cVar2 instanceof com.amazon.aps.iva.y4.k) {
            return cVar2;
        }
        return kVar;
    }
}
