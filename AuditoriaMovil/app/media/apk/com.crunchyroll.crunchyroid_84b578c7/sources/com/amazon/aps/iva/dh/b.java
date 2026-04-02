package com.amazon.aps.iva.dh;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.yb0.j;
/* compiled from: EligibilityModule.kt */
/* loaded from: classes.dex */
public final class b implements a {
    public final f a;
    public final d b;

    public b(com.amazon.aps.iva.ch.b bVar, h hVar) {
        j.f(bVar, "dependencies");
        com.amazon.aps.iva.fh.d dVar = new com.amazon.aps.iva.fh.d(new com.amazon.aps.iva.fh.f(bVar.e(), bVar.g()), bVar.c());
        com.amazon.aps.iva.hh.c cVar = new com.amazon.aps.iva.hh.c(bVar.e());
        com.amazon.aps.iva.gh.b bVar2 = new com.amazon.aps.iva.gh.b(bVar.e());
        f fVar = new f(f1.K(new com.amazon.aps.iva.fh.b(dVar, bVar.c()), new com.amazon.aps.iva.hh.a(cVar), new com.amazon.aps.iva.gh.c(bVar2)), hVar, bVar2, bVar.b());
        this.a = fVar;
        this.b = new d(dVar, cVar, bVar2, hVar, fVar, bVar.f());
    }

    @Override // com.amazon.aps.iva.dh.a
    public final e a() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.dh.a
    public final c d() {
        return this.b;
    }
}
