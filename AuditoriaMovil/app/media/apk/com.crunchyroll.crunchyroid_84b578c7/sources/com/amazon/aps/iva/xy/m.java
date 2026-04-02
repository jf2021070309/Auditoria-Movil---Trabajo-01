package com.amazon.aps.iva.xy;

import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.qo.x;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
/* compiled from: FlowExtensions.kt */
/* loaded from: classes2.dex */
public final class m {
    public static final b a(com.amazon.aps.iva.ve0.f fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "<this>");
        return new b(new a(fVar));
    }

    public static final <T> T b(com.amazon.aps.iva.az.b<com.amazon.aps.iva.ez.g<T>> bVar) {
        g.c<T> a;
        com.amazon.aps.iva.yb0.j.f(bVar, "<this>");
        com.amazon.aps.iva.ez.g<T> value = bVar.getValue();
        if (value != null && (a = value.a()) != null) {
            return a.a;
        }
        return null;
    }

    public static com.amazon.aps.iva.az.d c(com.amazon.aps.iva.ve0.f fVar, g0 g0Var, g.b bVar, com.amazon.aps.iva.so.k kVar, p pVar, int i) {
        g gVar;
        if ((i & 2) != 0) {
            bVar = null;
        }
        p pVar2 = kVar;
        if ((i & 4) != 0) {
            pVar2 = new f(null);
        }
        if ((i & 8) != 0) {
            gVar = new g(null);
        } else {
            gVar = null;
        }
        com.amazon.aps.iva.yb0.j.f(fVar, "<this>");
        com.amazon.aps.iva.yb0.j.f(pVar2, "mapLoading");
        com.amazon.aps.iva.yb0.j.f(gVar, "mapFailure");
        return new com.amazon.aps.iva.az.d(bVar, new h(pVar2, gVar, pVar, null), g0Var, fVar);
    }

    public static com.amazon.aps.iva.az.d d(com.amazon.aps.iva.ve0.f fVar, g0 g0Var, x.c cVar, p pVar, int i) {
        com.amazon.aps.iva.xb0.l lVar = cVar;
        if ((i & 4) != 0) {
            lVar = k.h;
        }
        com.amazon.aps.iva.yb0.j.f(lVar, "handleException");
        return new com.amazon.aps.iva.az.d(null, new l(pVar, lVar, null), g0Var, fVar);
    }
}
