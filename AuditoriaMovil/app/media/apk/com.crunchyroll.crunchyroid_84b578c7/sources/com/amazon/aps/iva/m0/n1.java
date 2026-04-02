package com.amazon.aps.iva.m0;

import com.amazon.aps.iva.m0.k;
import java.util.Map;
/* compiled from: ModalBottomSheet.kt */
/* loaded from: classes.dex */
public final class n1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.o2.j, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ f2 h;
    public final /* synthetic */ k.a<g2> i;
    public final /* synthetic */ float j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(f2 f2Var, k.a<g2> aVar, float f) {
        super(1);
        this.h = f2Var;
        this.i = aVar;
        this.j = f;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o2.j jVar) {
        long j = jVar.a;
        com.amazon.aps.iva.mb0.b bVar = new com.amazon.aps.iva.mb0.b();
        g2 g2Var = g2.Hidden;
        float f = this.j;
        bVar.put(g2Var, Float.valueOf(f));
        float f2 = f / 2.0f;
        f2 f2Var = this.h;
        if (!f2Var.b && com.amazon.aps.iva.o2.j.b(j) > f2) {
            bVar.put(g2.HalfExpanded, Float.valueOf(f2));
        }
        if (com.amazon.aps.iva.o2.j.b(j) != 0) {
            bVar.put(g2.Expanded, Float.valueOf(Math.max(0.0f, f - com.amazon.aps.iva.o2.j.b(j))));
        }
        bVar.c();
        boolean z = true;
        bVar.m = true;
        if (bVar.i <= 0) {
            bVar = com.amazon.aps.iva.mb0.b.n;
            com.amazon.aps.iva.yb0.j.d(bVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        }
        k<g2> kVar = f2Var.c;
        kVar.getClass();
        if (!com.amazon.aps.iva.yb0.j.a(kVar.b(), bVar)) {
            Map<g2, Float> b = kVar.b();
            Object value = kVar.h.getValue();
            boolean isEmpty = kVar.b().isEmpty();
            kVar.o.setValue(bVar);
            if (kVar.b().get(kVar.c()) == null) {
                z = false;
            }
            if (isEmpty && z) {
                kVar.h(kVar.c());
            } else {
                k.a<g2> aVar = this.i;
                if (aVar != null) {
                    aVar.a(value, b, bVar);
                }
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
