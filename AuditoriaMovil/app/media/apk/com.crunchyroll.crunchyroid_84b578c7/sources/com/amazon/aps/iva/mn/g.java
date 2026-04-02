package com.amazon.aps.iva.mn;

import com.amazon.aps.iva.lb0.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
/* compiled from: SortAndFiltersInteractor.kt */
/* loaded from: classes2.dex */
public final class g {
    public final o a;
    public final e b;
    public final boolean c;

    public g(o oVar, e eVar) {
        com.amazon.aps.iva.yb0.j.f(oVar, "sorting");
        com.amazon.aps.iva.yb0.j.f(eVar, "filters");
        this.a = oVar;
        this.b = eVar;
        this.c = eVar.b().isEmpty();
    }

    public static g a(g gVar, o oVar, e eVar, int i) {
        if ((i & 1) != 0) {
            oVar = gVar.a;
        }
        if ((i & 2) != 0) {
            eVar = gVar.b;
        }
        com.amazon.aps.iva.yb0.j.f(oVar, "sorting");
        com.amazon.aps.iva.yb0.j.f(eVar, "filters");
        return new g(oVar, eVar);
    }

    public final LinkedHashMap b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.b.b());
        o oVar = this.a;
        arrayList.add(oVar.a);
        arrayList.add(oVar.b);
        Iterator it = x.r0(arrayList).iterator();
        while (it.hasNext()) {
            linkedHashMap.putAll(((l) it.next()).getUrlParams());
        }
        return linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, gVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, gVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SortAndFilters(sorting=" + this.a + ", filters=" + this.b + ")";
    }
}
