package com.amazon.aps.iva.xc0;

import com.amazon.aps.iva.ee0.f1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: AnnotationTypeQualifierResolver.kt */
/* loaded from: classes4.dex */
public final class e extends b<com.amazon.aps.iva.pc0.c> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(y yVar) {
        super(yVar);
        com.amazon.aps.iva.yb0.j.f(yVar, "javaTypeEnhancementState");
    }

    public static List m(com.amazon.aps.iva.sd0.g gVar) {
        if (gVar instanceof com.amazon.aps.iva.sd0.b) {
            ArrayList arrayList = new ArrayList();
            for (com.amazon.aps.iva.sd0.g gVar2 : (Iterable) ((com.amazon.aps.iva.sd0.b) gVar).a) {
                com.amazon.aps.iva.lb0.t.d0(arrayList, m(gVar2));
            }
            return arrayList;
        } else if (gVar instanceof com.amazon.aps.iva.sd0.j) {
            return f1.J(((com.amazon.aps.iva.sd0.j) gVar).c.c());
        } else {
            return com.amazon.aps.iva.lb0.z.b;
        }
    }

    @Override // com.amazon.aps.iva.xc0.b
    public final ArrayList a(Object obj, boolean z) {
        Iterable m;
        com.amazon.aps.iva.pc0.c cVar = (com.amazon.aps.iva.pc0.c) obj;
        com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
        Map<com.amazon.aps.iva.nd0.f, com.amazon.aps.iva.sd0.g<?>> a = cVar.a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<com.amazon.aps.iva.nd0.f, com.amazon.aps.iva.sd0.g<?>> entry : a.entrySet()) {
            com.amazon.aps.iva.nd0.f key = entry.getKey();
            com.amazon.aps.iva.sd0.g<?> value = entry.getValue();
            if (z && !com.amazon.aps.iva.yb0.j.a(key, d0.b)) {
                m = com.amazon.aps.iva.lb0.z.b;
            } else {
                m = m(value);
            }
            com.amazon.aps.iva.lb0.t.d0(arrayList, m);
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.xc0.b
    public final com.amazon.aps.iva.nd0.c e(com.amazon.aps.iva.pc0.c cVar) {
        com.amazon.aps.iva.pc0.c cVar2 = cVar;
        com.amazon.aps.iva.yb0.j.f(cVar2, "<this>");
        return cVar2.c();
    }

    @Override // com.amazon.aps.iva.xc0.b
    public final com.amazon.aps.iva.oc0.e f(Object obj) {
        com.amazon.aps.iva.pc0.c cVar = (com.amazon.aps.iva.pc0.c) obj;
        com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
        com.amazon.aps.iva.oc0.e d = com.amazon.aps.iva.ud0.b.d(cVar);
        com.amazon.aps.iva.yb0.j.c(d);
        return d;
    }

    @Override // com.amazon.aps.iva.xc0.b
    public final Iterable<com.amazon.aps.iva.pc0.c> g(com.amazon.aps.iva.pc0.c cVar) {
        com.amazon.aps.iva.pc0.h annotations;
        com.amazon.aps.iva.pc0.c cVar2 = cVar;
        com.amazon.aps.iva.yb0.j.f(cVar2, "<this>");
        com.amazon.aps.iva.oc0.e d = com.amazon.aps.iva.ud0.b.d(cVar2);
        if (d == null || (annotations = d.getAnnotations()) == null) {
            return com.amazon.aps.iva.lb0.z.b;
        }
        return annotations;
    }
}
