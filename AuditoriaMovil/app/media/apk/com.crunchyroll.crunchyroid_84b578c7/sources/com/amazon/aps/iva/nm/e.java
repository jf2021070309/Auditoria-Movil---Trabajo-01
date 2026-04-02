package com.amazon.aps.iva.nm;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
/* compiled from: ProfilesDestinations.kt */
/* loaded from: classes2.dex */
public final class e extends l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
    public final /* synthetic */ com.amazon.aps.iva.ui.c<c> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.amazon.aps.iva.ui.c<c> cVar) {
        super(2);
        this.h = cVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            com.amazon.aps.iva.fm.g gVar = com.amazon.aps.iva.fm.g.f;
            if (gVar != null) {
                com.amazon.aps.iva.zl.b bVar2 = gVar.d;
                com.amazon.aps.iva.yb0.j.f(bVar2, "profilesGateway");
                com.amazon.aps.iva.ui.c<c> cVar = this.h;
                com.amazon.aps.iva.yb0.j.f(cVar, "navigator");
                com.amazon.aps.iva.zm.f.a(new com.amazon.aps.iva.zm.d(cVar, bVar2), iVar2, 0);
            } else {
                com.amazon.aps.iva.yb0.j.m("feature");
                throw null;
            }
        }
        return q.a;
    }
}
