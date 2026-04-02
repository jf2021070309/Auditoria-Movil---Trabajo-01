package com.amazon.aps.iva.mc0;

import com.amazon.aps.iva.de0.l;
import com.amazon.aps.iva.lb0.b0;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.mc0.c;
import com.amazon.aps.iva.nd0.f;
import com.amazon.aps.iva.oc0.c0;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.oe0.q;
import com.amazon.aps.iva.rc0.g0;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: BuiltInFictitiousFunctionClassFactory.kt */
/* loaded from: classes4.dex */
public final class a implements com.amazon.aps.iva.qc0.b {
    public final l a;
    public final c0 b;

    public a(l lVar, g0 g0Var) {
        j.f(lVar, "storageManager");
        j.f(g0Var, "module");
        this.a = lVar;
        this.b = g0Var;
    }

    @Override // com.amazon.aps.iva.qc0.b
    public final com.amazon.aps.iva.oc0.e a(com.amazon.aps.iva.nd0.b bVar) {
        j.f(bVar, "classId");
        if (bVar.c || bVar.k()) {
            return null;
        }
        String b = bVar.i().b();
        if (!q.i0(b, "Function", false)) {
            return null;
        }
        com.amazon.aps.iva.nd0.c h = bVar.h();
        j.e(h, "classId.packageFqName");
        c.Companion.getClass();
        c.a.C0511a a = c.a.a(b, h);
        if (a == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.b.y(h).p()) {
            if (obj instanceof com.amazon.aps.iva.lc0.b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof com.amazon.aps.iva.lc0.e) {
                arrayList2.add(next);
            }
        }
        com.amazon.aps.iva.lc0.b bVar2 = (com.amazon.aps.iva.lc0.e) x.v0(arrayList2);
        if (bVar2 == null) {
            bVar2 = (com.amazon.aps.iva.lc0.b) x.t0(arrayList);
        }
        return new b(this.a, bVar2, a.a, a.b);
    }

    @Override // com.amazon.aps.iva.qc0.b
    public final boolean b(com.amazon.aps.iva.nd0.c cVar, f fVar) {
        j.f(cVar, "packageFqName");
        j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        String b = fVar.b();
        j.e(b, "name.asString()");
        if (!m.h0(b, "Function", false) && !m.h0(b, "KFunction", false) && !m.h0(b, "SuspendFunction", false) && !m.h0(b, "KSuspendFunction", false)) {
            return false;
        }
        c.Companion.getClass();
        if (c.a.a(b, cVar) == null) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.qc0.b
    public final Collection<com.amazon.aps.iva.oc0.e> c(com.amazon.aps.iva.nd0.c cVar) {
        j.f(cVar, "packageFqName");
        return b0.b;
    }
}
