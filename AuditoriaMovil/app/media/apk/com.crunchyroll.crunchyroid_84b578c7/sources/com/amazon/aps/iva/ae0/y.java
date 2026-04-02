package com.amazon.aps.iva.ae0;

import java.util.List;
/* compiled from: MemberDeserializer.kt */
/* loaded from: classes4.dex */
public final class y extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<List<? extends com.amazon.aps.iva.pc0.c>> {
    public final /* synthetic */ x h;
    public final /* synthetic */ com.amazon.aps.iva.od0.p i;
    public final /* synthetic */ c j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(x xVar, com.amazon.aps.iva.od0.p pVar, c cVar) {
        super(0);
        this.h = xVar;
        this.i = pVar;
        this.j = cVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final List<? extends com.amazon.aps.iva.pc0.c> invoke() {
        List<com.amazon.aps.iva.pc0.c> list;
        x xVar = this.h;
        e0 a = xVar.a(xVar.a.c);
        if (a != null) {
            list = xVar.a.a.e.d(a, this.i, this.j);
        } else {
            list = null;
        }
        if (list == null) {
            return com.amazon.aps.iva.lb0.z.b;
        }
        return list;
    }
}
