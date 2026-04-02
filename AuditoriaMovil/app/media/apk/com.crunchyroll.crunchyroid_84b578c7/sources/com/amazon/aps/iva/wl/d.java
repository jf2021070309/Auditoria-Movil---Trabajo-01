package com.amazon.aps.iva.wl;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ve0.u0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PlayerSubtitlesProvider.kt */
/* loaded from: classes2.dex */
public final class d {
    public final com.amazon.aps.iva.lh.a a;
    public final com.amazon.aps.iva.ve0.f<com.amazon.aps.iva.jh.f> b;
    public final com.amazon.aps.iva.ve0.f<List<com.amazon.aps.iva.jh.f>> c;

    public d(com.amazon.aps.iva.lh.b bVar, u0 u0Var) {
        com.amazon.aps.iva.ve0.f<com.amazon.aps.iva.jh.f> e;
        com.amazon.aps.iva.ve0.f<List<com.amazon.aps.iva.jh.f>> e2;
        com.amazon.aps.iva.ve0.f m;
        this.a = bVar;
        com.amazon.aps.iva.jh.d dVar = com.amazon.aps.iva.jh.d.c;
        if (u0Var != null) {
            e = new a(u0Var, this);
        } else {
            e = x.e(dVar);
        }
        this.b = e;
        if (u0Var != null && (m = com.amazon.aps.iva.dg.b.m(new b(u0Var))) != null) {
            e2 = new c(m, this);
        } else {
            e2 = x.e(f1.J(dVar));
        }
        this.c = e2;
    }

    public static final ArrayList a(d dVar, List list) {
        com.amazon.aps.iva.jh.f b;
        dVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.amazon.aps.iva.qj.h hVar = (com.amazon.aps.iva.qj.h) it.next();
            if (!(hVar instanceof com.amazon.aps.iva.qj.f) && !dVar.a.a()) {
                b = null;
            } else {
                b = dVar.b(hVar);
            }
            if (b != null) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }

    public final com.amazon.aps.iva.jh.f b(com.amazon.aps.iva.qj.h hVar) {
        com.amazon.aps.iva.jh.f mVar;
        if (hVar instanceof com.amazon.aps.iva.qj.f) {
            return com.amazon.aps.iva.jh.d.c;
        }
        boolean z = hVar instanceof com.amazon.aps.iva.qj.g;
        com.amazon.aps.iva.lh.a aVar = this.a;
        if (z) {
            mVar = new com.amazon.aps.iva.jh.n(hVar.a(), aVar.getTitleForLanguage(hVar.a()));
        } else if (hVar instanceof com.amazon.aps.iva.qj.e) {
            mVar = new com.amazon.aps.iva.jh.m(hVar.a(), aVar.d(hVar.a()));
        } else {
            throw new IllegalArgumentException(hVar + " not supported!");
        }
        return mVar;
    }
}
