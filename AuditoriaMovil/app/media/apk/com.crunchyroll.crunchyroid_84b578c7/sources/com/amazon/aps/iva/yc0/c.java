package com.amazon.aps.iva.yc0;

import com.amazon.aps.iva.lb0.i0;
import com.amazon.aps.iva.lc0.o;
import com.amazon.aps.iva.xc0.d0;
import java.util.Map;
/* compiled from: JavaAnnotationMapper.kt */
/* loaded from: classes4.dex */
public final class c {
    public static final com.amazon.aps.iva.nd0.f a = com.amazon.aps.iva.nd0.f.h("message");
    public static final com.amazon.aps.iva.nd0.f b = com.amazon.aps.iva.nd0.f.h("allowedTargets");
    public static final com.amazon.aps.iva.nd0.f c = com.amazon.aps.iva.nd0.f.h("value");
    public static final Map<com.amazon.aps.iva.nd0.c, com.amazon.aps.iva.nd0.c> d = i0.U(new com.amazon.aps.iva.kb0.j(o.a.t, d0.c), new com.amazon.aps.iva.kb0.j(o.a.w, d0.d), new com.amazon.aps.iva.kb0.j(o.a.x, d0.f));

    public static com.amazon.aps.iva.zc0.g a(com.amazon.aps.iva.nd0.c cVar, com.amazon.aps.iva.ed0.d dVar, com.amazon.aps.iva.la0.c cVar2) {
        com.amazon.aps.iva.ed0.a h;
        com.amazon.aps.iva.yb0.j.f(cVar, "kotlinName");
        com.amazon.aps.iva.yb0.j.f(dVar, "annotationOwner");
        com.amazon.aps.iva.yb0.j.f(cVar2, "c");
        if (com.amazon.aps.iva.yb0.j.a(cVar, o.a.m)) {
            com.amazon.aps.iva.nd0.c cVar3 = d0.e;
            com.amazon.aps.iva.yb0.j.e(cVar3, "DEPRECATED_ANNOTATION");
            com.amazon.aps.iva.ed0.a h2 = dVar.h(cVar3);
            if (h2 == null) {
                dVar.D();
            } else {
                return new f(h2, cVar2);
            }
        }
        com.amazon.aps.iva.nd0.c cVar4 = d.get(cVar);
        if (cVar4 != null && (h = dVar.h(cVar4)) != null) {
            return b(cVar2, h, false);
        }
        return null;
    }

    public static com.amazon.aps.iva.zc0.g b(com.amazon.aps.iva.la0.c cVar, com.amazon.aps.iva.ed0.a aVar, boolean z) {
        com.amazon.aps.iva.yb0.j.f(aVar, "annotation");
        com.amazon.aps.iva.yb0.j.f(cVar, "c");
        com.amazon.aps.iva.nd0.b i = aVar.i();
        if (com.amazon.aps.iva.yb0.j.a(i, com.amazon.aps.iva.nd0.b.l(d0.c))) {
            return new j(aVar, cVar);
        }
        if (com.amazon.aps.iva.yb0.j.a(i, com.amazon.aps.iva.nd0.b.l(d0.d))) {
            return new i(aVar, cVar);
        }
        if (com.amazon.aps.iva.yb0.j.a(i, com.amazon.aps.iva.nd0.b.l(d0.f))) {
            return new b(cVar, aVar, o.a.x);
        }
        if (com.amazon.aps.iva.yb0.j.a(i, com.amazon.aps.iva.nd0.b.l(d0.e))) {
            return null;
        }
        return new com.amazon.aps.iva.bd0.d(cVar, aVar, z);
    }
}
