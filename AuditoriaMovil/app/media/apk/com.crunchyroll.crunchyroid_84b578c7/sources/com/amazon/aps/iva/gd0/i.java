package com.amazon.aps.iva.gd0;

import com.amazon.aps.iva.gd0.h;
import com.amazon.aps.iva.oc0.t0;
import com.amazon.aps.iva.sd0.t;
import java.util.HashMap;
import java.util.List;
/* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
/* loaded from: classes4.dex */
public final class i extends h.a {
    public final HashMap<com.amazon.aps.iva.nd0.f, com.amazon.aps.iva.sd0.g<?>> b;
    public final /* synthetic */ h c;
    public final /* synthetic */ com.amazon.aps.iva.oc0.e d;
    public final /* synthetic */ com.amazon.aps.iva.nd0.b e;
    public final /* synthetic */ List<com.amazon.aps.iva.pc0.c> f;
    public final /* synthetic */ t0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, com.amazon.aps.iva.oc0.e eVar, com.amazon.aps.iva.nd0.b bVar, List<com.amazon.aps.iva.pc0.c> list, t0 t0Var) {
        super();
        this.c = hVar;
        this.d = eVar;
        this.e = bVar;
        this.f = list;
        this.g = t0Var;
        this.b = new HashMap<>();
    }

    @Override // com.amazon.aps.iva.gd0.t.a
    public final void a() {
        boolean z;
        com.amazon.aps.iva.sd0.t tVar;
        HashMap<com.amazon.aps.iva.nd0.f, com.amazon.aps.iva.sd0.g<?>> hashMap = this.b;
        h hVar = this.c;
        hVar.getClass();
        com.amazon.aps.iva.nd0.b bVar = this.e;
        com.amazon.aps.iva.yb0.j.f(bVar, "annotationClassId");
        com.amazon.aps.iva.yb0.j.f(hashMap, "arguments");
        if (com.amazon.aps.iva.yb0.j.a(bVar, com.amazon.aps.iva.kc0.b.b)) {
            com.amazon.aps.iva.sd0.g<?> gVar = hashMap.get(com.amazon.aps.iva.nd0.f.h("value"));
            t.a.b bVar2 = null;
            if (gVar instanceof com.amazon.aps.iva.sd0.t) {
                tVar = (com.amazon.aps.iva.sd0.t) gVar;
            } else {
                tVar = null;
            }
            if (tVar != null) {
                T t = tVar.a;
                if (t instanceof t.a.b) {
                    bVar2 = (t.a.b) t;
                }
                if (bVar2 != null) {
                    z = hVar.p(bVar2.a.a);
                    if (!z || hVar.p(bVar)) {
                        return;
                    }
                    this.f.add(new com.amazon.aps.iva.pc0.d(this.d.m(), hashMap, this.g));
                }
            }
        }
        z = false;
        if (!z) {
            return;
        }
        this.f.add(new com.amazon.aps.iva.pc0.d(this.d.m(), hashMap, this.g));
    }

    @Override // com.amazon.aps.iva.gd0.h.a
    public final void g(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.sd0.g<?> gVar) {
        if (fVar != null) {
            this.b.put(fVar, gVar);
        }
    }
}
