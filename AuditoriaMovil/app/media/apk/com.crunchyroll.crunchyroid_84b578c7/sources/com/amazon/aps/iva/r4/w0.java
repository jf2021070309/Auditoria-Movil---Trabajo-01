package com.amazon.aps.iva.r4;

import com.amazon.aps.iva.p4.n;
/* compiled from: Utils.kt */
/* loaded from: classes.dex */
public final class w0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.y4.r, n.c, com.amazon.aps.iva.y4.r> {
    public static final w0 h = new w0();

    public w0() {
        super(2);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.amazon.aps.iva.p4.n$c, java.lang.Object, com.amazon.aps.iva.y4.r] */
    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.y4.r invoke(com.amazon.aps.iva.y4.r rVar, n.c cVar) {
        n.c cVar2 = cVar;
        com.amazon.aps.iva.yb0.j.f(cVar2, "cur");
        if (cVar2 instanceof com.amazon.aps.iva.y4.r) {
            return cVar2;
        }
        return rVar;
    }
}
