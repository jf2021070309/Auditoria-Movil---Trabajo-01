package com.amazon.aps.iva.ae0;

import java.util.List;
/* compiled from: context.kt */
/* loaded from: classes4.dex */
public final class n {
    public final l a;
    public final com.amazon.aps.iva.kd0.c b;
    public final com.amazon.aps.iva.oc0.k c;
    public final com.amazon.aps.iva.kd0.g d;
    public final com.amazon.aps.iva.kd0.h e;
    public final com.amazon.aps.iva.kd0.a f;
    public final com.amazon.aps.iva.ce0.j g;
    public final i0 h;
    public final x i;

    public n(l lVar, com.amazon.aps.iva.kd0.c cVar, com.amazon.aps.iva.oc0.k kVar, com.amazon.aps.iva.kd0.g gVar, com.amazon.aps.iva.kd0.h hVar, com.amazon.aps.iva.kd0.a aVar, com.amazon.aps.iva.ce0.j jVar, i0 i0Var, List<com.amazon.aps.iva.id0.r> list) {
        com.amazon.aps.iva.yb0.j.f(lVar, "components");
        com.amazon.aps.iva.yb0.j.f(cVar, "nameResolver");
        com.amazon.aps.iva.yb0.j.f(kVar, "containingDeclaration");
        com.amazon.aps.iva.yb0.j.f(gVar, "typeTable");
        com.amazon.aps.iva.yb0.j.f(hVar, "versionRequirementTable");
        com.amazon.aps.iva.yb0.j.f(aVar, "metadataVersion");
        this.a = lVar;
        this.b = cVar;
        this.c = kVar;
        this.d = gVar;
        this.e = hVar;
        this.f = aVar;
        this.g = jVar;
        this.h = new i0(this, i0Var, list, "Deserializer for \"" + kVar.getName() + '\"', (jVar == null || (r2 = jVar.a()) == null) ? "[container not found]" : "[container not found]");
        this.i = new x(this);
    }

    public final n a(com.amazon.aps.iva.oc0.k kVar, List<com.amazon.aps.iva.id0.r> list, com.amazon.aps.iva.kd0.c cVar, com.amazon.aps.iva.kd0.g gVar, com.amazon.aps.iva.kd0.h hVar, com.amazon.aps.iva.kd0.a aVar) {
        com.amazon.aps.iva.kd0.h hVar2;
        com.amazon.aps.iva.yb0.j.f(kVar, "descriptor");
        com.amazon.aps.iva.yb0.j.f(cVar, "nameResolver");
        com.amazon.aps.iva.yb0.j.f(gVar, "typeTable");
        com.amazon.aps.iva.yb0.j.f(hVar, "versionRequirementTable");
        com.amazon.aps.iva.yb0.j.f(aVar, "metadataVersion");
        l lVar = this.a;
        boolean z = true;
        int i = aVar.b;
        if ((i != 1 || aVar.c < 4) && i <= 1) {
            z = false;
        }
        if (z) {
            hVar2 = hVar;
        } else {
            hVar2 = this.e;
        }
        return new n(lVar, cVar, kVar, gVar, hVar2, aVar, this.g, this.h, list);
    }
}
