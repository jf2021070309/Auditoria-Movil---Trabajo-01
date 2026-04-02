package com.amazon.aps.iva.nc0;

import com.amazon.aps.iva.ee0.d1;
import com.amazon.aps.iva.ee0.e1;
import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.lb0.i0;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.oc0.y0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: mappingUtil.kt */
/* loaded from: classes4.dex */
public final class v {
    public static final d1 a(com.amazon.aps.iva.oc0.e eVar, com.amazon.aps.iva.rc0.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "to");
        eVar.n().size();
        bVar.n().size();
        e1.a aVar = e1.b;
        List<y0> n = eVar.n();
        com.amazon.aps.iva.yb0.j.e(n, "from.declaredTypeParameters");
        List<y0> list = n;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list));
        for (y0 y0Var : list) {
            arrayList.add(y0Var.h());
        }
        List<y0> n2 = bVar.n();
        com.amazon.aps.iva.yb0.j.e(n2, "to.declaredTypeParameters");
        List<y0> list2 = n2;
        ArrayList arrayList2 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
        for (y0 y0Var2 : list2) {
            m0 m = y0Var2.m();
            com.amazon.aps.iva.yb0.j.e(m, "it.defaultType");
            arrayList2.add(com.amazon.aps.iva.da0.a.j(m));
        }
        return new d1(i0.Z(x.e1(arrayList, arrayList2)), false);
    }
}
