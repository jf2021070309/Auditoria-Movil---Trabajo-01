package com.amazon.aps.iva.xd0;

import com.amazon.aps.iva.xd0.i;
import java.util.Collection;
/* compiled from: ResolutionScope.kt */
/* loaded from: classes4.dex */
public interface l {

    /* compiled from: ResolutionScope.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static Collection a(l lVar, d dVar, int i) {
            i.a.C0852a c0852a;
            if ((i & 1) != 0) {
                dVar = d.m;
            }
            if ((i & 2) != 0) {
                i.a.getClass();
                c0852a = i.a.b;
            } else {
                c0852a = null;
            }
            return lVar.e(dVar, c0852a);
        }
    }

    Collection<com.amazon.aps.iva.oc0.k> e(d dVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.nd0.f, Boolean> lVar);

    com.amazon.aps.iva.oc0.h g(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar);
}
