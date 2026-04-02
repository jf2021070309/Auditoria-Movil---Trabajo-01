package com.amazon.aps.iva.r10;

import java.util.ArrayList;
/* compiled from: HistoryCardOverflowMenuProvider.kt */
/* loaded from: classes2.dex */
public final class i implements com.amazon.aps.iva.n70.d<l> {
    public final com.amazon.aps.iva.xb0.l<l, com.amazon.aps.iva.kb0.q> a;
    public final com.amazon.aps.iva.xb0.l<l, com.amazon.aps.iva.kb0.q> b;
    public final com.amazon.aps.iva.xb0.l<l, com.amazon.aps.iva.kb0.q> c;

    public i(q qVar, r rVar, s sVar) {
        this.a = qVar;
        this.b = rVar;
        this.c = sVar;
    }

    @Override // com.amazon.aps.iva.n70.d
    /* renamed from: b */
    public final ArrayList a(l lVar) {
        com.amazon.aps.iva.a70.b bVar;
        com.amazon.aps.iva.yb0.j.f(lVar, "data");
        ArrayList arrayList = new ArrayList();
        com.amazon.aps.iva.x50.t resourceType = lVar.a.getResourceType();
        com.amazon.aps.iva.yb0.j.f(resourceType, "<this>");
        int i = com.amazon.aps.iva.nt.h.a[resourceType.ordinal()];
        if (i != 1 && i != 2) {
            bVar = com.amazon.aps.iva.nt.l.e;
        } else {
            bVar = com.amazon.aps.iva.nt.g.e;
        }
        arrayList.add(new com.amazon.aps.iva.n70.b(bVar, new f(this, lVar)));
        arrayList.add(new com.amazon.aps.iva.n70.b(com.amazon.aps.iva.nt.m.e, new g(this, lVar)));
        arrayList.add(new com.amazon.aps.iva.n70.b(com.amazon.aps.iva.nt.i.e, new h(this, lVar)));
        return arrayList;
    }
}
