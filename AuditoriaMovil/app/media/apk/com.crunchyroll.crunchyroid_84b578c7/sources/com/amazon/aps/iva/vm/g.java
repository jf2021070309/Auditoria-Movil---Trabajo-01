package com.amazon.aps.iva.vm;

import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: SwitchProfileScreenController.kt */
/* loaded from: classes2.dex */
public final class g extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.um.e, com.amazon.aps.iva.um.e> {
    public final /* synthetic */ com.amazon.aps.iva.em.b h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.amazon.aps.iva.em.b bVar) {
        super(1);
        this.h = bVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.um.e invoke(com.amazon.aps.iva.um.e eVar) {
        com.amazon.aps.iva.wm.a aVar;
        boolean z;
        com.amazon.aps.iva.um.e eVar2 = eVar;
        j.f(eVar2, "$this$set");
        com.amazon.aps.iva.em.b bVar = this.h;
        List<com.amazon.aps.iva.em.a> list = bVar.b;
        ArrayList arrayList = new ArrayList(r.Y(list));
        for (com.amazon.aps.iva.em.a aVar2 : list) {
            String str = aVar2.b;
            String str2 = aVar2.d;
            String str3 = aVar2.e;
            String str4 = aVar2.c;
            if (j.a(aVar2.f, Boolean.TRUE)) {
                aVar = com.amazon.aps.iva.wm.a.SWITCH_PROFILE_SELECTED;
            } else {
                aVar = com.amazon.aps.iva.wm.a.SWITCH_PROFILE_DEFAULT;
            }
            com.amazon.aps.iva.wm.a aVar3 = aVar;
            Boolean bool = aVar2.f;
            Boolean bool2 = aVar2.g;
            if (bool2 != null) {
                z = bool2.booleanValue();
            } else {
                z = true;
            }
            arrayList.add(new com.amazon.aps.iva.ym.c(str, str4, str2, str3, aVar3, bool, false, z, 64));
        }
        ArrayList Z0 = x.Z0(arrayList);
        List<com.amazon.aps.iva.em.a> list2 = bVar.b;
        if (list2.size() < bVar.a) {
            Z0.add(new com.amazon.aps.iva.ym.c(null, null, null, null, com.amazon.aps.iva.wm.a.SWITCH_PROFILE_ADD, null, false, false, 239));
        }
        com.amazon.aps.iva.pe0.b<com.amazon.aps.iva.ym.c> p0 = com.amazon.aps.iva.ab.x.p0(Z0);
        ArrayList arrayList2 = new ArrayList(r.Y(p0));
        for (com.amazon.aps.iva.ym.c cVar : p0) {
            arrayList2.add(com.amazon.aps.iva.ym.c.a(cVar, com.amazon.aps.iva.aq.j.A(cVar, eVar2.c)));
        }
        Object obj = null;
        g.c cVar2 = new g.c(com.amazon.aps.iva.ab.x.p0(arrayList2), null);
        Iterator<T> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (j.a(((com.amazon.aps.iva.em.a) next).f, Boolean.TRUE)) {
                obj = next;
                break;
            }
        }
        com.amazon.aps.iva.em.a aVar4 = (com.amazon.aps.iva.em.a) obj;
        if (aVar4 == null) {
            aVar4 = (com.amazon.aps.iva.em.a) x.t0(list2);
        }
        return com.amazon.aps.iva.um.e.a(eVar2, cVar2, aVar4.e, false, 4);
    }
}
