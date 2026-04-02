package com.amazon.aps.iva.gd0;
/* compiled from: JavaClassDataFinder.kt */
/* loaded from: classes4.dex */
public final class m implements com.amazon.aps.iva.ae0.i {
    public final r a;
    public final l b;

    public m(com.amazon.aps.iva.tc0.f fVar, l lVar) {
        this.a = fVar;
        this.b = lVar;
    }

    @Override // com.amazon.aps.iva.ae0.i
    public final com.amazon.aps.iva.ae0.h a(com.amazon.aps.iva.nd0.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "classId");
        l lVar = this.b;
        t a = s.a(this.a, bVar, com.amazon.aps.iva.aq.j.E(lVar.c().c));
        if (a == null) {
            return null;
        }
        com.amazon.aps.iva.yb0.j.a(a.i(), bVar);
        return lVar.g(a);
    }
}
