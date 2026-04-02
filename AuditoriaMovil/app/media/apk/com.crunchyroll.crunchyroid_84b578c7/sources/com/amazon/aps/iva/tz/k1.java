package com.amazon.aps.iva.tz;

import com.amazon.aps.iva.j8.h;
import com.amazon.aps.iva.tz.u0;
import com.ellation.crunchyroll.presentation.browse.a;
import java.util.ArrayList;
/* compiled from: PagedListFactory.kt */
/* loaded from: classes2.dex */
public final class k1 implements j1 {
    public final com.crunchyroll.connectivity.d a;
    public final com.amazon.aps.iva.xb0.a<m> b;
    public final y0 c;
    public final h.f d = new h.f(20, 20, true, 20);

    public k1(com.crunchyroll.connectivity.d dVar, u0.b bVar, z0 z0Var) {
        this.a = dVar;
        this.b = bVar;
        this.c = z0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [com.amazon.aps.iva.j8.e] */
    @Override // com.amazon.aps.iva.tz.j1
    public final com.amazon.aps.iva.j8.h a(com.amazon.aps.iva.mn.g gVar, ArrayList arrayList, a.b bVar, a.c cVar, a.d dVar) {
        f fVar;
        com.amazon.aps.iva.mn.m mVar = gVar.a.a;
        com.amazon.aps.iva.a00.b bVar2 = com.amazon.aps.iva.a00.b.Alphabetical;
        com.crunchyroll.connectivity.d dVar2 = this.a;
        com.amazon.aps.iva.xb0.a<m> aVar = this.b;
        if (mVar == bVar2) {
            y0 y0Var = this.c;
            com.amazon.aps.iva.yb0.j.f(y0Var, "browseSectionIndexer");
            f fVar2 = new f(aVar.invoke(), y0Var, gVar, arrayList, new m0(y0Var), bVar, cVar, dVar);
            dVar2.a(fVar2);
            fVar = fVar2;
        } else if (mVar == com.amazon.aps.iva.a00.b.NewlyAdded) {
            r rVar = new r(aVar.invoke(), this.c, gVar, arrayList, new j0(), bVar, cVar, dVar);
            dVar2.a(rVar);
            fVar = rVar;
        } else {
            v vVar = new v(aVar.invoke(), this.c, gVar, arrayList, bVar, cVar, dVar);
            dVar2.a(vVar);
            fVar = vVar;
        }
        h.d dVar3 = new h.d((com.amazon.aps.iva.j8.e) fVar, this.d);
        dVar3.d = com.amazon.aps.iva.vu.a.a;
        dVar3.c = com.amazon.aps.iva.vu.a.b;
        return dVar3.a();
    }
}
