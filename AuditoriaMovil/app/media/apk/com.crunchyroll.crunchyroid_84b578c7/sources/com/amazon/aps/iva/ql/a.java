package com.amazon.aps.iva.ql;

import com.amazon.aps.iva.cj.n;
import com.amazon.aps.iva.dj.f;
import com.amazon.aps.iva.kb0.q;
/* compiled from: InternalPlayerSettingsInteractor.kt */
/* loaded from: classes2.dex */
public interface a extends d {

    /* compiled from: InternalPlayerSettingsInteractor.kt */
    /* renamed from: com.amazon.aps.iva.ql.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0647a {
        public static b a() {
            g gVar = g.g;
            if (gVar != null) {
                com.amazon.aps.iva.dj.f.a.getClass();
                com.amazon.aps.iva.ml.d dVar = f.a.b.c;
                g gVar2 = g.g;
                if (gVar2 != null) {
                    com.amazon.aps.iva.cj.k kVar = n.d;
                    if (kVar != null) {
                        com.amazon.aps.iva.pm.b a = kVar.b().a();
                        com.amazon.aps.iva.yb0.j.f(dVar, "analytics");
                        com.amazon.aps.iva.yb0.j.f(a, "userProfileInteractor");
                        e eVar = new e(gVar2, dVar, a);
                        com.amazon.aps.iva.yb0.j.f(dVar, "analytics");
                        return new b(gVar, dVar, eVar);
                    }
                    com.amazon.aps.iva.yb0.j.m("dependencies");
                    throw null;
                }
                com.amazon.aps.iva.yb0.j.m("instance");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("instance");
            throw null;
        }
    }

    Object a(com.amazon.aps.iva.sl.g gVar, com.amazon.aps.iva.ob0.d<? super q> dVar);

    Object c(boolean z, com.amazon.aps.iva.ob0.d<? super q> dVar);
}
