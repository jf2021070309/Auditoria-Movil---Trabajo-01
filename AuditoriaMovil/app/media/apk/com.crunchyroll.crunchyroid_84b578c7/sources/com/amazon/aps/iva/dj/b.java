package com.amazon.aps.iva.dj;

import com.amazon.aps.iva.js.p;
import com.amazon.aps.iva.ks.w;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.x50.t;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: MediaPropertyFactory.kt */
/* loaded from: classes.dex */
public final class b implements a {
    @Override // com.amazon.aps.iva.dj.a
    public final com.amazon.aps.iva.ks.o a(com.amazon.aps.iva.qj.o oVar) {
        t.Companion.getClass();
        return new com.amazon.aps.iva.ks.o(c.a(t.a.a(oVar.d)), oVar.a, oVar.g, oVar.c);
    }

    @Override // com.amazon.aps.iva.dj.a
    public final w b(com.amazon.aps.iva.kk.c cVar) {
        String str;
        com.amazon.aps.iva.yb0.j.f(cVar, "metaContent");
        String str2 = cVar.b;
        t.Companion.getClass();
        p a = c.a(t.a.a(cVar.i));
        String str3 = cVar.h;
        String str4 = cVar.a;
        String str5 = cVar.e;
        String str6 = cVar.d;
        String str7 = cVar.c;
        ArrayList O = com.amazon.aps.iva.lb0.o.O(new String[]{str7, cVar.f, str5, str6});
        ArrayList arrayList = new ArrayList();
        Iterator it = O.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!com.amazon.aps.iva.oe0.m.b0((String) next)) {
                arrayList.add(next);
            }
        }
        String B0 = x.B0(arrayList, "|", null, null, null, 62);
        if (str7 == null) {
            str = "";
        } else {
            str = str7;
        }
        return new w(str2, a, str3, str4, null, str3, B0, str, cVar.f, cVar.d, cVar.e, null, null, cVar.w, Integer.valueOf((int) com.amazon.aps.iva.gr.n.E(Long.valueOf(cVar.s))), false);
    }

    @Override // com.amazon.aps.iva.dj.a
    public final w c(com.amazon.aps.iva.qj.o oVar) {
        String str;
        String str2;
        Integer num;
        boolean z;
        com.amazon.aps.iva.yb0.j.f(oVar, "metadataContent");
        String str3 = oVar.b;
        if (str3 == null) {
            str = "";
        } else {
            str = str3;
        }
        t.Companion.getClass();
        p a = c.a(t.a.a(oVar.d));
        String str4 = oVar.g;
        String str5 = oVar.a;
        String str6 = oVar.f;
        String str7 = oVar.e;
        String str8 = oVar.j;
        ArrayList O = com.amazon.aps.iva.lb0.o.O(new String[]{str8, oVar.h, str6, str7});
        ArrayList arrayList = new ArrayList();
        Iterator it = O.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!com.amazon.aps.iva.oe0.m.b0((String) next)) {
                arrayList.add(next);
            }
        }
        String B0 = x.B0(arrayList, "|", null, null, null, 62);
        if (str8 == null) {
            str2 = "";
        } else {
            str2 = str8;
        }
        String str9 = oVar.h;
        String str10 = oVar.e;
        String str11 = oVar.f;
        Long l = oVar.u;
        if (l != null) {
            num = Integer.valueOf((int) com.amazon.aps.iva.gr.n.E(l));
        } else {
            num = null;
        }
        Integer num2 = num;
        Boolean bool = oVar.x;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        boolean z2 = z;
        return new w(str, a, str4, str5, null, str4, B0, str2, str9, str10, str11, null, oVar.B, oVar.A, num2, z2);
    }
}
