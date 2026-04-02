package com.amazon.aps.iva.nm;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
/* compiled from: ProfilesDestinations.kt */
/* loaded from: classes2.dex */
public final class h extends l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
    public final /* synthetic */ boolean h;
    public final /* synthetic */ com.amazon.aps.iva.ui.c<c> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(boolean z, com.amazon.aps.iva.ui.c<c> cVar) {
        super(2);
        this.h = z;
        this.i = cVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            iVar2.s(-492369756);
            Object t = iVar2.t();
            if (t == i.a.a) {
                com.amazon.aps.iva.fm.g gVar = com.amazon.aps.iva.fm.g.f;
                if (gVar != null) {
                    com.amazon.aps.iva.ui.c<c> cVar = this.i;
                    com.amazon.aps.iva.yb0.j.f(cVar, "navigator");
                    com.amazon.aps.iva.zl.b bVar2 = gVar.d;
                    com.amazon.aps.iva.yb0.j.f(bVar2, "profilesGateway");
                    com.amazon.aps.iva.vm.b bVar3 = new com.amazon.aps.iva.vm.b(cVar, bVar2);
                    iVar2.n(bVar3);
                    t = bVar3;
                } else {
                    com.amazon.aps.iva.yb0.j.m("feature");
                    throw null;
                }
            }
            iVar2.G();
            com.amazon.aps.iva.um.d.a((com.amazon.aps.iva.ri.b) t, this.h, iVar2, 6, 0);
        }
        return q.a;
    }
}
